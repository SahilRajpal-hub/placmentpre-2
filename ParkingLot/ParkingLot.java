package LLDs.LLDTheory.LLDesigns.ParkingLot;

import java.util.List;
import java.util.UUID;

public class ParkingLot {

    private List<ParkingFloor> floors;

    public Ticket parkVehicle(Vehicle vehicle) {

        for(ParkingFloor floor : floors) {

            ParkingSpot spot = floor.findAvailableSpot(vehicle);

            if(spot != null) {
                spot.parkVehicle(vehicle);
                return new Ticket(
                    UUID.randomUUID().toString(),
                    vehicle,
                    spot
                );
            }
        }

        throw new RuntimeException("Parking Full");
    }

    public void unparkVehicle(Ticket ticket) {
        ParkingSpot spot = ticket.getSpot();

        spot.removeVehicle();
    }
}
