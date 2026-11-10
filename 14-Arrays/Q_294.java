/*
 * ====================================================================
 *   Program  : Q_294
 *   Chapter  : 14 - Arrays
 *   Title    : Boundary Elements and their Sum
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept an m x n matrix and display only its
 *   boundary elements (first row, last row, first column and last
 *   column) in matrix form, with blanks in place of the inner
 *   elements. Also display the sum of the boundary elements.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_294
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

        int sum = 0;
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (i == 0 || i == m - 1 || j == 0 || j == n - 1)
                {
                    System.out.print(a[i][j] + "\t");
                    sum = sum + a[i][j];
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        System.out.println("Sum of boundary elements = " + sum);
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
 * | sum                  | int       | to store the sum of boundary elements |
 * +----------------------+-----------+---------------------------------------+
 */
