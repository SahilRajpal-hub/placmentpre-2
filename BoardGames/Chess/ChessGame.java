package LLDs.LLDTheory.LLDesigns.BoardGames.Chess;

import java.util.List;

public class ChessGame {

    private Board board;

    private Player whitePlayer;
    private Player blackPlayer;

    private Player currentTurn;

    private GameStatus status;

    private List<Move> moves;


    // core interview discussion here
    /*
        must say : 
            “makeMove() should only orchestrate.Actual movement rules belong to pieces.”
    */
    public boolean makeMove(Move move) {

        Piece piece = board.getCell(move.getSource()).getPiece();

        // no piece
        if(piece == null)
            return false;

        // wrong player turn
        if(piece.getColor() !=
        currentTurn.getColor())
            return false;

        // invalid movement
        if(!piece.isValidMove(board,move.getSource(),move.getDestination())) {
            return false;
        }

        executeMove(move);

        // check/checkmate logic

        switchTurn();

        return true;
    }
}
