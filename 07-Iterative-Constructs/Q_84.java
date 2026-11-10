/*
 * ====================================================================
 *   Program  : Q_84
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : Neon Number
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a number and check whether it is a
 *   Neon number or not. A Neon number is a number in which the sum
 *   of the digits of its square is equal to the number itself.
 *
 *   Example: 9 -> 9^2 = 81, and 8 + 1 = 9
 * ====================================================================
 */

import java.util.Scanner;

public class Q_84
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong();
        long sq = n * n, sum = 0;

        while (sq > 0)
        {
            sum = sum + sq % 10;
            sq = sq / 10;
        }

        if (n >= 0 && sum == n)
            System.out.println("Neon Number");
        else
            System.out.println("Not a Neon Number");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description                    |
 * +----------------------+-----------+------------------------------------------+
 * | n                    | long      | to store the number                      |
 * | sq                   | long      | to store the square of n                 |
 * | sum                  | long      | to store the sum of digits of the square |
 * +----------------------+-----------+------------------------------------------+
 */
