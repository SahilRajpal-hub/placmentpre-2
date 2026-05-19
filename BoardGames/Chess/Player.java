package LLDs.LLDTheory.LLDesigns.BoardGames.Chess;

public class Player {

    private String name;
    private PieceColor color;

    public Player(String name,
                  PieceColor color) {

        this.name = name;
        this.color = color;
    }


    public PieceColor getColor(){
        return color;
    }
}
