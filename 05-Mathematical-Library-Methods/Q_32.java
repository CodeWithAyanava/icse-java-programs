/*
 * ====================================================================
 *   Program  : Q_32
 *   Chapter  : 05 - Mathematical Library Methods
 *   Title    : Results of All Math Class Methods
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept two real numbers a and b and display
 *   the results of the following methods of the Math class:
 *
 *       Math.pow(a, b)   Math.sqrt(a)   Math.cbrt(a)   Math.ceil(a)
 *       Math.floor(a)    Math.round(a)  Math.abs(a)    Math.max(a, b)
 *       Math.min(a, b)   Math.random()
 *
 *   If a is negative, display "Square root not defined" instead of
 *   the square root.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_32
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        System.out.println("Math.pow(a, b)  = " + Math.pow(a, b));
        if (a >= 0)
            System.out.println("Math.sqrt(a)    = " + Math.sqrt(a));
        else
            System.out.println("Math.sqrt(a)    : Square root not defined");
        System.out.println("Math.cbrt(a)    = " + Math.cbrt(a));
        System.out.println("Math.ceil(a)    = " + Math.ceil(a));
        System.out.println("Math.floor(a)   = " + Math.floor(a));
        System.out.println("Math.round(a)   = " + Math.round(a));
        System.out.println("Math.abs(a)     = " + Math.abs(a));
        System.out.println("Math.max(a, b)  = " + Math.max(a, b));
        System.out.println("Math.min(a, b)  = " + Math.min(a, b));
        System.out.println("Math.random()   = " + Math.random());
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+----------------------------+
 * | Name of the Variable | Data Type | Purpose / Description      |
 * +----------------------+-----------+----------------------------+
 * | a                    | double    | to store the first number  |
 * | b                    | double    | to store the second number |
 * +----------------------+-----------+----------------------------+
 */
