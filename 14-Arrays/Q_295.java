/*
 * ====================================================================
 *   Program  : Q_295
 *   Chapter  : 14 - Arrays
 *   Title    : Upper and Lower Triangular Parts of a Matrix
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a square matrix of order n and
 *   display:
 *
 *       (a) the elements on and above the principal diagonal (upper
 *           triangular part), with 0 in place of the other elements
 *       (b) the elements on and below the principal diagonal (lower
 *           triangular part), with 0 in place of the other elements
 * ====================================================================
 */

import java.util.Scanner;

public class Q_295
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the order of the square matrix: ");
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        System.out.println("Enter the elements row-wise:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();

        System.out.println("Upper triangular part:");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (j >= i)
                    System.out.print(a[i][j] + "\t");
                else
                    System.out.print("0\t");
            }
            System.out.println();
        }
        System.out.println("Lower triangular part:");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (j <= i)
                    System.out.print(a[i][j] + "\t");
                else
                    System.out.print("0\t");
            }
            System.out.println();
        }
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
 * +----------------------+-----------+----------------------------------+
 */
