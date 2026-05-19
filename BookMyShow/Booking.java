package LLDs.LLDTheory.LLDesigns.BookMyShow;

import java.util.List;

public class Booking {

    private String bookingId;

    private User user;

    private Show show;

    private List<ShowSeat> seats;

    private BookingStatus status;

    private Payment payment;

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public void setSeats(List<ShowSeat> seats) {
        this.seats = seats;
    }

    public void setStatus(BookingStatus status) {
        this.status = status;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }


}
