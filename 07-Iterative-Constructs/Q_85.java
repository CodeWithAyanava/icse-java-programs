/*
 * ====================================================================
 *   Program  : Q_85
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : Automorphic Number
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a number and check whether it is an
 *   Automorphic number or not. An Automorphic number is a number
 *   whose square ends with the number itself.
 *
 *   Example: 25 -> 625, 76 -> 5776, 6 -> 36
 * ====================================================================
 */

import java.util.Scanner;

public class Q_85
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

        if (n > 0 && sq % p == n)
            System.out.println("Automorphic Number");
        else
            System.out.println("Not an Automorphic Number");
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
 * +----------------------+-----------+---------------------------------------+
 */
