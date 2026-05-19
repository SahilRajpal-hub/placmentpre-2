package LLDs.LLDTheory.LLDesigns.ParkingLot;

public abstract class ParkingSpot {

    private int id;

    private SpotType spotType;

    private Vehicle vehicle;

    public ParkingSpot(int id,
                       SpotType spotType) {

        this.id = id;
        this.spotType = spotType;
    }

    public boolean isAvailable() {
        return vehicle == null;
    }

    public void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void removeVehicle() {
        this.vehicle = null;
    }

    public abstract boolean canFitVehicle(Vehicle vehicle);
}
