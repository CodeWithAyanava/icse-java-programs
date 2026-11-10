/*
 * ====================================================================
 *   Program  : Q_34
 *   Chapter  : 05 - Mathematical Library Methods
 *   Title    : Area of a Triangle using Heron's Formula
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept the three sides of a triangle and find
 *   its area using Heron's formula:
 *
 *       s = (a + b + c) / 2
 *       Area = square root of [ s (s - a)(s - b)(s - c) ]
 *
 *   The three sides form a triangle only if all are positive and the
 *   sum of any two sides is greater than the third side. Otherwise
 *   display "Triangle not possible".
 * ====================================================================
 */

import java.util.Scanner;

public class Q_34
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the three sides: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a > 0 && b > 0 && c > 0 && a + b > c && b + c > a && c + a > b)
        {
            double s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println("Area = " + area);
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
 * +----------------------+-----------+-----------------------------+
 * | Name of the Variable | Data Type | Purpose / Description       |
 * +----------------------+-----------+-----------------------------+
 * | a                    | double    | to store the first side     |
 * | b                    | double    | to store the second side    |
 * | c                    | double    | to store the third side     |
 * | s                    | double    | to store the semi-perimeter |
 * | area                 | double    | to store the area           |
 * +----------------------+-----------+-----------------------------+
 */
