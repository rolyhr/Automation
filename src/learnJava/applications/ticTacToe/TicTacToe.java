package learnJava.applications.ticTacToe;

public class TicTacToe {

    public static void main(String[] args) {
        char[][] gameBoard = {  {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'}
        };

        /*  Original Game Board
            {'1', '|', 2', '|', '3'},
            {'-', '+', -', '+', '-'},
            {'4', '|', 5', '|', '6'},
            {'-', '+', -', '+', '-'},
            {'7', '|', 8', '|', '9'}
        */

        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                System.out.print(gameBoard[i][j] + " ");
            }
            System.out.println();
        }
    }
}
