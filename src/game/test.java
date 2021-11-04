package game;

import ChessClasses.ChessBoard;


public class test {
    public static void main(String[] args) {
        ChessBoard board = new ChessBoard();
        board.initBoard();

        for (int i = 0; i < board.getSquares().size() ; i++) {

            System.out.println(board.getSquares().get(i));

        }



    }
}
