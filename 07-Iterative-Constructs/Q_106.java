/*
 * ====================================================================
 *   Program  : Q_106
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : Largest and Smallest Digit of a Number
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a number and find the largest and the
 *   smallest digit in it.
 *
 *   Example: 59217 -> Largest digit = 9, Smallest digit = 1
 * ====================================================================
 */

import java.util.Scanner;

public class Q_106
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = Math.abs(sc.nextLong());
        long large = 0, small = 9;

        do
        {
            long d = n % 10;
            if (d > large)
                large = d;
            if (d < small)
                small = d;
            n = n / 10;
        } while (n > 0);

        System.out.println("Largest digit  = " + large);
        System.out.println("Smallest digit = " + small);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description        |
 * +----------------------+-----------+------------------------------+
 * | n                    | long      | to store the number          |
 * | large                | long      | to store the largest digit   |
 * | small                | long      | to store the smallest digit  |
 * | d                    | long      | to store the extracted digit |
 * +----------------------+-----------+------------------------------+
 */
