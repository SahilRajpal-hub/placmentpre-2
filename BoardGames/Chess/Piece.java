package LLDs.LLDTheory.LLDesigns.BoardGames.Chess;

public abstract class Piece {

    protected PieceColor color;

    public Piece(PieceColor color) {
        this.color = color;
    }

    public PieceColor getColor() {
        return color;
    }

    public abstract boolean isValidMove(
            Board board,
            Position source,
            Position destination
    );
}

/*

    MOST IMPORTANT DESIGN.
    Now movement behavior belongs to piece itself.This is:
        extensible
        maintainable
        follows OCP
*/