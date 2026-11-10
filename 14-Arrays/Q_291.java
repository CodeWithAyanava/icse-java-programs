/*
 * ====================================================================
 *   Program  : Q_291
 *   Chapter  : 14 - Arrays
 *   Title    : Transpose of a Matrix
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept an m x n matrix and find its transpose
 *   (an n x m matrix in which the rows become columns). Display both
 *   matrices. If the number of rows or columns entered is less than
 *   1, display "Invalid size".
 * ====================================================================
 */

import java.util.Scanner;

public class Q_291
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

        int t[][] = new int[n][m];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                t[j][i] = a[i][j];

        System.out.println("Original matrix:");
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
                System.out.print(a[i][j] + "\t");
            System.out.println();
        }
        System.out.println("Transpose:");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
                System.out.print(t[i][j] + "\t");
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
 * | t                    | int[][]   | to store the transpose         |
 * +----------------------+-----------+--------------------------------+
 */
