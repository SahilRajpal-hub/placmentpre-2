package LLDs.LLDTheory.LLDesigns.ParkingLot;

import java.time.LocalDateTime;

public class Ticket {

    private String ticketId;

    private Vehicle vehicle;

    private ParkingSpot spot;

    private LocalDateTime entryTime;

    public Ticket(String ticketId,Vehicle vehicle,ParkingSpot spot) {

        this.ticketId = ticketId;
        this.vehicle = vehicle;
        this.spot = spot;

        this.entryTime = LocalDateTime.now();
    }

    public ParkingSpot getSpot(){
        return spot;
    }
}
