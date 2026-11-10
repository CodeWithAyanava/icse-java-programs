/*
 * ====================================================================
 *   Program  : Q_108
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : Count of Even and Odd Digits
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a number and count the number of even
 *   digits and odd digits in it.
 *
 *   Example: 45672 -> Even digits = 3 (4, 6, 2), Odd digits = 2 (5,
 *   7)
 * ====================================================================
 */

import java.util.Scanner;

public class Q_108
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = Math.abs(sc.nextLong());
        int even = 0, odd = 0;

        do
        {
            long d = n % 10;
            if (d % 2 == 0)
                even++;
            else
                odd++;
            n = n / 10;
        } while (n > 0);

        System.out.println("Even digits = " + even);
        System.out.println("Odd digits  = " + odd);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description        |
 * +----------------------+-----------+------------------------------+
 * | n                    | long      | to store the number          |
 * | even                 | int       | to count the even digits     |
 * | odd                  | int       | to count the odd digits      |
 * | d                    | long      | to store the extracted digit |
 * +----------------------+-----------+------------------------------+
 */
