/*
 * ====================================================================
 *   Program  : Q_164
 *   Chapter  : 08 - Nested for Loops
 *   Title    : Prime Numbers between Two Limits
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept two limits and display all the prime
 *   numbers between them (both inclusive), along with their count.
 *   If the first limit is greater than the second, interchange them.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_164
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the two limits: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b)
        {
            int t = a;
            a = b;
            b = t;
        }

        int count = 0;
        for (int n = a; n <= b; n++)
        {
            boolean prime = n > 1;
            for (int i = 2; i * i <= n; i++)
            {
                if (n % i == 0)
                {
                    prime = false;
                    break;
                }
            }
            if (prime)
            {
                System.out.print(n + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("Count = " + count);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+----------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description            |
 * +----------------------+-----------+----------------------------------+
 * | a                    | int       | to store the lower limit         |
 * | b                    | int       | to store the upper limit         |
 * | t                    | int       | to hold a value while swapping   |
 * | count                | int       | to count the primes              |
 * | n                    | int       | to store the number being tested |
 * | prime                | boolean   | to record whether n is prime     |
 * | i                    | int       | to act as the trial divisor      |
 * +----------------------+-----------+----------------------------------+
 */
