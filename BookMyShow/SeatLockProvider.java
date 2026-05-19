package LLDs.LLDTheory.LLDesigns.BookMyShow;

import java.util.List;


// say “Seat locking should remain isolated from booking workflow because locking strategy may evolve independently.”

public interface SeatLockProvider {

    void lockSeats(Show show,List<ShowSeat> seats,User user);

    void unlockSeats(Show show,List<ShowSeat> seats,User user);

    boolean validateLock(ShowSeat seat,User user);
}
