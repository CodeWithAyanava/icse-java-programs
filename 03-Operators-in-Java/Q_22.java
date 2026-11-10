/*
 * ====================================================================
 *   Program  : Q_22
 *   Chapter  : 03 - Operators in Java
 *   Title    : Shorthand (Compound Assignment) Operators
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept two integers a and b. Using a fresh
 *   copy of a each time, apply the shorthand operators +=, -=, *=,
 *   /= and %= with b and display the results. If b is zero, display
 *   "Not possible" for /= and %=.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_22
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x;

        x = a;
        x += b;
        System.out.println("a += b gives " + x);

        x = a;
        x -= b;
        System.out.println("a -= b gives " + x);

        x = a;
        x *= b;
        System.out.println("a *= b gives " + x);

        if (b != 0)
        {
            x = a;
            x /= b;
            System.out.println("a /= b gives " + x);
            x = a;
            x %= b;
            System.out.println("a %= b gives " + x);
        }
        else
        {
            System.out.println("a /= b : Not possible");
            System.out.println("a %= b : Not possible");
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+----------------------------+
 * | Name of the Variable | Data Type | Purpose / Description      |
 * +----------------------+-----------+----------------------------+
 * | a                    | int       | to store the first number  |
 * | b                    | int       | to store the second number |
 * | x                    | int       | to store a fresh copy of a |
 * +----------------------+-----------+----------------------------+
 */
