/*
 * ====================================================================
 *   Program  : Q_126
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : Decimal to Hexadecimal Conversion
 * --------------------------------------------------------------------
 *   Question :
 *
 *   [Extra] Write a program to accept a non-negative decimal integer
 *   and convert it into its hexadecimal (base 16) equivalent. The
 *   remainders 10 to 15 are written as A to F.
 *
 *   Example: 255 -> FF, 4096 -> 1000
 * ====================================================================
 */

import java.util.Scanner;

public class Q_126
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
            String hex = "";
            long copy = n;
            do
            {
                int r = (int) (copy % 16);
                char digit;
                if (r < 10)
                    digit = (char) ('0' + r);
                else
                    digit = (char) ('A' + r - 10);
                hex = digit + hex;
                copy = copy / 16;
            } while (copy > 0);
            System.out.println("Hexadecimal of " + n + " = " + hex);
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+---------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description           |
 * +----------------------+-----------+---------------------------------+
 * | n                    | long      | to store the decimal number     |
 * | hex                  | String    | to store the hexadecimal digits |
 * | copy                 | long      | to store a working copy of n    |
 * | r                    | int       | to store the remainder          |
 * | digit                | char      | to store the hexadecimal digit  |
 * +----------------------+-----------+---------------------------------+
 */
