package LLDs.LLDTheory.LLDesigns.InventoryDesign;

import java.util.Map;

public class InventoryManager {

    private Map<String, InventoryItem> inventoryMap;


    // say “Reservation acts as temporary inventory ownership during checkout workflow.”
    public Reservation reserveInventory(Product product,int quantity) {

        InventoryItem item = inventoryMap.get(product.getSku());

        if (item.getAvailableQuantity() < quantity) {
            throw new RuntimeException("Insufficient Inventory");
        }

        item.setAvailableQuantity(item.getAvailableQuantity()- quantity);

        item.setReservedQuantity(item.getReservedQuantity() + quantity);

        Reservation reservation = new Reservation();

        reservation.setStatus(ReservationStatus.ACTIVE);

        return reservation;
    }


    /*
        Notice: available stock already reduced during reservation
        So on confirmation: only reserved quantity decreases
    */
    public void confirmReservation( Reservation reservation) {

        InventoryItem item = inventoryMap.get(reservation.getProduct().getSku());

        item.setReservedQuantity(item.getReservedQuantity()- reservation.getQuantity());

        reservation.setStatus(ReservationStatus.CONFIRMED);
    }


    /*
        On:
            order cancellation
            payment failure
            timeout
    */
    public void releaseReservation(Reservation reservation) {
        InventoryItem item = inventoryMap.get(reservation.getProduct().getSku());
        item.setAvailableQuantity(item.getAvailableQuantity() + reservation.getQuantity());
        item.setReservedQuantity(item.getReservedQuantity()- reservation.getQuantity());

        reservation.setStatus(ReservationStatus.RELEASED);
    }
}
