/*
 * ====================================================================
 *   Program  : Q_99
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : Unique Number
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a number and check whether it is a
 *   Unique number or not. A Unique number is a positive number in
 *   which no digit is repeated.
 *
 *   Example: 3412 is Unique, but 3121 is not (1 is repeated).
 * ====================================================================
 */

import java.util.Scanner;

public class Q_99
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong();
        boolean unique = n > 0;

        for (int d = 0; d <= 9 && unique; d++)
        {
            int count = 0;
            long copy = n;
            while (copy > 0)
            {
                if (copy % 10 == d)
                    count++;
                copy = copy / 10;
            }
            if (count > 1)
                unique = false;
        }

        if (unique)
            System.out.println("Unique Number");
        else
            System.out.println("Not a Unique Number");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description               |
 * +----------------------+-----------+-------------------------------------+
 * | n                    | long      | to store the number                 |
 * | unique               | boolean   | to record whether all digits differ |
 * | d                    | int       | to act as the digit being counted   |
 * | count                | int       | to count occurrences of d           |
 * | copy                 | long      | to store a working copy of n        |
 * +----------------------+-----------+-------------------------------------+
 */
