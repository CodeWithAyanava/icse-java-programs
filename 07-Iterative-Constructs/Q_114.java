/*
 * ====================================================================
 *   Program  : Q_114
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : Sum of First n Natural Numbers and their Squares
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept n and find:
 *
 *       S1 = 1 + 2 + 3 + ... + n
 *       S2 = 1^2 + 2^2 + 3^2 + ... + n^2
 *
 *   using a loop. Verify the results with the formulas n(n + 1)/2
 *   and n(n + 1)(2n + 1)/6. Display "Invalid input" if n is less
 *   than 1.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_114
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        long n = sc.nextLong();

        if (n < 1)
        {
            System.out.println("Invalid input");
        }
        else
        {
            long s1 = 0, s2 = 0;
            for (long i = 1; i <= n; i++)
            {
                s1 = s1 + i;
                s2 = s2 + i * i;
            }
            System.out.println("S1 = " + s1 + "   (formula: " + (n * (n + 1) / 2) + ")");
            System.out.println("S2 = " + s2 + "   (formula: " + (n * (n + 1) * (2 * n + 1) / 6) + ")");
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description               |
 * +----------------------+-----------+-------------------------------------+
 * | n                    | long      | to store the number of terms        |
 * | s1                   | long      | to store the sum of natural numbers |
 * | s2                   | long      | to store the sum of squares         |
 * | i                    | long      | to act as the loop counter          |
 * +----------------------+-----------+-------------------------------------+
 */
