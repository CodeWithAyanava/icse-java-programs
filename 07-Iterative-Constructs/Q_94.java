/*
 * ====================================================================
 *   Program  : Q_94
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : Happy Number
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a number and check whether it is a
 *   Happy number or not. A number is Happy if, on repeatedly
 *   replacing it by the sum of the squares of its digits, it finally
 *   becomes 1. If it never reaches 1, it enters a cycle containing 4
 *   and the number is not happy.
 *
 *   Example: 7 -> 49 -> 97 -> 130 -> 10 -> 1
 * ====================================================================
 */

import java.util.Scanner;

public class Q_94
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong();
        long num = n;

        while (num != 1 && num != 4 && num > 0)
        {
            long sum = 0;
            while (num > 0)
            {
                long d = num % 10;
                sum = sum + d * d;
                num = num / 10;
            }
            num = sum;
        }

        if (num == 1)
            System.out.println("Happy Number");
        else
            System.out.println("Not a Happy Number");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+---------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description                 |
 * +----------------------+-----------+---------------------------------------+
 * | n                    | long      | to store the number                   |
 * | num                  | long      | to store the number being transformed |
 * | sum                  | long      | to store the sum of squares of digits |
 * | d                    | long      | to store the extracted digit          |
 * +----------------------+-----------+---------------------------------------+
 */
