package LLDs.LLDTheory.LLDesigns.BookMyShow;

import java.util.List;
import java.util.UUID;
import java.math.BigDecimal;

public class BookingService {

    private SeatLockProvider seatLockProvider;

    private PaymentService paymentService;

    public BookingService(SeatLockProvider seatLockProvider,PaymentService paymentService) {
        this.seatLockProvider = seatLockProvider;
        this.paymentService = paymentService;
    }


    /*
        IMPORTANT Senior-Level Discussion

        This workflow is transactional.

        Problems:
            payment success but booking fail
            lock expiration during payment
            duplicate retries
    */
    public Booking createBooking(User user,Show show,List<ShowSeat> seats) {

        // 1. Validate seats
        validateSeats(seats);

        // 2. Lock seats temporarily
        seatLockProvider.lockSeats(show,seats,user);

        try {

            // 3. Calculate total amount
            BigDecimal totalAmount =
                    calculateTotal(seats);

            // 4. Create payment
            Payment payment = paymentService.processPayment(user,totalAmount);

            // 5. Create booking object
            Booking booking = new Booking();

            booking.setBookingId(UUID.randomUUID().toString());

            booking.setUser(user);
            booking.setShow(show);
            booking.setSeats(seats);
            booking.setPayment(payment);

            // 6. If payment successful
            if(payment.getStatus()== PaymentStatus.SUCCESS) {

                // mark seats booked
                for(ShowSeat seat : seats) {
                    seat.setStatus(SeatStatus.BOOKED);
                }

                booking.setStatus( BookingStatus.CONFIRMED);

            } else {

                // payment failed
                booking.setStatus(BookingStatus.CANCELLED);

                // release locks
                seatLockProvider.unlockSeats(show,seats,user);
            }

            return booking;

        } catch(Exception ex) {

            // release locks on failure
            seatLockProvider.unlockSeats(show,seats,user);

            throw ex;
        }
    }

    private void validateSeats(List<ShowSeat> seats) {

        for(ShowSeat seat : seats) {
            if(seat.getStatus()!= SeatStatus.AVAILABLE) {

                throw new RuntimeException(
                        "Seat not available"
                );
            }
        }
    }

    private BigDecimal calculateTotal(List<ShowSeat> seats) {
        BigDecimal total = BigDecimal.ZERO;

        for(ShowSeat seat : seats) {
            total = total.add(seat.getPrice());
        }

        return total;
    }
}
