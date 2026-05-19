package LLDs.LLDTheory.LLDesigns.BookMyShow;


// “Seat state is explicitly modeled because booking workflow is highly stateful.”
public enum SeatStatus {
    AVAILABLE,

    LOCKED,

    BOOKED
}
