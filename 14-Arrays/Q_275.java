/*
 * ====================================================================
 *   Program  : Q_275
 *   Chapter  : 14 - Arrays
 *   Title    : Prime Elements of an Array
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept n integers in an array and display all
 *   the prime numbers present in it along with their count. If the
 *   size entered is less than 1, display "Invalid size".
 * ====================================================================
 */

import java.util.Scanner;

public class Q_275
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        if (n < 1)
        {
            System.out.println("Invalid size");
            return;
        }
        int a[] = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int count = 0;
        System.out.print("Prime elements: ");
        for (int i = 0; i < n; i++)
        {
            boolean prime = a[i] > 1;
            for (int j = 2; j * j <= a[i]; j++)
            {
                if (a[i] % j == 0)
                {
                    prime = false;
                    break;
                }
            }
            if (prime)
            {
                System.out.print(a[i] + " ");
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
 * +----------------------+-----------+---------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description           |
 * +----------------------+-----------+---------------------------------+
 * | n                    | int       | to store the size of the array  |
 * | a                    | int[]     | to store the elements           |
 * | i                    | int       | to act as the index             |
 * | count                | int       | to count the primes             |
 * | prime                | boolean   | to record whether a[i] is prime |
 * | j                    | int       | to act as the trial divisor     |
 * +----------------------+-----------+---------------------------------+
 */
