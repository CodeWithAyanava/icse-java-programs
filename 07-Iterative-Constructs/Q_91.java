/*
 * ====================================================================
 *   Program  : Q_91
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : Kaprekar Number
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a number and check whether it is a
 *   Kaprekar number or not. A number n having d digits is a Kaprekar
 *   number if its square, split into a right part having d digits
 *   and a left part having the remaining digits, gives two parts
 *   whose sum is equal to n. The right part must not be zero.
 *
 *   Example: 45 -> 45^2 = 2025 -> 20 + 25 = 45 297 -> 297^2 = 88209
 *   -> 88 + 209 = 297
 * ====================================================================
 */

import java.util.Scanner;

public class Q_91
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong();
        long sq = n * n;
        long copy = n, p = 1;

        while (copy > 0)
        {
            p = p * 10;
            copy = copy / 10;
        }

        long right = sq % p;
        long left = sq / p;

        if (n > 0 && right > 0 && left + right == n)
            System.out.println("Kaprekar Number");
        else
            System.out.println("Not a Kaprekar Number");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+---------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description                 |
 * +----------------------+-----------+---------------------------------------+
 * | n                    | long      | to store the number                   |
 * | sq                   | long      | to store the square of n              |
 * | copy                 | long      | to store a working copy of n          |
 * | p                    | long      | to store 10 raised to the digit count |
 * | right                | long      | to store the right part of the square |
 * | left                 | long      | to store the left part of the square  |
 * +----------------------+-----------+---------------------------------------+
 */
