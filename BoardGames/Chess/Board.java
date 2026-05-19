package LLDs.LLDTheory.LLDesigns.BoardGames.Chess;

public class Board {

    private Cell[][] board;

    public Board() {
        board = new Cell[8][8];
        initializeBoard();
    }

    public Cell getCell(Position position) {
        return board[position.getRow()][position.getCol()];
    }

    void initializeBoard(){
        
    }
}
