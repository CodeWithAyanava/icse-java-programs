/*
 * ====================================================================
 *   Program  : Q_72
 *   Chapter  : 06 - Conditional Constructs in Java
 *   Title    : Quadrant of a Point
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept the coordinates (x, y) of a point and
 *   display its position: "Origin", "On the X-axis", "On the
 *   Y-axis", "First quadrant", "Second quadrant", "Third quadrant"
 *   or "Fourth quadrant".
 * ====================================================================
 */

import java.util.Scanner;

public class Q_72
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x and y: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if (x == 0 && y == 0)
            System.out.println("Origin");
        else if (y == 0)
            System.out.println("On the X-axis");
        else if (x == 0)
            System.out.println("On the Y-axis");
        else if (x > 0 && y > 0)
            System.out.println("First quadrant");
        else if (x < 0 && y > 0)
            System.out.println("Second quadrant");
        else if (x < 0 && y < 0)
            System.out.println("Third quadrant");
        else
            System.out.println("Fourth quadrant");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+---------------------------+
 * | Name of the Variable | Data Type | Purpose / Description     |
 * +----------------------+-----------+---------------------------+
 * | x                    | double    | to store the x-coordinate |
 * | y                    | double    | to store the y-coordinate |
 * +----------------------+-----------+---------------------------+
 */
