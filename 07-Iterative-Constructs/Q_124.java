/*
 * ====================================================================
 *   Program  : Q_124
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : Decimal to Binary Conversion
 * --------------------------------------------------------------------
 *   Question :
 *
 *   [Extra] Write a program to accept a non-negative decimal (base
 *   10) integer and convert it into its binary (base 2) equivalent
 *   by repeatedly dividing by 2 and collecting the remainders in
 *   reverse order.
 *
 *   Example: 25 -> 11001
 * ====================================================================
 */

import java.util.Scanner;

public class Q_124
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
            String bin = "";
            long copy = n;
            do
            {
                bin = (copy % 2) + bin;
                copy = copy / 2;
            } while (copy > 0);
            System.out.println("Binary of " + n + " = " + bin);
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
 * | bin                  | String    | to store the binary digits   |
 * | copy                 | long      | to store a working copy of n |
 * +----------------------+-----------+------------------------------+
 */
