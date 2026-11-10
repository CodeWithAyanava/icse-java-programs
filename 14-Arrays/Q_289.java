/*
 * ====================================================================
 *   Program  : Q_289
 *   Chapter  : 14 - Arrays
 *   Title    : Sum of the Left and Right Diagonals
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a square matrix of order n and find
 *   the sum of the elements of the left (principal) diagonal and of
 *   the right diagonal. If the size entered is less than 1, display
 *   "Invalid size".
 *
 *       Left diagonal  : a[i][i]
 *       Right diagonal : a[i][n - 1 - i]
 * ====================================================================
 */

import java.util.Scanner;

public class Q_289
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the order of the square matrix: ");
        int n = sc.nextInt();
        if (n < 1)
        {
            System.out.println("Invalid size");
            return;
        }
        int a[][] = new int[n][n];
        System.out.println("Enter the elements row-wise:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();

        int left = 0, right = 0;
        for (int i = 0; i < n; i++)
        {
            left = left + a[i][i];
            right = right + a[i][n - 1 - i];
        }
        System.out.println("Sum of left diagonal  = " + left);
        System.out.println("Sum of right diagonal = " + right);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+----------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description            |
 * +----------------------+-----------+----------------------------------+
 * | n                    | int       | to store the order of the matrix |
 * | a                    | int[][]   | to store the matrix              |
 * | i                    | int       | to act as the row index          |
 * | j                    | int       | to act as the column index       |
 * | left                 | int       | to store the left diagonal sum   |
 * | right                | int       | to store the right diagonal sum  |
 * +----------------------+-----------+----------------------------------+
 */
