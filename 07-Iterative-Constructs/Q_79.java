/*
 * ====================================================================
 *   Program  : Q_79
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : Palindrome Number
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a number and check whether it is a
 *   Palindrome number or not. A Palindrome number is a number that
 *   remains the same when its digits are reversed.
 *
 *   Example: 121, 4554, 7 are Palindrome numbers.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_79
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong();
        long copy = n, rev = 0;

        while (copy > 0)
        {
            int d = (int) (copy % 10);
            rev = rev * 10 + d;
            copy = copy / 10;
        }

        if (n >= 0 && rev == n)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not a Palindrome Number");
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
 * | d                    | int       | to store the extracted digit |
 * +----------------------+-----------+------------------------------+
 */
