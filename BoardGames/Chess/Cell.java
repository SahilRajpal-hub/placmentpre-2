package LLDs.LLDTheory.LLDesigns.BoardGames.Chess;

public class Cell {

    private Position position;
    private Piece piece;

    public boolean isEmpty() {
        return piece == null;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
}