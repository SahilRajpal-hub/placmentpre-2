package LLDs.LLDTheory.LLDesigns.BookMyShow;

import java.math.BigDecimal;


/*
    Why Separate ShowSeat?
    Because seat status changes per show.
*/
public class ShowSeat {

    private Seat seat;

    private SeatStatus status;

    private BigDecimal price;

    public Seat getSeat() {
        return seat;
    }

    public SeatStatus getStatus() {
        return status;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setStatus(SeatStatus status) {
        this.status = status;
    }




}
