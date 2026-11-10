/*
 * ====================================================================
 *   Program  : Q_281
 *   Chapter  : 14 - Arrays
 *   Title    : First n Primes and First n Fibonacci Numbers in Arrays
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept n (1 to 40) and store the first n
 *   prime numbers in one array and the first n Fibonacci numbers (0,
 *   1, 1, 2, 3, ...) in another array. Display both arrays and the
 *   sum of the elements of each.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_281
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        if (n < 1 || n > 40)
        {
            System.out.println("Invalid input");
            return;
        }

        int p[] = new int[n];
        int count = 0, num = 2;
        while (count < n)
        {
            boolean prime = true;
            for (int j = 2; j * j <= num; j++)
            {
                if (num % j == 0)
                {
                    prime = false;
                    break;
                }
            }
            if (prime)
                p[count++] = num;
            num++;
        }

        long f[] = new long[n];
        f[0] = 0;
        if (n > 1)
            f[1] = 1;
        for (int i = 2; i < n; i++)
            f[i] = f[i - 1] + f[i - 2];

        long sp = 0, sf = 0;
        System.out.print("Primes   : ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(p[i] + " ");
            sp = sp + p[i];
        }
        System.out.println("  (sum = " + sp + ")");
        System.out.print("Fibonacci: ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(f[i] + " ");
            sf = sf + f[i];
        }
        System.out.println("  (sum = " + sf + ")");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description               |
 * +----------------------+-----------+-------------------------------------+
 * | n                    | int       | to store the number of terms        |
 * | p                    | int[]     | to store the prime numbers          |
 * | count                | int       | to count primes found               |
 * | num                  | int       | to store the number being tested    |
 * | prime                | boolean   | to record whether num is prime      |
 * | j                    | int       | to act as the trial divisor         |
 * | f                    | long[]    | to store the fibonacci numbers      |
 * | i                    | int       | to act as the index                 |
 * | sp                   | long      | to store the sum of primes          |
 * | sf                   | long      | to store the sum of fibonacci terms |
 * +----------------------+-----------+-------------------------------------+
 */
