/*
 * ====================================================================
 *   Program  : Q_36
 *   Chapter  : 05 - Mathematical Library Methods
 *   Title    : Distance between Two Points
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept the coordinates of two points (x1, y1)
 *   and (x2, y2) and find the distance between them.
 *
 *       Distance = square root of [ (x2 - x1)^2 + (y2 - y1)^2 ]
 * ====================================================================
 */

import java.util.Scanner;

public class Q_36
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 and y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.print("Enter x2 and y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Distance = " + dist);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+---------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description                 |
 * +----------------------+-----------+---------------------------------------+
 * | x1                   | double    | to store x-coordinate of first point  |
 * | y1                   | double    | to store y-coordinate of first point  |
 * | x2                   | double    | to store x-coordinate of second point |
 * | y2                   | double    | to store y-coordinate of second point |
 * | dist                 | double    | to store the distance                 |
 * +----------------------+-----------+---------------------------------------+
 */
