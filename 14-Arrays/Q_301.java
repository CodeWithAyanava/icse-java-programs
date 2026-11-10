/*
 * ====================================================================
 *   Program  : Q_301
 *   Chapter  : 14 - Arrays
 *   Title    : Tic-Tac-Toe Winner Checker
 * --------------------------------------------------------------------
 *   Question :
 *
 *   [Extra] Write a program to accept a finished tic-tac-toe board
 *   as a 3 x 3 character array (each cell X, O or - for empty),
 *   entered one row at a time as three characters separated by
 *   spaces. Display the board and check whether X or O has won
 *   (three of the same symbol in a row, a column or a diagonal).
 *   Display "X wins", "O wins" or "No winner".
 * ====================================================================
 */

import java.util.Scanner;

public class Q_301
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char b[][] = new char[3][3];
        System.out.println("Enter the board, row by row (X, O or -):");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                b[i][j] = Character.toUpperCase(sc.next().charAt(0));

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
                System.out.print(" " + b[i][j] + " ");
            System.out.println();
        }

        char winner = '-';
        for (int i = 0; i < 3; i++)
        {
            if (b[i][0] != '-' && b[i][0] == b[i][1] && b[i][1] == b[i][2])
                winner = b[i][0];
            if (b[0][i] != '-' && b[0][i] == b[1][i] && b[1][i] == b[2][i])
                winner = b[0][i];
        }
        if (b[1][1] != '-' && ((b[0][0] == b[1][1] && b[1][1] == b[2][2]) || (b[0][2] == b[1][1] && b[1][1] == b[2][0])))
            winner = b[1][1];

        if (winner == 'X' || winner == 'O')
            System.out.println(winner + " wins");
        else
            System.out.println("No winner");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-----------------------------+
 * | Name of the Variable | Data Type | Purpose / Description       |
 * +----------------------+-----------+-----------------------------+
 * | b                    | char[][]  | to store the board          |
 * | i                    | int       | to act as the row index     |
 * | j                    | int       | to act as the column index  |
 * | winner               | char      | to store the winning symbol |
 * +----------------------+-----------+-----------------------------+
 */
