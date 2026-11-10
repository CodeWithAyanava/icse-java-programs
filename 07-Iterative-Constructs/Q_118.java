/*
 * ====================================================================
 *   Program  : Q_118
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : Sum of the Series a/2 + a/5 + a/8 + ... n Terms
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a and n, and find the sum of the
 *   series:
 *
 *       S = a/2 + a/5 + a/8 + a/11 + ... up to n terms
 * ====================================================================
 */

import java.util.Scanner;

public class Q_118
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a and n: ");
        double a = sc.nextDouble();
        int n = sc.nextInt();
        double s = 0;
        int den = 2;

        for (int i = 1; i <= n; i++)
        {
            s = s + a / den;
            den = den + 3;
        }
        System.out.println("Sum = " + s);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+---------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description                 |
 * +----------------------+-----------+---------------------------------------+
 * | a                    | double    | to store the value of a               |
 * | n                    | int       | to store the number of terms          |
 * | s                    | double    | to store the sum                      |
 * | den                  | int       | to store the denominator of each term |
 * | i                    | int       | to act as the loop counter            |
 * +----------------------+-----------+---------------------------------------+
 */
