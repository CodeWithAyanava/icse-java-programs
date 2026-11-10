/*
 * ====================================================================
 *   Program  : Q_88
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : Duck Number
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a positive number and check whether it
 *   is a Duck number or not. A Duck number is a positive number that
 *   contains at least one zero, but not as the first digit.
 *
 *   Example: 3210, 7056, 50001 are Duck numbers.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_88
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong();
        long copy = n;
        boolean hasZero = false;

        while (copy > 0)
        {
            if (copy % 10 == 0)
            {
                hasZero = true;
                break;
            }
            copy = copy / 10;
        }

        if (n > 0 && hasZero)
            System.out.println("Duck Number");
        else
            System.out.println("Not a Duck Number");
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
 * | hasZero              | boolean   | to record whether a zero digit exists |
 * +----------------------+-----------+---------------------------------------+
 */
