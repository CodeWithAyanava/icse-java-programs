/*
 * ====================================================================
 *   Program  : Q_42
 *   Chapter  : 05 - Mathematical Library Methods
 *   Title    : Evaluating Mathematical Formulas as Java Expressions
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept two real numbers x and y and evaluate
 *   the following by writing them as Java expressions using the
 *   methods of the Math class:
 *
 *       (a) square root of (x^2 + y^2)
 *       (b) cube root of (x + y)
 *       (c) |x - y| ^ 3
 *       (d) (x^5 + y^5) / (x y)
 *       (e) the greater of x^y and y^x
 *
 *   If x y = 0, display "Not defined" for (d). If x or y is
 *   negative, display "Not defined" for (e).
 * ====================================================================
 */

import java.util.Scanner;

public class Q_42
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x and y: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        double a = Math.sqrt(x * x + y * y);
        double b = Math.cbrt(x + y);
        double c = Math.pow(Math.abs(x - y), 3);
        System.out.println("(a) " + a);
        System.out.println("(b) " + b);
        System.out.println("(c) " + c);

        if (x * y != 0)
        {
            double d = (Math.pow(x, 5) + Math.pow(y, 5)) / (x * y);
            System.out.println("(d) " + d);
        }
        else
        {
            System.out.println("(d) Not defined");
        }

        if (x >= 0 && y >= 0)
        {
            double e = Math.max(Math.pow(x, y), Math.pow(y, x));
            System.out.println("(e) " + e);
        }
        else
        {
            System.out.println("(e) Not defined");
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+--------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description          |
 * +----------------------+-----------+--------------------------------+
 * | x                    | double    | to store the first number      |
 * | y                    | double    | to store the second number     |
 * | a                    | double    | to store the value of part (a) |
 * | b                    | double    | to store the value of part (b) |
 * | c                    | double    | to store the value of part (c) |
 * | d                    | double    | to store the value of part (d) |
 * | e                    | double    | to store the value of part (e) |
 * +----------------------+-----------+--------------------------------+
 */
