/*
 * ====================================================================
 *   Program  : Q_35
 *   Chapter  : 05 - Mathematical Library Methods
 *   Title    : Roots of a Quadratic Equation
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept the coefficients a, b and c of the
 *   quadratic equation ax^2 + bx + c = 0 and find its roots.
 *
 *       Discriminant d = b^2 - 4ac
 *       Roots = (-b + square root of d) / 2a  and  (-b - square root of d) / 2a
 *
 *   If d > 0, display "Roots are real and distinct" and the two
 *   roots. If d = 0, display "Roots are real and equal" and the
 *   root. If d < 0, display "Roots are imaginary". If a is 0,
 *   display "Not a quadratic equation".
 * ====================================================================
 */

import java.util.Scanner;

public class Q_35
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b and c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a == 0)
        {
            System.out.println("Not a quadratic equation");
        }
        else
        {
            double d = b * b - 4 * a * c;
            if (d > 0)
            {
                double r1 = (-b + Math.sqrt(d)) / (2 * a);
                double r2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println("Roots are real and distinct");
                System.out.println("Root 1 = " + r1);
                System.out.println("Root 2 = " + r2);
            }
            else if (d == 0)
            {
                double r = -b / (2 * a);
                System.out.println("Roots are real and equal");
                System.out.println("Root = " + r);
            }
            else
            {
                System.out.println("Roots are imaginary");
            }
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+---------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description                 |
 * +----------------------+-----------+---------------------------------------+
 * | a                    | double    | to store the coefficient of x squared |
 * | b                    | double    | to store the coefficient of x         |
 * | c                    | double    | to store the constant term            |
 * | d                    | double    | to store the discriminant             |
 * | r1                   | double    | to store the first root               |
 * | r2                   | double    | to store the second root              |
 * | r                    | double    | to store the equal root               |
 * +----------------------+-----------+---------------------------------------+
 */
