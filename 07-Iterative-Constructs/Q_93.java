/*
 * ====================================================================
 *   Program  : Q_93
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : Magic Number
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a number and check whether it is a
 *   Magic number or not. A Magic number is a number in which the
 *   eventual sum of the digits is equal to 1, i.e. the sum of digits
 *   is found repeatedly until a single-digit number is obtained, and
 *   that digit is 1.
 *
 *   Example: 19 -> 1 + 9 = 10 -> 1 + 0 = 1
 * ====================================================================
 */

import java.util.Scanner;

public class Q_93
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong();
        long num = n;

        while (num > 9)
        {
            long sum = 0;
            while (num > 0)
            {
                sum = sum + num % 10;
                num = num / 10;
            }
            num = sum;
        }

        if (n > 0 && num == 1)
            System.out.println("Magic Number");
        else
            System.out.println("Not a Magic Number");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-----------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description             |
 * +----------------------+-----------+-----------------------------------+
 * | n                    | long      | to store the number               |
 * | num                  | long      | to store the number being reduced |
 * | sum                  | long      | to store the sum of digits        |
 * +----------------------+-----------+-----------------------------------+
 */
