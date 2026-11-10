/*
 * ====================================================================
 *   Program  : Q_97
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : Sunny Number
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a number and check whether it is a
 *   Sunny number or not. A number n is a Sunny number if the next
 *   number (n + 1) is a perfect square.
 *
 *   Example: 8 is a Sunny number since 8 + 1 = 9 = 3^2
 * ====================================================================
 */

import java.util.Scanner;

public class Q_97
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong();
        long next = n + 1;
        long root = Math.round(Math.sqrt(next));

        if (n > 0 && root * root == next)
            System.out.println("Sunny Number");
        else
            System.out.println("Not a Sunny Number");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+----------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description            |
 * +----------------------+-----------+----------------------------------+
 * | n                    | long      | to store the number              |
 * | next                 | long      | to store n + 1                   |
 * | root                 | long      | to store the square root of next |
 * +----------------------+-----------+----------------------------------+
 */
