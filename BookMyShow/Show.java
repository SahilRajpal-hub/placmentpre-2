package LLDs.LLDTheory.LLDesigns.BookMyShow;

import java.time.LocalDateTime;
import java.util.List;

public class Show {

    private String showId;

    private Movie movie;

    private Screen screen;

    private LocalDateTime startTime;

    private List<ShowSeat> seats;
}
