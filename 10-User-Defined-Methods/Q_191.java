/*
 * ====================================================================
 *   Program  : Q_191
 *   Chapter  : 10 - User-Defined Methods
 *   Title    : Prime Palindrome (PalPrime) Numbers in a Range
 * --------------------------------------------------------------------
 *   Question :
 *
 *   A PalPrime number is a number that is both prime and a
 *   palindrome (e.g. 11, 101, 131). Write a program with the
 *   following methods:
 *
 *       boolean isPrime(int n)      : returns true if n is prime
 *       boolean isPalindrome(int n) : returns true if n is a palindrome
 *       void main()                 : accepts two limits m and n and
 *                                     displays all PalPrime numbers
 *                                     between them, using the above
 *                                     methods
 *
 *   If m > n, display "Invalid range".
 * ====================================================================
 */

import java.util.Scanner;

public class Q_191
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

    boolean isPalindrome(int n)
    {
        int copy = n, rev = 0;
        while (copy > 0)
        {
            rev = rev * 10 + copy % 10;
            copy = copy / 10;
        }
        return rev == n;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Q_191 ob = new Q_191();
        System.out.print("Enter the limits m and n: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        if (m > n)
        {
            System.out.println("Invalid range");
        }
        else
        {
            for (int k = m; k <= n; k++)
            {
                if (ob.isPrime(k) && ob.isPalindrome(k))
                    System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+---------------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description                       |
 * +----------------------+-----------+---------------------------------------------+
 * | n                    | int       | to receive a number / store the upper limit |
 * | i                    | int       | to act as the trial divisor                 |
 * | copy                 | int       | to store a working copy of n                |
 * | rev                  | int       | to store the reverse of n                   |
 * | m                    | int       | to store the lower limit                    |
 * | k                    | int       | to store the number being tested            |
 * | ob                   | Q_191     | to refer to the object                      |
 * +----------------------+-----------+---------------------------------------------+
 */
