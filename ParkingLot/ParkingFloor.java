package LLDs.LLDTheory.LLDesigns.ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {

    private int floorNumber;

    private List<ParkingSpot> spots;

    public ParkingFloor(int floorNumber) {

        this.floorNumber = floorNumber;

        spots = new ArrayList<>();
    }

    public ParkingSpot findAvailableSpot(Vehicle vehicle) {

        for(ParkingSpot spot : spots) {

            if(spot.isAvailable() && spot.canFitVehicle(vehicle)) {
                return spot;
            }
        }

        return null;
    }
}
