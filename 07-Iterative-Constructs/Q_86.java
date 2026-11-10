/*
 * ====================================================================
 *   Program  : Q_86
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : Special Number (Krishnamurthy Number)
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a number and check whether it is a
 *   Special number (also called a Krishnamurthy number) or not. A
 *   Special number is a number in which the sum of the factorials of
 *   its digits is equal to the number itself.
 *
 *   Example: 145 = 1! + 4! + 5! = 1 + 24 + 120
 * ====================================================================
 */

import java.util.Scanner;

public class Q_86
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong();
        long copy = n, sum = 0;

        while (copy > 0)
        {
            int d = (int) (copy % 10);
            long f = 1;
            for (int i = 1; i <= d; i++)
                f = f * i;
            sum = sum + f;
            copy = copy / 10;
        }

        if (n > 0 && sum == n)
            System.out.println("Special Number");
        else
            System.out.println("Not a Special Number");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-----------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description             |
 * +----------------------+-----------+-----------------------------------+
 * | n                    | long      | to store the number               |
 * | copy                 | long      | to store a working copy of n      |
 * | sum                  | long      | to store the sum of factorials    |
 * | d                    | int       | to store the extracted digit      |
 * | f                    | long      | to store the factorial of a digit |
 * | i                    | int       | to act as the loop counter        |
 * +----------------------+-----------+-----------------------------------+
 */
