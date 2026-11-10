/*
 * ====================================================================
 *   Program  : Q_299
 *   Chapter  : 14 - Arrays
 *   Title    : Matrix Multiplication
 * --------------------------------------------------------------------
 *   Question :
 *
 *   [Extra] Write a program to accept two matrices A (m x n) and B
 *   (p x q). If n is equal to p, find their product C = A x B, an m
 *   x q matrix with C[i][j] = sum of A[i][k] x B[k][j] for k = 0 to
 *   n - 1, and display it. Otherwise display "Multiplication not
 *   possible". If the number of rows or columns entered is less than
 *   1, display "Invalid size".
 * ====================================================================
 */

import java.util.Scanner;

public class Q_299
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns of A: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        if (m < 1 || n < 1)
        {
            System.out.println("Invalid size");
            return;
        }
        int a[][] = new int[m][n];
        System.out.println("Enter matrix A:");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();
        System.out.print("Enter rows and columns of B: ");
        int p = sc.nextInt();
        int q = sc.nextInt();
        if (p < 1 || q < 1)
        {
            System.out.println("Invalid size");
            return;
        }
        int b[][] = new int[p][q];
        System.out.println("Enter matrix B:");
        for (int i = 0; i < p; i++)
            for (int j = 0; j < q; j++)
                b[i][j] = sc.nextInt();

        if (n != p)
        {
            System.out.println("Multiplication not possible");
            return;
        }
        long c[][] = new long[m][q];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < q; j++)
                for (int k = 0; k < n; k++)
                    c[i][j] = c[i][j] + (long) a[i][k] * b[k][j];

        System.out.println("A x B:");
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < q; j++)
                System.out.print(c[i][j] + "\t");
            System.out.println();
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description         |
 * +----------------------+-----------+-------------------------------+
 * | m                    | int       | to store the rows of a        |
 * | n                    | int       | to store the columns of a     |
 * | a                    | int[][]   | to store matrix a             |
 * | i                    | int       | to act as the row index       |
 * | j                    | int       | to act as the column index    |
 * | p                    | int       | to store the rows of b        |
 * | q                    | int       | to store the columns of b     |
 * | b                    | int[][]   | to store matrix b             |
 * | c                    | long[][]  | to store the product          |
 * | k                    | int       | to act as the summation index |
 * +----------------------+-----------+-------------------------------+
 */
