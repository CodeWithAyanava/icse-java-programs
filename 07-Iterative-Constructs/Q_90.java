/*
 * ====================================================================
 *   Program  : Q_90
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : Disarium Number
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a number and check whether it is a
 *   Disarium number or not. A Disarium number is a number in which
 *   the sum of its digits, each raised to the power of its position
 *   (counted from the left, starting at 1), is equal to the number
 *   itself.
 *
 *   Example: 135 = 1^1 + 3^2 + 5^3 = 1 + 9 + 125
 * ====================================================================
 */

import java.util.Scanner;

public class Q_90
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong();
        long copy = n;
        int pos = 0;

        while (copy > 0)
        {
            pos++;
            copy = copy / 10;
        }

        long sum = 0;
        copy = n;
        while (copy > 0)
        {
            int d = (int) (copy % 10);
            sum = sum + (long) Math.pow(d, pos);
            pos--;
            copy = copy / 10;
        }

        if (n > 0 && sum == n)
            System.out.println("Disarium Number");
        else
            System.out.println("Not a Disarium Number");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description              |
 * +----------------------+-----------+------------------------------------+
 * | n                    | long      | to store the number                |
 * | copy                 | long      | to store a working copy of n       |
 * | pos                  | int       | to store the position of the digit |
 * | sum                  | long      | to store the sum of powers         |
 * | d                    | int       | to store the extracted digit       |
 * +----------------------+-----------+------------------------------------+
 */
