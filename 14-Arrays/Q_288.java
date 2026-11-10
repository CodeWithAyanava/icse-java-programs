/*
 * ====================================================================
 *   Program  : Q_288
 *   Chapter  : 14 - Arrays
 *   Title    : Row-wise and Column-wise Sums
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept an m x n matrix and display the sum of
 *   the elements of each row and of each column, along with the
 *   matrix.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_288
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

        for (int i = 0; i < m; i++)
        {
            int rs = 0;
            for (int j = 0; j < n; j++)
            {
                System.out.print(a[i][j] + "\t");
                rs = rs + a[i][j];
            }
            System.out.println("| Row " + (i + 1) + " sum = " + rs);
        }
        for (int j = 0; j < n; j++)
        {
            int cs = 0;
            for (int i = 0; i < m; i++)
                cs = cs + a[i][j];
            System.out.println("Column " + (j + 1) + " sum = " + cs);
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+--------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description          |
 * +----------------------+-----------+--------------------------------+
 * | m                    | int       | to store the number of rows    |
 * | n                    | int       | to store the number of columns |
 * | a                    | int[][]   | to store the matrix            |
 * | i                    | int       | to act as the row index        |
 * | j                    | int       | to act as the column index     |
 * | rs                   | int       | to store a row sum             |
 * | cs                   | int       | to store a column sum          |
 * +----------------------+-----------+--------------------------------+
 */
