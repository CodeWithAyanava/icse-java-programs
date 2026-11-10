/*
 * ====================================================================
 *   Program  : Q_103
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : Factorial of a Number
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a number and find its factorial. n! =
 *   1 x 2 x 3 x ... x n, and 0! = 1. Use long; since 21! exceeds the
 *   range of long, display "Too large" for n greater than 20 and
 *   "Invalid input" for a negative number.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_103
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n < 0)
        {
            System.out.println("Invalid input");
        }
        else if (n > 20)
        {
            System.out.println("Too large");
        }
        else
        {
            long f = 1;
            for (int i = 1; i <= n; i++)
                f = f * i;
            System.out.println(n + "! = " + f);
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+----------------------------+
 * | Name of the Variable | Data Type | Purpose / Description      |
 * +----------------------+-----------+----------------------------+
 * | n                    | int       | to store the number        |
 * | f                    | long      | to store the factorial     |
 * | i                    | int       | to act as the loop counter |
 * +----------------------+-----------+----------------------------+
 */
