package ChessClasses;

import java.util.ArrayList;


public class ChessBoard {

    // Properties
    private ArrayList<ArrayList> squares;

    // Constructor
    public ChessBoard() {
        this.squares = new ArrayList();
    }

    // Methods
    /**
     * Creates a new chessboard with all the pieces in the starting position
     */
    public void initBoard(){


        for (int i = 0; i < 8; i++) {

            ArrayList row = new ArrayList() ;

            for (int j = 0; j < 8; j++) {

                if ( i == 0 ) {

                    if (j == 0 || j == 7) row.add('t'); // A tower is added to column 0 and 7
                    if (j == 1 || j == 6) row.add('h'); // A horse is added to column 1 and 6
                    if (j == 2 || j == 5) row.add('b'); // A bishop is added to column 2 and 5
                    if (j == 3) row.add('q'); // The queen is added to column 3
                    if (j == 4) row.add('k'); // The king is added to column 4

                    continue; // Goes to next loop iteration
                }

                if ( i == 1) {

                    row.add( 'p' ); // Pawns are added to row 1
                    continue; // Goes to next loop iteration

                }

                if ( i == 6) {

                    row.add( 'P' ); // Pawns are added to row 6
                    continue; // Goes to next loop iteration

                }

                if ( i == 7 ) {

                    if (j == 0 || j == 7) row.add('T'); // A tower is added to column 0 and 7
                    if (j == 1 || j == 6) row.add('H'); // A horse is added to column 1 and 6
                    if (j == 2 || j == 5) row.add('B'); // A bishop is added to column 2 and 5
                    if (j == 3) row.add('Q'); // The queen is added to column 3
                    if (j == 4) row.add('K'); // The king is added to column 4

                    continue; // Goes to next loop iteration
                }

                row.add(' ');

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
