/*
 * ====================================================================
 *   Program  : Q_290
 *   Chapter  : 14 - Arrays
 *   Title    : Largest and Smallest Element of a Matrix with Positions
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept an m x n matrix and find its largest
 *   and smallest elements along with their positions (row and column
 *   numbers, counting from 1; first occurrence). If the number of
 *   rows or columns entered is less than 1, display "Invalid size".
 * ====================================================================
 */

import java.util.Scanner;

public class Q_290
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

        int max = a[0][0], min = a[0][0];
        int mr = 0, mc = 0, nr = 0, nc = 0;
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (a[i][j] > max)
                {
                    max = a[i][j];
                    mr = i;
                    mc = j;
                }
                if (a[i][j] < min)
                {
                    min = a[i][j];
                    nr = i;
                    nc = j;
                }
            }
        }
        System.out.println("Largest  = " + max + " at row " + (mr + 1) + ", column " + (mc + 1));
        System.out.println("Smallest = " + min + " at row " + (nr + 1) + ", column " + (nc + 1));
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description               |
 * +----------------------+-----------+-------------------------------------+
 * | m                    | int       | to store the number of rows         |
 * | n                    | int       | to store the number of columns      |
 * | a                    | int[][]   | to store the matrix                 |
 * | i                    | int       | to act as the row index             |
 * | j                    | int       | to act as the column index          |
 * | max                  | int       | to store the largest element        |
 * | min                  | int       | to store the smallest element       |
 * | mr                   | int       | to store the row of the largest     |
 * | mc                   | int       | to store the column of the largest  |
 * | nr                   | int       | to store the row of the smallest    |
 * | nc                   | int       | to store the column of the smallest |
 * +----------------------+-----------+-------------------------------------+
 */
