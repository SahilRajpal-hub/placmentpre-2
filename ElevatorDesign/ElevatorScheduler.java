package LLDs.LLDTheory.LLDesigns.ElevatorDesign;

import java.util.List;

/*
    Why Strategy Pattern?
    Because scheduling algorithms can evolve:
        nearest elevator
        least busy elevator
        AI prediction
        zoned elevators
*/
public interface ElevatorScheduler {
    Elevator assignElevator(ExternalRequest request,List<Elevator> elevators);
}
