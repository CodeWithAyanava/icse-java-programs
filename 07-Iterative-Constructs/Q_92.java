/*
 * ====================================================================
 *   Program  : Q_92
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : Tech Number
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a number and check whether it is a
 *   Tech number or not. A Tech number has an even number of digits;
 *   when it is divided into two equal halves, the square of the sum
 *   of the two halves is equal to the number itself.
 *
 *   Example: 2025 -> 20 + 25 = 45 -> 45^2 = 2025
 * ====================================================================
 */

import java.util.Scanner;

public class Q_92
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong();
        long copy = n;
        int count = 0;

        while (copy > 0)
        {
            count++;
            copy = copy / 10;
        }

        boolean tech = false;
        if (n > 0 && count % 2 == 0)
        {
            long p = (long) Math.pow(10, count / 2);
            long first = n / p;
            long second = n % p;
            long s = first + second;
            tech = (s * s == n);
        }

        if (tech)
            System.out.println("Tech Number");
        else
            System.out.println("Not a Tech Number");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+---------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description                 |
 * +----------------------+-----------+---------------------------------------+
 * | n                    | long      | to store the number                   |
 * | copy                 | long      | to store a working copy of n          |
 * | count                | int       | to count the digits                   |
 * | tech                 | boolean   | to record whether n is a tech number  |
 * | p                    | long      | to store 10 raised to half the digits |
 * | first                | long      | to store the first half               |
 * | second               | long      | to store the second half              |
 * | s                    | long      | to store the sum of the halves        |
 * +----------------------+-----------+---------------------------------------+
 */
