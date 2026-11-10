/*
 * ====================================================================
 *   Program  : Q_176
 *   Chapter  : 09 - Class as the Basis of all Computation
 *   Title    : Class Rectangle with input(), area() and display()
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Define a class Rectangle (written here as class Q_176) with the
 *   following description:
 *
 *       Data members  : double length, breadth
 *       void input()   : to accept the length and breadth from the user
 *       double area()  : to calculate and return the area
 *       double perimeter() : to calculate and return the perimeter
 *       void display() : to display the length, breadth, area and
 *                        perimeter
 *
 *   Write a main method to create an object of the class and call
 *   the member methods. If a dimension entered is zero or negative,
 *   display "Invalid dimensions" instead of the results.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_176
{
    double length, breadth;

    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and breadth: ");
        length = sc.nextDouble();
        breadth = sc.nextDouble();
    }

    double area()
    {
        return length * breadth;
    }

    double perimeter()
    {
        return 2 * (length + breadth);
    }

    void display()
    {
        if (length <= 0 || breadth <= 0)
        {
            System.out.println("Invalid dimensions");
        }
        else
        {
            System.out.println("Length    = " + length);
            System.out.println("Breadth   = " + breadth);
            System.out.println("Area      = " + area());
            System.out.println("Perimeter = " + perimeter());
        }
    }

    public static void main(String[] args)
    {
        Q_176 r = new Q_176();
        r.input();
        r.display();
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+----------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description            |
 * +----------------------+-----------+----------------------------------+
 * | length               | double    | to store the length              |
 * | breadth              | double    | to store the breadth             |
 * | r                    | Q_176     | to refer to the rectangle object |
 * +----------------------+-----------+----------------------------------+
 */
