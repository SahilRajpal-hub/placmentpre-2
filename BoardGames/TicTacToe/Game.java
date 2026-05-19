package LLDs.LLDTheory.LLDesigns.BoardGames.TicTacToe;

public class Game {

    private Board board;
    private Player[] players;
    private int currentPlayerIndex;
    private GameStatus status;
    private int movesPlayed;

    public Game(int size, Player p1, Player p2) {
        this.board = new Board(size);
        this.players = new Player[] { p1, p2 };
        this.status = GameStatus.IN_PROGRESS;
        this.currentPlayerIndex = 0;
    }

    public void makeMove(int row, int col) {

        Player currentPlayer = players[currentPlayerIndex];

        if (!board.isValidMove(row, col)) {
            throw new IllegalArgumentException("Invalid move");
        }

        board.placeMove(row, col, currentPlayer.getSymbol());

        movesPlayed++;

        if (checkWinner(row, col, currentPlayer)) {
            status = GameStatus.WIN;
            System.out.println(currentPlayer + " won");
            return;
        }

        if (movesPlayed == board.getSize() * board.getSize()) {
            status = GameStatus.DRAW;
            return;
        }

        currentPlayerIndex = (currentPlayerIndex + 1) % players.length;
    }


    /*
    
        Naive:

        scan entire board every move
        O(N²)

        Better:

        only check:
        row
        column
        diagonals

        Mention this optimization verbally.

    */
    private boolean checkWinner(int row, int col, Player player) {
        Symbol symbol = player.getSymbol();

        boolean rowMatch = true;
        boolean colMatch = true;
        boolean diagMatch = true;
        boolean antiDiagMatch = true;

        for (int i = 0; i < board.getSize(); i++) {

            if (board.symbolAt(row, i) != symbol)
                rowMatch = false;

            if (board.symbolAt(i, col) != symbol)
                colMatch = false;

            if (board.symbolAt(i, i) != symbol)
                diagMatch = false;

            if (board.symbolAt(i, board.getSize()-1-i) != symbol)
                antiDiagMatch = false;
        }

        return rowMatch || colMatch ||
                diagMatch || antiDiagMatch;
    }
}
