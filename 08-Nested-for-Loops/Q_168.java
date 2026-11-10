/*
 * ====================================================================
 *   Program  : Q_168
 *   Chapter  : 08 - Nested for Loops
 *   Title    : Twin Primes up to n
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Twin primes are pairs of prime numbers that differ by 2, e.g.
 *   (3, 5), (5, 7), (11, 13). Write a program to accept n and
 *   display all the pairs of twin primes up to n.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_168
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int a = 3; a + 2 <= n; a += 2)
        {
            boolean p1 = true, p2 = true;
            for (int i = 2; i * i <= a; i++)
            {
                if (a % i == 0)
                {
                    p1 = false;
                    break;
                }
            }
            for (int i = 2; i * i <= a + 2; i++)
            {
                if ((a + 2) % i == 0)
                {
                    p2 = false;
                    break;
                }
            }
            if (p1 && p2)
                System.out.print("(" + a + ", " + (a + 2) + ") ");
        }
        System.out.println();
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description               |
 * +----------------------+-----------+-------------------------------------+
 * | n                    | int       | to store the upper limit            |
 * | a                    | int       | to store the first number of a pair |
 * | p1                   | boolean   | to record whether a is prime        |
 * | p2                   | boolean   | to record whether a + 2 is prime    |
 * | i                    | int       | to act as the trial divisor         |
 * +----------------------+-----------+-------------------------------------+
 */
