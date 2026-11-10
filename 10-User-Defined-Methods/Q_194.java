/*
 * ====================================================================
 *   Program  : Q_194
 *   Chapter  : 10 - User-Defined Methods
 *   Title    : Armstrong Numbers in a Range using isArmstrong()
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program with the methods:
 *
 *       int countDigits(int n)     : returns the number of digits in n
 *       boolean isArmstrong(int n) : returns true if n is an Armstrong
 *                                    number, i.e. n is equal to the sum of
 *                                    its digits each raised to the power of
 *                                    the number of digits
 *
 *   In main(), accept two limits and display all the Armstrong
 *   numbers between them.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_194
{
    int countDigits(int n)
    {
        int c = 0;
        while (n > 0)
        {
            c++;
            n = n / 10;
        }
        return c;
    }

    boolean isArmstrong(int n)
    {
        int p = countDigits(n);
        int sum = 0, copy = n;
        while (copy > 0)
        {
            sum = sum + (int) Math.pow(copy % 10, p);
            copy = copy / 10;
        }
        return n > 0 && sum == n;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Q_194 ob = new Q_194();
        System.out.print("Enter the two limits: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int k = a; k <= b; k++)
        {
            if (ob.isArmstrong(k))
                System.out.print(k + " ");
        }
        System.out.println();
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+----------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description            |
 * +----------------------+-----------+----------------------------------+
 * | n                    | int       | to receive the number            |
 * | c                    | int       | to count the digits              |
 * | p                    | int       | to store the number of digits    |
 * | sum                  | int       | to store the sum of powers       |
 * | copy                 | int       | to store a working copy of n     |
 * | a                    | int       | to store the lower limit         |
 * | b                    | int       | to store the upper limit         |
 * | k                    | int       | to store the number being tested |
 * | ob                   | Q_194     | to refer to the object           |
 * +----------------------+-----------+----------------------------------+
 */
