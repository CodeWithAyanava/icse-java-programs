/*
 * ====================================================================
 *   Program  : Q_170
 *   Chapter  : 08 - Nested for Loops
 *   Title    : Sum of the Series 1 + (1+2) + (1+2+3) + ...
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept n and find the sum of the series using
 *   nested loops:
 *
 *       S = 1 + (1 + 2) + (1 + 2 + 3) + ... + (1 + 2 + 3 + ... + n)
 * ====================================================================
 */

import java.util.Scanner;

public class Q_170
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        long s = 0;

        for (int i = 1; i <= n; i++)
        {
            long term = 0;
            for (int j = 1; j <= i; j++)
                term = term + j;
            s = s + term;
        }
        System.out.println("Sum = " + s);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+----------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description            |
 * +----------------------+-----------+----------------------------------+
 * | n                    | int       | to store the number of terms     |
 * | s                    | long      | to store the sum                 |
 * | i                    | int       | to control the terms             |
 * | term                 | long      | to store the current term        |
 * | j                    | int       | to act as the inner loop counter |
 * +----------------------+-----------+----------------------------------+
 */
