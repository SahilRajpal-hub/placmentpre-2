package LLDs.LLDTheory.LLDesigns.ElevatorDesign;

import java.util.List;

public class ElevatorSystem {

    private List<Elevator> elevators;

    private ElevatorScheduler scheduler;

    public void handleExternalRequest(ExternalRequest request) {
        Elevator elevator = scheduler.assignElevator(request,elevators);

        elevator.addRequest(request.getFloor());
    }

    public void handleInternalRequest(int elevatorId,InternalRequest request) {
        Elevator elevator = elevators.get(elevatorId);

        elevator.addRequest(request.getFloor());
    }
}
