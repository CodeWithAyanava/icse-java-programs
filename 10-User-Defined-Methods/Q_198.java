/*
 * ====================================================================
 *   Program  : Q_198
 *   Chapter  : 10 - User-Defined Methods
 *   Title    : Disarium Number using countDigits()
 * --------------------------------------------------------------------
 *   Question :
 *
 *   A Disarium number is a number whose digits, raised to the power
 *   of their respective positions (from the left), add up to the
 *   number itself (e.g. 175 = 1^1 + 7^2 + 5^3). Write a program with
 *   the methods:
 *
 *       int countDigits(int n)    : returns the number of digits in n
 *       boolean isDisarium(int n) : returns true if n is a Disarium
 *                                   number, using countDigits()
 *
 *   In main(), accept a number and display "Disarium Number" or "Not
 *   a Disarium Number".
 * ====================================================================
 */

import java.util.Scanner;

public class Q_198
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

    boolean isDisarium(int n)
    {
        int pos = countDigits(n);
        int sum = 0, copy = n;
        while (copy > 0)
        {
            sum = sum + (int) Math.pow(copy % 10, pos);
            pos--;
            copy = copy / 10;
        }
        return n > 0 && sum == n;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Q_198 ob = new Q_198();
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (ob.isDisarium(num))
            System.out.println("Disarium Number");
        else
            System.out.println("Not a Disarium Number");
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
 * | pos                  | int       | to store the position of a digit |
 * | sum                  | int       | to store the sum of powers       |
 * | copy                 | int       | to store a working copy of n     |
 * | num                  | int       | to store the number entered      |
 * | ob                   | Q_198     | to refer to the object           |
 * +----------------------+-----------+----------------------------------+
 */
