/*
 * ====================================================================
 *   Program  : Q_293
 *   Chapter  : 14 - Arrays
 *   Title    : Symmetric Matrix Check
 * --------------------------------------------------------------------
 *   Question :
 *
 *   A square matrix is said to be Symmetric if a[i][j] = a[j][i] for
 *   all i and j (it is equal to its own transpose). Write a program
 *   to accept a square matrix of order n and check whether it is
 *   symmetric. Display "Symmetric Matrix" or "Not a Symmetric
 *   Matrix". If the size entered is less than 1, display "Invalid
 *   size".
 * ====================================================================
 */

import java.util.Scanner;

public class Q_293
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the order of the square matrix: ");
        int n = sc.nextInt();
        if (n < 1)
        {
            System.out.println("Invalid size");
            return;
        }
        int a[][] = new int[n][n];
        System.out.println("Enter the elements row-wise:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();

        boolean sym = true;
        for (int i = 0; i < n && sym; i++)
        {
            for (int j = 0; j < i; j++)
            {
                if (a[i][j] != a[j][i])
                {
                    sym = false;
                    break;
                }
            }
        }
        if (sym)
            System.out.println("Symmetric Matrix");
        else
            System.out.println("Not a Symmetric Matrix");
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
 * | sym                  | boolean   | to record whether it is symmetric |
 * +----------------------+-----------+-----------------------------------+
 */
