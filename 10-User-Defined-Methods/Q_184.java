/*
 * ====================================================================
 *   Program  : Q_184
 *   Chapter  : 10 - User-Defined Methods
 *   Title    : Overloading series(): Three Different Series
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Design a class (written here as class Q_184) to overload a
 *   method series() as follows:
 *
 *       (i)   void series(int x, int n)
 *             to display the sum of the series
 *             x^1 + x^2 + x^3 + ... + x^n
 *       (ii)  void series(int p)
 *             to display the first p terms of the series
 *             0, 7, 26, 63, ...  (term = i^3 - 1)
 *       (iii) void series()
 *             to display the sum of the series
 *             1/2 + 1/3 + 1/4 + ... + 1/10
 *
 *   Write a main method to create an object and call the methods.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_184
{
    void series(int x, int n)
    {
        long sum = 0;
        for (int i = 1; i <= n; i++)
            sum = sum + (long) Math.pow(x, i);
        System.out.println("Sum = " + sum);
    }

    void series(int p)
    {
        for (long i = 1; i <= p; i++)
            System.out.print((i * i * i - 1) + " ");
        System.out.println();
    }

    void series()
    {
        double sum = 0;
        for (int i = 2; i <= 10; i++)
            sum = sum + 1.0 / i;
        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Q_184 ob = new Q_184();
        System.out.print("Enter x and n: ");
        int x = sc.nextInt();
        int n = sc.nextInt();
        ob.series(x, n);
        System.out.print("Enter p: ");
        int p = sc.nextInt();
        ob.series(p);
        ob.series();
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+--------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description                |
 * +----------------------+-----------+--------------------------------------+
 * | x                    | int       | to store/receive the base x          |
 * | n                    | int       | to store/receive the number of terms |
 * | p                    | int       | to store/receive the number of terms |
 * | sum                  | long      | to store the sum in series(int, int) |
 * | sum                  | double    | to store the sum in series()         |
 * | i                    | int       | to act as the loop counter           |
 * | i                    | long      | to act as the counter in series(int) |
 * | ob                   | Q_184     | to refer to the object               |
 * +----------------------+-----------+--------------------------------------+
 */
