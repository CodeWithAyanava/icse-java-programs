/*
 * ====================================================================
 *   Program  : Q_292
 *   Chapter  : 14 - Arrays
 *   Title    : Addition and Subtraction of Two Matrices
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept two matrices A and B of the same order
 *   m x n and display their sum (A + B) and difference (A - B). If
 *   the number of rows or columns entered is less than 1, display
 *   "Invalid size".
 * ====================================================================
 */

import java.util.Scanner;

public class Q_292
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
        int b[][] = new int[m][n];
        System.out.println("Enter matrix A:");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();
        System.out.println("Enter matrix B:");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                b[i][j] = sc.nextInt();

        System.out.println("A + B:");
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
                System.out.print((a[i][j] + b[i][j]) + "\t");
            System.out.println();
        }
        System.out.println("A - B:");
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
                System.out.print((a[i][j] - b[i][j]) + "\t");
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
 * | a                    | int[][]   | to store matrix a              |
 * | b                    | int[][]   | to store matrix b              |
 * | i                    | int       | to act as the row index        |
 * | j                    | int       | to act as the column index     |
 * +----------------------+-----------+--------------------------------+
 */
