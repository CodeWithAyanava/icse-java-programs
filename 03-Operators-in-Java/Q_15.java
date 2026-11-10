/*
 * ====================================================================
 *   Program  : Q_15
 *   Chapter  : 03 - Operators in Java
 *   Title    : Area and Circumference of a Circle
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept the radius of a circle and calculate
 *   its area and circumference, taking the value of pi as 3.14159
 *   stored in a constant.
 *
 *       Area = pi x r x r        Circumference = 2 x pi x r
 *
 *   If the radius is zero or negative, display "Invalid radius".
 * ====================================================================
 */

import java.util.Scanner;

public class Q_15
{
    public static void main(String[] args)
    {
        final double PI = 3.14159;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double r = sc.nextDouble();

        if (r <= 0)
        {
            System.out.println("Invalid radius");
        }
        else
        {
            double area = PI * r * r;
            double circum = 2 * PI * r;
            System.out.println("Area          = " + area);
            System.out.println("Circumference = " + circum);
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-----------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description             |
 * +----------------------+-----------+-----------------------------------+
 * | PI                   | double    | to store the constant value of pi |
 * | r                    | double    | to store the radius               |
 * | area                 | double    | to store the area                 |
 * | circum               | double    | to store the circumference        |
 * +----------------------+-----------+-----------------------------------+
 */
