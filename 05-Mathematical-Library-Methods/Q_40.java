/*
 * ====================================================================
 *   Program  : Q_40
 *   Chapter  : 05 - Mathematical Library Methods
 *   Title    : Perfect Square Check using Math.sqrt()
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a number and check whether it is a
 *   perfect square or not using Math.sqrt(). A perfect square is a
 *   number that is the square of an integer, e.g. 0, 1, 4, 9, 16,
 *   25. Display "Perfect Square" or "Not a Perfect Square".
 * ====================================================================
 */

import java.util.Scanner;

public class Q_40
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong();

        if (n < 0)
        {
            System.out.println("Not a Perfect Square");
        }
        else
        {
            long root = Math.round(Math.sqrt(n));
            if (root * root == n)
                System.out.println("Perfect Square");
            else
                System.out.println("Not a Perfect Square");
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+----------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description            |
 * +----------------------+-----------+----------------------------------+
 * | n                    | long      | to store the number              |
 * | root                 | long      | to store the rounded square root |
 * +----------------------+-----------+----------------------------------+
 */
