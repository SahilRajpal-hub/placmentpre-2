package LLDs.LLDTheory.LLDesigns.BoardGames.Chess;

public class Knight extends Piece {

    public Knight(PieceColor color) {
        super(color);
    }

    @Override
    public boolean isValidMove(
            Board board,
            Position src,
            Position dest) {

        int rowDiff =
            Math.abs(src.getRow() - dest.getRow());

        int colDiff =
            Math.abs(src.getCol() - dest.getCol());

        return (rowDiff == 2 && colDiff == 1)
            || (rowDiff == 1 && colDiff == 2);
    }
}