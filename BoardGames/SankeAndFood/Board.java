package LLDs.LLDTheory.LLDesigns.BoardGames.SankeAndFood;

public class Board {

    private int rows;
    private int cols;

    public Board(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
    }

    public boolean isInsideBoard(Position p) {

        return p.getRow() >= 0 &&
               p.getCol() >= 0 &&
               p.getRow() < rows &&
               p.getCol() < cols;
    }

    public int getRows(){
        return rows;
    }

    public int getCols(){
        return cols;
    }
}
