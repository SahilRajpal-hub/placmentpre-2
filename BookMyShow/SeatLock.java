package LLDs.LLDTheory.LLDesigns.BookMyShow;

import java.time.Duration;
import java.time.LocalDateTime;

/*

    Without seat locking:
    User A books A1
    User B books A1 simultaneously
    Double booking occurs.


    Seat locking is temporary.
    Example:
        lock for 5 minutes
        if payment fails:
        release lock

*/

public class SeatLock {

    private ShowSeat seat;

    private User lockedBy;

    private LocalDateTime lockTime;

    private Duration timeout;
}
