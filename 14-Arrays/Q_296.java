/*
 * ====================================================================
 *   Program  : Q_296
 *   Chapter  : 14 - Arrays
 *   Title    : Even and Odd Elements of a Matrix
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept an m x n matrix of integers and find
 *   the count and the sum of its even elements and of its odd
 *   elements.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_296
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

        int ce = 0, co = 0;
        long se = 0, so = 0;
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (a[i][j] % 2 == 0)
                {
                    ce++;
                    se = se + a[i][j];
                }
                else
                {
                    co++;
                    so = so + a[i][j];
                }
            }
        }
        System.out.println("Even elements: count = " + ce + ", sum = " + se);
        System.out.println("Odd elements : count = " + co + ", sum = " + so);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-----------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description             |
 * +----------------------+-----------+-----------------------------------+
 * | m                    | int       | to store the number of rows       |
 * | n                    | int       | to store the number of columns    |
 * | a                    | int[][]   | to store the matrix               |
 * | i                    | int       | to act as the row index           |
 * | j                    | int       | to act as the column index        |
 * | ce                   | int       | to count the even elements        |
 * | co                   | int       | to count the odd elements         |
 * | se                   | long      | to store the sum of even elements |
 * | so                   | long      | to store the sum of odd elements  |
 * +----------------------+-----------+-----------------------------------+
 */
