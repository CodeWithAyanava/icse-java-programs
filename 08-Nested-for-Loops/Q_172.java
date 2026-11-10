/*
 * ====================================================================
 *   Program  : Q_172
 *   Chapter  : 08 - Nested for Loops
 *   Title    : Sum of the Series 1 - x^2/2! + x^4/4! - ...
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept x and n and find the sum of the first
 *   n terms of the series using nested loops:
 *
 *       S = 1 - x^2/2! + x^4/4! - x^6/6! + ...
 * ====================================================================
 */

import java.util.Scanner;

public class Q_172
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x and n: ");
        double x = sc.nextDouble();
        int n = sc.nextInt();
        double s = 0;
        int sign = 1;

        for (int i = 0; i < n; i++)
        {
            int p = 2 * i;
            double f = 1;
            for (int j = 1; j <= p; j++)
                f = f * j;
            s = s + sign * Math.pow(x, p) / f;
            sign = -sign;
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
 * | sign                 | int       | to store the sign of the term    |
 * | i                    | int       | to control the terms             |
 * | p                    | int       | to store the power of the term   |
 * | f                    | double    | to store the factorial of p      |
 * | j                    | int       | to act as the inner loop counter |
 * +----------------------+-----------+----------------------------------+
 */
