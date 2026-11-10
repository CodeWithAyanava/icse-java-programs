/*
 * ====================================================================
 *   Program  : Q_33
 *   Chapter  : 05 - Mathematical Library Methods
 *   Title    : Hypotenuse of a Right-Angled Triangle
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept the perpendicular and the base of a
 *   right-angled triangle and calculate its hypotenuse using the
 *   Math class.
 *
 *       Hypotenuse = square root of (perpendicular^2 + base^2)
 *
 *   Display "Invalid sides" if either side is zero or negative.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_33
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the perpendicular: ");
        double p = sc.nextDouble();
        System.out.print("Enter the base: ");
        double b = sc.nextDouble();

        if (p <= 0 || b <= 0)
        {
            System.out.println("Invalid sides");
        }
        else
        {
            double h = Math.sqrt(Math.pow(p, 2) + Math.pow(b, 2));
            System.out.println("Hypotenuse = " + h);
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+----------------------------+
 * | Name of the Variable | Data Type | Purpose / Description      |
 * +----------------------+-----------+----------------------------+
 * | p                    | double    | to store the perpendicular |
 * | b                    | double    | to store the base          |
 * | h                    | double    | to store the hypotenuse    |
 * +----------------------+-----------+----------------------------+
 */
