/*
 * ====================================================================
 *   Program  : Q_171
 *   Chapter  : 08 - Nested for Loops
 *   Title    : Sum of the Series x/1! + x^2/2! + ... + x^n/n!
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept x and n and find the sum of the series
 *   using nested loops:
 *
 *       S = x/1! + x^2/2! + x^3/3! + ... + x^n/n!
 * ====================================================================
 */

import java.util.Scanner;

public class Q_171
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x and n: ");
        double x = sc.nextDouble();
        int n = sc.nextInt();
        double s = 0;

        for (int i = 1; i <= n; i++)
        {
            double f = 1;
            for (int j = 1; j <= i; j++)
                f = f * j;
            s = s + Math.pow(x, i) / f;
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
 * | x                    | double    | to store the value of x          |
 * | n                    | int       | to store the number of terms     |
 * | s                    | double    | to store the sum                 |
 * | i                    | int       | to control the terms             |
 * | f                    | double    | to store the factorial of i      |
 * | j                    | int       | to act as the inner loop counter |
 * +----------------------+-----------+----------------------------------+
 */
