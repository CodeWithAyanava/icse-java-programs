/*
 * ====================================================================
 *   Program  : Q_14
 *   Chapter  : 03 - Operators in Java
 *   Title    : Area and Perimeter of a Rectangle
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept the length and breadth of a rectangle
 *   and calculate and display its area and perimeter.
 *
 *       Area = length x breadth        Perimeter = 2 x (length + breadth)
 *
 *   If either dimension is zero or negative, display "Invalid
 *   dimensions".
 * ====================================================================
 */

import java.util.Scanner;

public class Q_14
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        double l = sc.nextDouble();
        System.out.print("Enter the breadth: ");
        double b = sc.nextDouble();

        if (l <= 0 || b <= 0)
        {
            System.out.println("Invalid dimensions");
        }
        else
        {
            double area = l * b;
            double peri = 2 * (l + b);
            System.out.println("Area      = " + area);
            System.out.println("Perimeter = " + peri);
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------+
 * | Name of the Variable | Data Type | Purpose / Description  |
 * +----------------------+-----------+------------------------+
 * | l                    | double    | to store the length    |
 * | b                    | double    | to store the breadth   |
 * | area                 | double    | to store the area      |
 * | peri                 | double    | to store the perimeter |
 * +----------------------+-----------+------------------------+
 */
