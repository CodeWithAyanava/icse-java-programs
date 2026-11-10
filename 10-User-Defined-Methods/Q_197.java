/*
 * ====================================================================
 *   Program  : Q_197
 *   Chapter  : 10 - User-Defined Methods
 *   Title    : nCr using a factorial() Method
 * --------------------------------------------------------------------
 *   Question :
 *
 *   The number of ways of choosing r objects from n objects is
 *
 *       nCr = n! / ( r! x (n - r)! )
 *
 *   Write a program with a method long factorial(int n) that returns
 *   n!. In main(), accept n and r and display nCr using the method.
 *   Accept only 0 <= r <= n <= 20 (otherwise display "Invalid
 *   input").
 * ====================================================================
 */

import java.util.Scanner;

public class Q_197
{
    long factorial(int n)
    {
        long f = 1;
        for (int i = 2; i <= n; i++)
            f = f * i;
        return f;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Q_197 ob = new Q_197();
        System.out.print("Enter n and r: ");
        int n = sc.nextInt();
        int r = sc.nextInt();

        if (r < 0 || n < r || n > 20)
        {
            System.out.println("Invalid input");
        }
        else
        {
            long ncr = ob.factorial(n) / (ob.factorial(r) * ob.factorial(n - r));
            System.out.println(n + "C" + r + " = " + ncr);
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+----------------------------+
 * | Name of the Variable | Data Type | Purpose / Description      |
 * +----------------------+-----------+----------------------------+
 * | n                    | int       | to store/receive n         |
 * | f                    | long      | to store the factorial     |
 * | i                    | int       | to act as the loop counter |
 * | r                    | int       | to store r                 |
 * | ncr                  | long      | to store the value of ncr  |
 * | ob                   | Q_197     | to refer to the object     |
 * +----------------------+-----------+----------------------------+
 */
