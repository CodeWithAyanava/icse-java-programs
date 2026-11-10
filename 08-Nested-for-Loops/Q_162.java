/*
 * ====================================================================
 *   Program  : Q_162
 *   Chapter  : 08 - Nested for Loops
 *   Title    : First n Multiples of Each Number from 1 to a Limit
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a limit L and a number n, and generate
 *   the first n multiples of every number from 1 to L, each number's
 *   multiples on a separate line, using nested for loops.
 *
 *   Example: L = 3, n = 4 1 : 1 2 3 4 2 : 2 4 6 8 3 : 3 6 9 12
 * ====================================================================
 */

import java.util.Scanner;

public class Q_162
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit L: ");
        int lim = sc.nextInt();
        System.out.print("Enter the number of multiples n: ");
        int n = sc.nextInt();

        if (lim < 1 || n < 1)
        {
            System.out.println("Invalid input");
        }
        else
        {
            for (int i = 1; i <= lim; i++)
            {
                System.out.print(i + " : ");
                for (int j = 1; j <= n; j++)
                    System.out.print(i * j + " ");
                System.out.println();
            }
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+----------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description            |
 * +----------------------+-----------+----------------------------------+
 * | lim                  | int       | to store the limit               |
 * | n                    | int       | to store the number of multiples |
 * | i                    | int       | to store the current number      |
 * | j                    | int       | to act as the multiplier         |
 * +----------------------+-----------+----------------------------------+
 */
