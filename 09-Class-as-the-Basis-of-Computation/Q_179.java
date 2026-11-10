/*
 * ====================================================================
 *   Program  : Q_179
 *   Chapter  : 09 - Class as the Basis of all Computation
 *   Title    : Class Point: Distance from the Origin
 *   Class    : Point   (compile: javac Q_179.java   run: java Point)
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Define a class Point with the following description:
 *
 *       Data members : double x, y
 *       void setPoint(double a, double b) : to assign the coordinates
 *       double distance() : to return the distance of the point from
 *                           the origin, i.e. square root of (x^2 + y^2)
 *       void display()    : to display the point as (x, y)
 *
 *   In main(), accept the coordinates of two points, create two
 *   objects, and display which point is farther from the origin (or
 *   "Both are equally far").
 * ====================================================================
 */

import java.util.Scanner;

class Point
{
    double x, y;

    void setPoint(double a, double b)
    {
        x = a;
        y = b;
    }

    double distance()
    {
        return Math.sqrt(x * x + y * y);
    }

    void display()
    {
        System.out.print("(" + x + ", " + y + ")");
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Point p1 = new Point();
        Point p2 = new Point();
        System.out.print("Enter x and y of the first point: ");
        p1.setPoint(sc.nextDouble(), sc.nextDouble());
        System.out.print("Enter x and y of the second point: ");
        p2.setPoint(sc.nextDouble(), sc.nextDouble());

        double d1 = p1.distance();
        double d2 = p2.distance();
        if (d1 > d2)
        {
            p1.display();
            System.out.println(" is farther from the origin");
        }
        else if (d2 > d1)
        {
            p2.display();
            System.out.println(" is farther from the origin");
        }
        else
        {
            System.out.println("Both are equally far");
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description        |
 * +----------------------+-----------+------------------------------+
 * | x                    | double    | to store the x-coordinate    |
 * | y                    | double    | to store the y-coordinate    |
 * | a                    | double    | to receive the x-coordinate  |
 * | b                    | double    | to receive the y-coordinate  |
 * | p1                   | Point     | to refer to the first point  |
 * | p2                   | Point     | to refer to the second point |
 * | d1                   | double    | to store the distance of p1  |
 * | d2                   | double    | to store the distance of p2  |
 * +----------------------+-----------+------------------------------+
 */
