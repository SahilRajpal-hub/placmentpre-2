package LLDs.LLDTheory.LLDesigns.ParkingLot;

public class MediumSpot
        extends ParkingSpot {

    public MediumSpot(int id) {
        super(id, SpotType.MEDIUM);
    }

    @Override
    public boolean canFitVehicle(
            Vehicle vehicle) {

        return vehicle.getType() == VehicleType.CAR;
    }
}

/*

    Say: “I’m using polymorphism for spot fitting logic instead of conditional checks.”
    VERY important signal.

    BAD Design:
        if(vehicle.type == CAR)

*/