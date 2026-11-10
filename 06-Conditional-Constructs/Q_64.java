/*
 * ====================================================================
 *   Program  : Q_64
 *   Chapter  : 06 - Conditional Constructs in Java
 *   Title    : Triangle Validity and Type by Sides
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept the three sides of a triangle and
 *   check whether the triangle is possible. A triangle is possible
 *   only if all sides are positive and the sum of any two sides is
 *   greater than the third. If it is possible, display whether it is
 *   "Equilateral Triangle" (all sides equal), "Isosceles Triangle"
 *   (exactly two sides equal) or "Scalene Triangle" (all sides
 *   different). Otherwise display "Triangle not possible".
 * ====================================================================
 */

import java.util.Scanner;

public class Q_64
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the three sides: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a > 0 && b > 0 && c > 0 && a + b > c && b + c > a && a + c > b)
        {
            if (a == b && b == c)
                System.out.println("Equilateral Triangle");
            else if (a == b || b == c || a == c)
                System.out.println("Isosceles Triangle");
            else
                System.out.println("Scalene Triangle");
        }
        else
        {
            System.out.println("Triangle not possible");
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+--------------------------+
 * | Name of the Variable | Data Type | Purpose / Description    |
 * +----------------------+-----------+--------------------------+
 * | a                    | double    | to store the first side  |
 * | b                    | double    | to store the second side |
 * | c                    | double    | to store the third side  |
 * +----------------------+-----------+--------------------------+
 */
