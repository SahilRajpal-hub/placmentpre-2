package LLDs.LLDTheory.LLDesigns.ElevatorDesign;


/*
    Request Modelling : External requests require scheduling decisions, 
                        while internal requests are tied to a specific elevator
*/
public abstract class Request {

    protected int floor;

    public int getFloor() {
        return floor;
    }
}
