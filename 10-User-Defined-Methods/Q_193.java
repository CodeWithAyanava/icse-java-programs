/*
 * ====================================================================
 *   Program  : Q_193
 *   Chapter  : 10 - User-Defined Methods
 *   Title    : Twisted Prime using isPrime() and reverse()
 * --------------------------------------------------------------------
 *   Question :
 *
 *   A number is called a Twisted Prime if the number is prime and
 *   the number obtained by reversing its digits is also prime (e.g.
 *   97 and 79 are both prime, so 97 is a Twisted Prime). Write a
 *   program with the methods:
 *
 *       int reverse(int n)     : returns the reverse of n
 *       boolean isPrime(int n) : returns true if n is prime
 *
 *   In main(), accept a number and check whether it is a Twisted
 *   Prime using the above methods. Display "Twisted Prime" or "Not a
 *   Twisted Prime".
 * ====================================================================
 */

import java.util.Scanner;

public class Q_193
{
    int reverse(int n)
    {
        int rev = 0;
        while (n > 0)
        {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        return rev;
    }

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
        Q_193 ob = new Q_193();
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (ob.isPrime(num) && ob.isPrime(ob.reverse(num)))
            System.out.println("Twisted Prime");
        else
            System.out.println("Not a Twisted Prime");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description        |
 * +----------------------+-----------+------------------------------+
 * | n                    | int       | to receive the number        |
 * | rev                  | int       | to store the reversed number |
 * | i                    | int       | to act as the trial divisor  |
 * | num                  | int       | to store the number entered  |
 * | ob                   | Q_193     | to refer to the object       |
 * +----------------------+-----------+------------------------------+
 */
