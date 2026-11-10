/*
 * ====================================================================
 *   Program  : Q_89
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : Pronic Number
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a number and check whether it is a
 *   Pronic number or not. A Pronic (oblong / heteromecic) number is
 *   a number that is the product of two consecutive integers.
 *
 *   Example: 12 = 3 x 4, 20 = 4 x 5, 42 = 6 x 7
 *
 *   Only positive numbers are checked; for zero or a negative number
 *   display "Not a Pronic Number".
 * ====================================================================
 */

import java.util.Scanner;

public class Q_89
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong();
        boolean found = false;

        for (long i = 1; i * (i + 1) <= n; i++)
        {
            if (i * (i + 1) == n)
            {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Pronic Number");
        else
            System.out.println("Not a Pronic Number");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description         |
 * +----------------------+-----------+-------------------------------+
 * | n                    | long      | to store the number           |
 * | found                | boolean   | to record whether n is pronic |
 * | i                    | long      | to act as the smaller factor  |
 * +----------------------+-----------+-------------------------------+
 */
