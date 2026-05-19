package LLDs.LLDTheory.LLDesigns.BoardGames.TicTacToe;

public class Board {

    private int size;
    private Cell[][] grid;

    public Board(int size) {
        this.size = size;
        grid = new Cell[size][size];

        for(int i=0;i<size;i++) {
            for(int j=0;j<size;j++) {
                grid[i][j] = new Cell();
            }
        }
    }

    public Symbol symbolAt(int row,int col){
        return grid[row][col].getSymbol();
    }

    public boolean isValidMove(int row, int col) {
        return row >= 0 &&
               col >= 0 &&
               row < size &&
               col < size &&
               grid[row][col].isEmpty();
    }

    public void placeMove(int row, int col, Symbol symbol) {
        grid[row][col].setSymbol(symbol);
    }

    public int getSize(){
        return size;
    }
}
