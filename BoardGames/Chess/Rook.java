package LLDs.LLDTheory.LLDesigns.BoardGames.Chess;

public class Rook extends Piece {

    public Rook(PieceColor color) {
        super(color);
    }

    @Override
    public boolean isValidMove(
            Board board,
            Position src,
            Position dest) {

        return src.getRow() == dest.getRow()
            || src.getCol() == dest.getCol();
    }
}