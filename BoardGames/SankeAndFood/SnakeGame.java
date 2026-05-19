package LLDs.LLDTheory.LLDesigns.BoardGames.SankeAndFood;

import java.util.Random;

public class SnakeGame {

    private Board board;
    private Snake snake;
    private Food food;
    private GameStatus status;
    private int score;

    public SnakeGame(int rows, int cols) {

        board = new Board(rows, cols);

        snake = new Snake(new Position(rows / 2, cols / 2));

        generateFood();

        status = GameStatus.RUNNING;
    }

    private Position getNextPosition(Position current,Direction direction) {

        int row = current.getRow();
        int col = current.getCol();

        switch (direction) {

            case UP:
                row--;
                break;

            case DOWN:
                row++;
                break;

            case LEFT:
                col--;
                break;

            case RIGHT:
                col++;
                break;
        }

        return new Position(row, col);
    }

    public void move() {

        Position currentHead = snake.getHead();

        Position newHead = getNextPosition(currentHead,snake.getDirection());

        // wall collision
        if (!board.isInsideBoard(newHead)) {
            status = GameStatus.OVER;
            return;
        }

        // self collision
        if (snake.getOccupiedCells().contains(newHead)) {
            status = GameStatus.OVER;
            return;
        }

        // add new head
        snake.getBody().addFirst(newHead);
        snake.getOccupiedCells().add(newHead);

        // food eaten
        /*
         * say: “Snake growth happens naturally because when food is eaten, we skip tail
         * removal.”
         */
        if (newHead.equals(food.getPosition())) {

            score++;
            generateFood();

        } else {

            // normal movement remove tail
            Position tail = snake.getBody().removeLast();

            snake.getOccupiedCells().remove(tail);
        }
    }

    private void generateFood() {

        Random random = new Random();

        while (true) {

            int row = random.nextInt(board.getRows());

            int col = random.nextInt(board.getCols());

            Position position = new Position(row, col);

            if (!snake.getOccupiedCells().contains(position)) {
                food = new Food(position);
                return;
            }
        }
    }


    // not used in our code but should be validated by controller layer
    public void changeDirection(Direction newDirection) {

        Direction current = snake.getDirection();

        if(current == Direction.UP && newDirection == Direction.DOWN)
            return;

        if(current == Direction.DOWN && newDirection == Direction.UP)
            return;

        if(current == Direction.LEFT && newDirection == Direction.RIGHT)
            return;

        if(current == Direction.RIGHT && newDirection == Direction.LEFT)
            return;

        snake.setDirection(newDirection);
    }
}