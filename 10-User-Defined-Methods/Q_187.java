/*
 * ====================================================================
 *   Program  : Q_187
 *   Chapter  : 10 - User-Defined Methods
 *   Title    : Overloading sumSeries()
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Design a class (written here as class Q_187) to overload a
 *   method sumSeries() as follows:
 *
 *       (i)  double sumSeries(int n)
 *            returns the sum of 1 + 1/2 + 1/3 + ... + 1/n
 *       (ii) double sumSeries(double x, int n)
 *            returns the sum of x/1 + x^2/2 + x^3/3 + ... + x^n/n
 *
 *   Write a main method to accept n and x, and display both sums.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_187
{
    double sumSeries(int n)
    {
        double s = 0;
        for (int i = 1; i <= n; i++)
            s = s + 1.0 / i;
        return s;
    }

    double sumSeries(double x, int n)
    {
        double s = 0;
        for (int i = 1; i <= n; i++)
            s = s + Math.pow(x, i) / i;
        return s;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Q_187 ob = new Q_187();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter x: ");
        double x = sc.nextDouble();
        System.out.println("1 + 1/2 + ... + 1/n   = " + ob.sumSeries(n));
        System.out.println("x/1 + x^2/2 + ... + x^n/n = " + ob.sumSeries(x, n));
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+--------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description                |
 * +----------------------+-----------+--------------------------------------+
 * | n                    | int       | to store/receive the number of terms |
 * | x                    | double    | to store/receive the value of x      |
 * | s                    | double    | to store the sum                     |
 * | i                    | int       | to act as the loop counter           |
 * | ob                   | Q_187     | to refer to the object               |
 * +----------------------+-----------+--------------------------------------+
 */
