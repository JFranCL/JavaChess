package ChessClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChessBoard {

    private ArrayList<ArrayList> squares;
    private final List<String> pieces = Arrays.asList("t","h","b","q","k","p");

    public ChessBoard() {
        this.squares = new ArrayList();
    }

    /**
     * Creates a new chessboard with all the pieces
     */
    public void initBoard(){


        for (int i = 0; i < 8; i++) {

            ArrayList row = new ArrayList() ;

            for (int j = 0; j < 8; j++) {
                switch (i){
                    case 1:
                        row.add(this.pieces.get(5));
                        break;

                    case 6:
                        row.add(this.pieces.get(5).toUpperCase());
                        break;

                    case 7:
                        row.add(this.pieces.get(j));

                    default:
                        row.add(' ');
                }

            }

            this.squares.add(row);
        }
    }


    // Getters and Setters
    public ArrayList getSquares() {
        return squares;
    }

    public void setSquares(ArrayList squares) {
        this.squares = squares;
    }
}
