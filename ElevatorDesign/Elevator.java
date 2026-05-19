package LLDs.LLDTheory.LLDesigns.ElevatorDesign;

import java.util.TreeSet;

public class Elevator {

    private int id;

    private int currentFloor;

    private Direction direction;

    private ElevatorState state;

    private int capacity;

    private int currentLoad;

    private TreeSet<Integer> upStops;

    private TreeSet<Integer> downStops;

    /*
        Why TreeSet?
        Because:
            sorted stops
            efficient nearest retrieval
    */

    /*
        Why Separate Up/Down Stops?
        Because elevators usually behave like:
            SCAN/LOOK disk scheduling
            Continue in same direction before reversing.
    */



    public void addRequest(int floor) {
        if(floor > currentFloor) {
            upStops.add(floor);
        } else {
            downStops.add(floor);
        }
    }

    // “I’m using directional batching to avoid unnecessary elevator reversals.”
    public void move() {
        if(direction == Direction.UP) {

            if(!upStops.isEmpty()) {

                currentFloor++;

                if(upStops.contains(currentFloor)) {

                    openGate();

                    upStops.remove(currentFloor);
                }

            } else {

                direction = Direction.DOWN;
            }

        } else if(direction == Direction.DOWN) {

            if(!downStops.isEmpty()) {

                currentFloor--;

                if(downStops.contains(currentFloor)) {

                    openGate();

                    downStops.remove(currentFloor);
                }

            } else {

                direction = Direction.UP;
            }
        }
    }

    private void openGate(){
        // logic to open gate
    }

    public int getCurrentFloor(){
        return currentFloor;
    }

    public boolean canTakeMoreLoad() {
        return currentLoad < capacity;
    }
}
