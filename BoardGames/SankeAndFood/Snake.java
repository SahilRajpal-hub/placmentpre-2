package LLDs.LLDTheory.LLDesigns.BoardGames.SankeAndFood;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Snake {

    private Deque<Position> body;
    private Set<Position> occupiedCells;
    private Direction direction;

    public Snake(Position startPosition) {

        body = new LinkedList<>();
        occupiedCells = new HashSet<>();

        body.addFirst(startPosition);
        occupiedCells.add(startPosition);

        direction = Direction.RIGHT;
    }

    public Position getHead() {
        return body.peekFirst();
    }

    public Deque<Position> getBody() {
        return body;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Set<Position> getOccupiedCells(){
        return occupiedCells;
    }
}