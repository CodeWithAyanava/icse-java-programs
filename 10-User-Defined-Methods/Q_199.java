/*
 * ====================================================================
 *   Program  : Q_199
 *   Chapter  : 10 - User-Defined Methods
 *   Title    : Goldbach's Conjecture
 * --------------------------------------------------------------------
 *   Question :
 *
 *   [Extra] Goldbach's conjecture states that every even number
 *   greater than 2 can be written as the sum of two prime numbers.
 *   Write a program with a method boolean isPrime(int n). In main(),
 *   accept an even number greater than 2 and display all the ways of
 *   writing it as the sum of two primes p + q with p <= q. Display
 *   "Invalid input" for an odd number or a number not greater than
 *   2.
 *
 *   Example: 30 = 7 + 23 = 11 + 19 = 13 + 17
 * ====================================================================
 */

import java.util.Scanner;

public class Q_199
{
    boolean isPrime(int n)
    {
        if (n < 2)
            return false;
        for (int i = 2; i * i <= n; i++)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Q_199 ob = new Q_199();
        System.out.print("Enter an even number greater than 2: ");
        int n = sc.nextInt();

        if (n <= 2 || n % 2 != 0)
        {
            System.out.println("Invalid input");
        }
        else
        {
            for (int p = 2; p <= n / 2; p++)
            {
                int q = n - p;
                if (ob.isPrime(p) && ob.isPrime(q))
                    System.out.println(n + " = " + p + " + " + q);
            }
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-----------------------------+
 * | Name of the Variable | Data Type | Purpose / Description       |
 * +----------------------+-----------+-----------------------------+
 * | n                    | int       | to store/receive the number |
 * | i                    | int       | to act as the trial divisor |
 * | p                    | int       | to store the first prime    |
 * | q                    | int       | to store the second prime   |
 * | ob                   | Q_199     | to refer to the object      |
 * +----------------------+-----------+-----------------------------+
 */
