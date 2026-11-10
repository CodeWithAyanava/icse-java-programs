/*
 * ====================================================================
 *   Program  : Q_122
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : Series 1, -3, 5, -7, 9, ... and its Sum
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept n and display the first n terms of the
 *   series 1, -3, 5, -7, 9, -11, ... and find their sum.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_122
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        long sum = 0;
        int sign = 1;

        for (int i = 1; i <= n; i++)
        {
            long term = sign * (2L * i - 1);
            System.out.print(term + " ");
            sum = sum + term;
            sign = -sign;
        }
        System.out.println();
        System.out.println("Sum = " + sum);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description         |
 * +----------------------+-----------+-------------------------------+
 * | n                    | int       | to store the number of terms  |
 * | sum                  | long      | to store the sum              |
 * | sign                 | int       | to store the sign of the term |
 * | i                    | int       | to act as the loop counter    |
 * | term                 | long      | to store the current term     |
 * +----------------------+-----------+-------------------------------+
 */
