/*
 * ====================================================================
 *   Program  : Q_192
 *   Chapter  : 10 - User-Defined Methods
 *   Title    : Twin Primes in a Range using isPrime()
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Twin primes are two prime numbers that differ by 2, e.g. (5, 7),
 *   (17, 19). Write a program with a method boolean isPrime(int n)
 *   that returns true if n is prime. In main(), accept two limits
 *   and display all the twin prime pairs that lie completely within
 *   the limits, using the method isPrime().
 * ====================================================================
 */

import java.util.Scanner;

public class Q_192
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
        Q_192 ob = new Q_192();
        System.out.print("Enter the two limits: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;

        for (int k = a; k + 2 <= b; k++)
        {
            if (ob.isPrime(k) && ob.isPrime(k + 2))
            {
                System.out.println("(" + k + ", " + (k + 2) + ")");
                count++;
            }
        }
        if (count == 0)
            System.out.println("No twin primes in this range");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description               |
 * +----------------------+-----------+-------------------------------------+
 * | n                    | int       | to receive the number to test       |
 * | i                    | int       | to act as the trial divisor         |
 * | a                    | int       | to store the lower limit            |
 * | b                    | int       | to store the upper limit            |
 * | count                | int       | to count the twin prime pairs       |
 * | k                    | int       | to store the first number of a pair |
 * | ob                   | Q_192     | to refer to the object              |
 * +----------------------+-----------+-------------------------------------+
 */
