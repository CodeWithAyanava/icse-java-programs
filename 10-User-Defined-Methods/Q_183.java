/*
 * ====================================================================
 *   Program  : Q_183
 *   Chapter  : 10 - User-Defined Methods
 *   Title    : Overloading area(): Circle, Rectangle and Triangle
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Design a class (written here as class Q_183) to overload a
 *   method area() as follows:
 *
 *       (i)   double area(double r)
 *             returns the area of a circle = pi x r x r
 *       (ii)  double area(double l, double b)
 *             returns the area of a rectangle = l x b
 *       (iii) double area(double a, double b, double c)
 *             returns the area of a triangle using Heron's formula,
 *             s = (a + b + c) / 2, area = sqrt(s(s-a)(s-b)(s-c));
 *             return -1 if the sides cannot form a triangle
 *
 *   Write a main method to accept the values from the user and call
 *   the methods.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_183
{
    double area(double r)
    {
        return Math.PI * r * r;
    }

    double area(double l, double b)
    {
        return l * b;
    }

    double area(double a, double b, double c)
    {
        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || b + c <= a || a + c <= b)
            return -1;
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Q_183 ob = new Q_183();
        System.out.print("Enter radius of the circle: ");
        double r = sc.nextDouble();
        System.out.println("Area of circle = " + ob.area(r));

        System.out.print("Enter length and breadth of the rectangle: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Area of rectangle = " + ob.area(l, b));

        System.out.print("Enter the three sides of the triangle: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        double t = ob.area(x, y, z);
        if (t < 0)
            System.out.println("Triangle not possible");
        else
            System.out.println("Area of triangle = " + t);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+----------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description                  |
 * +----------------------+-----------+----------------------------------------+
 * | r                    | double    | to store/receive the radius            |
 * | l                    | double    | to store/receive the length            |
 * | b                    | double    | to store/receive the breadth or a side |
 * | a                    | double    | to receive the first side              |
 * | c                    | double    | to receive the third side              |
 * | s                    | double    | to store the semi-perimeter            |
 * | ob                   | Q_183     | to refer to the object                 |
 * | x                    | double    | to store the first side                |
 * | y                    | double    | to store the second side               |
 * | z                    | double    | to store the third side                |
 * | t                    | double    | to store the triangle's area           |
 * +----------------------+-----------+----------------------------------------+
 */
