/*
 * ====================================================================
 *   Program  : Q_80
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : Armstrong Number
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a number and check whether it is an
 *   Armstrong number or not. An Armstrong number is a number that is
 *   equal to the sum of its digits, each raised to the power of the
 *   number of digits.
 *
 *   Example: 153 = 1^3 + 5^3 + 3^3 and 1634 = 1^4 + 6^4 + 3^4 + 4^4
 * ====================================================================
 */

import java.util.Scanner;

public class Q_80
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

        long sum = 0;
        copy = n;
        while (copy > 0)
        {
            int d = (int) (copy % 10);
            sum = sum + (long) Math.pow(d, count);
            copy = copy / 10;
        }

        if (n > 0 && sum == n)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
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
 * | count                | int       | to count the digits          |
 * | sum                  | long      | to store the sum of powers   |
 * | d                    | int       | to store the extracted digit |
 * +----------------------+-----------+------------------------------+
 */
