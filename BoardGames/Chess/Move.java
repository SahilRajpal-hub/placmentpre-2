package LLDs.LLDTheory.LLDesigns.BoardGames.Chess;


/*
    VERY important for:
        undo
        replay
        audit
        checkmate analysis
*/
public class Move {

    private Player player;

    private Position source;
    private Position destination;

    private Piece movedPiece;
    private Piece killedPiece;

    public Position getSource(){
        return source;
    }

    public Position getDestination(){
        return destination;
    }
}
