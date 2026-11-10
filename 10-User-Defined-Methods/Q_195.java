/*
 * ====================================================================
 *   Program  : Q_195
 *   Chapter  : 10 - User-Defined Methods
 *   Title    : Perfect Number using a boolean Method
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program with a method boolean isPerfect(int n) that
 *   returns true if n is a Perfect number (equal to the sum of its
 *   factors excluding itself) and false otherwise. In main(), accept
 *   a number and display "Perfect Number" or "Not a Perfect Number"
 *   using the method. Also display all the perfect numbers below
 *   10000 using the same method.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_195
{
    boolean isPerfect(int n)
    {
        if (n < 2)
            return false;
        int sum = 1;
        for (int i = 2; i * i <= n; i++)
        {
            if (n % i == 0)
            {
                sum = sum + i;
                if (i != n / i)
                    sum = sum + n / i;
            }
        }
        return sum == n;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Q_195 ob = new Q_195();
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (ob.isPerfect(num))
            System.out.println("Perfect Number");
        else
            System.out.println("Not a Perfect Number");

        System.out.print("Perfect numbers below 10000: ");
        for (int k = 1; k < 10000; k++)
        {
            if (ob.isPerfect(k))
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
 * | sum                  | int       | to store the sum of factors      |
 * | i                    | int       | to act as the possible factor    |
 * | num                  | int       | to store the number entered      |
 * | k                    | int       | to store the number being tested |
 * | ob                   | Q_195     | to refer to the object           |
 * +----------------------+-----------+----------------------------------+
 */
