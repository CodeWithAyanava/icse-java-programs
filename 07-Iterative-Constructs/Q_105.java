/*
 * ====================================================================
 *   Program  : Q_105
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : Reverse a Number and Count its Digits
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a number, display its reverse and the
 *   number of digits in it. For a negative number, the reverse
 *   should keep the minus sign (e.g. -123 gives -321). The number 0
 *   has one digit.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_105
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong();
        long copy = Math.abs(n), rev = 0;
        int count = 0;

        do
        {
            rev = rev * 10 + copy % 10;
            count++;
            copy = copy / 10;
        } while (copy > 0);

        if (n < 0)
            rev = -rev;
        System.out.println("Reverse          = " + rev);
        System.out.println("Number of digits = " + count);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description        |
 * +----------------------+-----------+------------------------------+
 * | n                    | long      | to store the number          |
 * | copy                 | long      | to store a working copy of n |
 * | rev                  | long      | to store the reversed number |
 * | count                | int       | to count the digits          |
 * +----------------------+-----------+------------------------------+
 */
