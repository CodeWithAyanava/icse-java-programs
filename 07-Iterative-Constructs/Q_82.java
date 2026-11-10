/*
 * ====================================================================
 *   Program  : Q_82
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : Spy Number
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a number and check whether it is a Spy
 *   number or not. A Spy number is a number in which the sum of its
 *   digits is equal to the product of its digits.
 *
 *   Example: 1124 -> sum = 1 + 1 + 2 + 4 = 8, product = 1 x 1 x 2 x
 *   4 = 8
 * ====================================================================
 */

import java.util.Scanner;

public class Q_82
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong();
        long copy = n, sum = 0, prod = 1;

        while (copy > 0)
        {
            int d = (int) (copy % 10);
            sum = sum + d;
            prod = prod * d;
            copy = copy / 10;
        }

        if (n > 0 && sum == prod)
            System.out.println("Spy Number");
        else
            System.out.println("Not a Spy Number");
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
 * | sum                  | long      | to store the sum of digits     |
 * | prod                 | long      | to store the product of digits |
 * | d                    | int       | to store the extracted digit   |
 * +----------------------+-----------+--------------------------------+
 */
