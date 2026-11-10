/*
 * ====================================================================
 *   Program  : Q_125
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : Decimal to Octal Conversion
 * --------------------------------------------------------------------
 *   Question :
 *
 *   [Extra] Write a program to accept a non-negative decimal integer
 *   and convert it into its octal (base 8) equivalent by repeatedly
 *   dividing by 8.
 *
 *   Example: 100 -> 144
 * ====================================================================
 */

import java.util.Scanner;

public class Q_125
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        long n = sc.nextLong();

        if (n < 0)
        {
            System.out.println("Invalid input");
        }
        else
        {
            String oct = "";
            long copy = n;
            do
            {
                oct = (copy % 8) + oct;
                copy = copy / 8;
            } while (copy > 0);
            System.out.println("Octal of " + n + " = " + oct);
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description        |
 * +----------------------+-----------+------------------------------+
 * | n                    | long      | to store the decimal number  |
 * | oct                  | String    | to store the octal digits    |
 * | copy                 | long      | to store a working copy of n |
 * +----------------------+-----------+------------------------------+
 */
