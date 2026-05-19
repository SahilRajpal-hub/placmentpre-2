package LLDs.LLDTheory.LLDesigns.BoardGames.TicTacToe;

public class Cell {
    private int row;
    private int col;
    private Symbol symbol;

    public boolean isEmpty() {
        return symbol == null;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public Symbol getSymbol() {
        return symbol;
    }
}
