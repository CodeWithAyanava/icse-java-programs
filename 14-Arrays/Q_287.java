/*
 * ====================================================================
 *   Program  : Q_287
 *   Chapter  : 14 - Arrays
 *   Title    : Input and Display a Matrix
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept the number of rows m and columns n of
 *   a double dimensional array, accept its elements row-wise and
 *   display the array in matrix format. Display "Invalid size" if m
 *   or n is less than 1.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_287
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        if (m < 1 || n < 1)
        {
            System.out.println("Invalid size");
            return;
        }
        int a[][] = new int[m][n];
        System.out.println("Enter the elements row-wise:");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();

        System.out.println("The matrix is:");
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
                System.out.print(a[i][j] + "\t");
            System.out.println();
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
 * +----------------------+-----------+--------------------------------+
 */
