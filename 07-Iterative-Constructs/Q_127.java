/*
 * ====================================================================
 *   Program  : Q_127
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : Binary to Decimal Conversion
 * --------------------------------------------------------------------
 *   Question :
 *
 *   [Extra] Write a program to accept a binary number (made of the
 *   digits 0 and 1 only, up to 18 digits) and convert it into its
 *   decimal equivalent. If the number contains any digit other than
 *   0 or 1, display "Invalid binary number".
 *
 *   Example: 11001 -> 25
 * ====================================================================
 */

import java.util.Scanner;

public class Q_127
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        long bin = sc.nextLong();
        long copy = bin, dec = 0, place = 1;
        boolean valid = bin >= 0;

        while (copy > 0)
        {
            long d = copy % 10;
            if (d > 1)
            {
                valid = false;
                break;
            }
            dec = dec + d * place;
            place = place * 2;
            copy = copy / 10;
        }

        if (valid)
            System.out.println("Decimal = " + dec);
        else
            System.out.println("Invalid binary number");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+---------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description                 |
 * +----------------------+-----------+---------------------------------------+
 * | bin                  | long      | to store the binary number            |
 * | copy                 | long      | to store a working copy of bin        |
 * | dec                  | long      | to store the decimal equivalent       |
 * | place                | long      | to store the place value              |
 * | valid                | boolean   | to record whether the input is binary |
 * | d                    | long      | to store the extracted digit          |
 * +----------------------+-----------+---------------------------------------+
 */
