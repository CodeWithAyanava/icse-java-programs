/*
 * ====================================================================
 *   Program  : Q_297
 *   Chapter  : 14 - Arrays
 *   Title    : Row with the Largest Sum
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept an m x n matrix and find the row whose
 *   elements have the largest sum. Display each row sum and the row
 *   number with the largest sum (the first one in case of a tie).
 * ====================================================================
 */

import java.util.Scanner;

public class Q_297
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a[][] = new int[m][n];
        System.out.println("Enter the elements row-wise:");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();

        int best = 0;
        long bestSum = 0;
        for (int i = 0; i < m; i++)
        {
            long rs = 0;
            for (int j = 0; j < n; j++)
                rs = rs + a[i][j];
            System.out.println("Row " + (i + 1) + " sum = " + rs);
            if (i == 0 || rs > bestSum)
            {
                bestSum = rs;
                best = i;
            }
        }
        System.out.println("Row with the largest sum: Row " + (best + 1) + " (" + bestSum + ")");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+---------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description                 |
 * +----------------------+-----------+---------------------------------------+
 * | m                    | int       | to store the number of rows           |
 * | n                    | int       | to store the number of columns        |
 * | a                    | int[][]   | to store the matrix                   |
 * | i                    | int       | to act as the row index               |
 * | j                    | int       | to act as the column index            |
 * | best                 | int       | to store the row with the largest sum |
 * | bestSum              | long      | to store the largest row sum          |
 * | rs                   | long      | to store a row sum                    |
 * +----------------------+-----------+---------------------------------------+
 */
