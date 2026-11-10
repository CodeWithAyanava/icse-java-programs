/*
 * ====================================================================
 *   Program  : Q_169
 *   Chapter  : 08 - Nested for Loops
 *   Title    : Sum of the Series 1! + 2! + 3! + ... + n!
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept n and find the sum of the series:
 *
 *       S = 1! + 2! + 3! + ... + n!
 *
 *   using nested loops (the inner loop calculates each factorial).
 *   Use long, and accept n only from 1 to 20.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_169
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (n < 1 || n > 20)
        {
            System.out.println("Invalid input");
        }
        else
        {
            long s = 0;
            for (int i = 1; i <= n; i++)
            {
                long f = 1;
                for (int j = 1; j <= i; j++)
                    f = f * j;
                s = s + f;
            }
            System.out.println("Sum = " + s);
        }
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
 * | f                    | long      | to store the factorial of i      |
 * | j                    | int       | to act as the inner loop counter |
 * +----------------------+-----------+----------------------------------+
 */
