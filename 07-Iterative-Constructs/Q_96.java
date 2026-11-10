/*
 * ====================================================================
 *   Program  : Q_96
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : Emirp Number
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a number and check whether it is an
 *   Emirp number or not. An Emirp number is a number which is prime
 *   both forwards and backwards, i.e. the number and its reverse are
 *   both prime.
 *
 *   Example: 13 and its reverse 31 are both prime, so 13 is an Emirp
 *   number.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_96
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong();

        long copy = n, rev = 0;
        while (copy > 0)
        {
            rev = rev * 10 + copy % 10;
            copy = copy / 10;
        }

        boolean p1 = n > 1;
        for (long i = 2; i * i <= n; i++)
        {
            if (n % i == 0)
            {
                p1 = false;
                break;
            }
        }

        boolean p2 = rev > 1;
        for (long i = 2; i * i <= rev; i++)
        {
            if (rev % i == 0)
            {
                p2 = false;
                break;
            }
        }

        if (p1 && p2)
            System.out.println("Emirp Number");
        else
            System.out.println("Not an Emirp Number");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+--------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description          |
 * +----------------------+-----------+--------------------------------+
 * | n                    | long      | to store the number            |
 * | copy                 | long      | to store a working copy of n   |
 * | rev                  | long      | to store the reverse of n      |
 * | p1                   | boolean   | to record whether n is prime   |
 * | p2                   | boolean   | to record whether rev is prime |
 * | i                    | long      | to act as the trial divisor    |
 * +----------------------+-----------+--------------------------------+
 */
