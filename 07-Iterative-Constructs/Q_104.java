/*
 * ====================================================================
 *   Program  : Q_104
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : Sum and Product of Digits
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a number and find the sum and the
 *   product of its digits. For a negative number, use its absolute
 *   value.
 *
 *   Example: 2537 -> Sum = 17, Product = 210
 * ====================================================================
 */

import java.util.Scanner;

public class Q_104
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = Math.abs(sc.nextLong());
        long sum = 0, prod = 1;

        do
        {
            long d = n % 10;
            sum = sum + d;
            prod = prod * d;
            n = n / 10;
        } while (n > 0);

        System.out.println("Sum of digits     = " + sum);
        System.out.println("Product of digits = " + prod);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+--------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description          |
 * +----------------------+-----------+--------------------------------+
 * | n                    | long      | to store the number            |
 * | sum                  | long      | to store the sum of digits     |
 * | prod                 | long      | to store the product of digits |
 * | d                    | long      | to store the extracted digit   |
 * +----------------------+-----------+--------------------------------+
 */
