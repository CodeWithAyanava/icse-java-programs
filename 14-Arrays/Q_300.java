/*
 * ====================================================================
 *   Program  : Q_300
 *   Chapter  : 14 - Arrays
 *   Title    : Magic Square Check
 * --------------------------------------------------------------------
 *   Question :
 *
 *   [Extra] A Magic Square is a square matrix in which the sum of
 *   every row, every column and both diagonals is the same. Write a
 *   program to accept a square matrix of order n and check whether
 *   it is a magic square. Display "Magic Square" (with the magic
 *   sum) or "Not a Magic Square".
 *
 *   Example:  2 7 6 9 5 1 4 3 8   (every sum is 15)
 * ====================================================================
 */

import java.util.Scanner;

public class Q_300
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

        int target = 0;
        for (int j = 0; j < n; j++)
            target = target + a[0][j];

        boolean magic = true;
        int d1 = 0, d2 = 0;
        for (int i = 0; i < n; i++)
        {
            int rs = 0, cs = 0;
            for (int j = 0; j < n; j++)
            {
                rs = rs + a[i][j];
                cs = cs + a[j][i];
            }
            if (rs != target || cs != target)
                magic = false;
            d1 = d1 + a[i][i];
            d2 = d2 + a[i][n - 1 - i];
        }
        if (d1 != target || d2 != target)
            magic = false;

        if (magic)
            System.out.println("Magic Square (magic sum = " + target + ")");
        else
            System.out.println("Not a Magic Square");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-----------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description             |
 * +----------------------+-----------+-----------------------------------+
 * | n                    | int       | to store the order of the matrix  |
 * | a                    | int[][]   | to store the matrix               |
 * | i                    | int       | to act as the row index           |
 * | j                    | int       | to act as the column index        |
 * | target               | int       | to store the sum of the first row |
 * | magic                | boolean   | to record whether it is magic     |
 * | d1                   | int       | to store the left diagonal sum    |
 * | d2                   | int       | to store the right diagonal sum   |
 * | rs                   | int       | to store a row sum                |
 * | cs                   | int       | to store a column sum             |
 * +----------------------+-----------+-----------------------------------+
 */
