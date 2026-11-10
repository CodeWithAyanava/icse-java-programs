/*
 * ====================================================================
 *   Program  : Q_49
 *   Chapter  : 06 - Conditional Constructs in Java
 *   Title    : Menu-Driven Program: Area of Circle, Square or Rectangle
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a menu-driven program using a switch statement to find the
 *   area of a circle, a square or a rectangle, according to the
 *   user's choice:
 *
 *       1. Area of a circle    = (22/7) x r x r
 *       2. Area of a square    = side x side
 *       3. Area of a rectangle = length x breadth
 *
 *   For an incorrect choice, display "Wrong choice".
 * ====================================================================
 */

import java.util.Scanner;

public class Q_49
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Area of a circle");
        System.out.println("2. Area of a square");
        System.out.println("3. Area of a rectangle");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();
        double area;

        switch (ch)
        {
            case 1:
                System.out.print("Enter the radius: ");
                double r = sc.nextDouble();
                area = 22.0 / 7 * r * r;
                System.out.println("Area of the circle = " + area);
                break;
            case 2:
                System.out.print("Enter the side: ");
                double s = sc.nextDouble();
                area = s * s;
                System.out.println("Area of the square = " + area);
                break;
            case 3:
                System.out.print("Enter length and breadth: ");
                double l = sc.nextDouble();
                double b = sc.nextDouble();
                area = l * b;
                System.out.println("Area of the rectangle = " + area);
                break;
            default:
                System.out.println("Wrong choice");
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+----------------------------+
 * | Name of the Variable | Data Type | Purpose / Description      |
 * +----------------------+-----------+----------------------------+
 * | ch                   | int       | to store the user's choice |
 * | area                 | double    | to store the area          |
 * | r                    | double    | to store the radius        |
 * | s                    | double    | to store the side          |
 * | l                    | double    | to store the length        |
 * | b                    | double    | to store the breadth       |
 * +----------------------+-----------+----------------------------+
 */
