package LLDs.LLDTheory.LLDesigns.ElevatorDesign;

import java.util.List;

public class NearestElevatorScheduler implements ElevatorScheduler {

    @Override
    public Elevator assignElevator(ExternalRequest request,List<Elevator> elevators) {

        Elevator best = null;

        int minDistance = Integer.MAX_VALUE;

        for(Elevator elevator : elevators) {
            // Scheduler should avoid overloaded elevators.
            if(!elevator.canTakeMoreLoad()) continue;

            // distance
            int distance = Math.abs(elevator.getCurrentFloor()- request.getFloor());

            // select nearest
            if(distance < minDistance) {

                minDistance = distance;
                best = elevator;
            }
        }

        return best;
    }
}