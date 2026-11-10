/*
 * ====================================================================
 *   Program  : Q_43
 *   Chapter  : 05 - Mathematical Library Methods
 *   Title    : Volume and Surface Area of a Sphere
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept the radius of a sphere and calculate
 *   its volume and surface area using Math.PI and Math.pow().
 *
 *       Volume = (4/3) x pi x r^3        Surface Area = 4 x pi x r^2
 *
 *   Display "Invalid radius" for a zero or negative radius.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_43
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double r = sc.nextDouble();

        if (r <= 0)
        {
            System.out.println("Invalid radius");
        }
        else
        {
            double vol = 4.0 / 3 * Math.PI * Math.pow(r, 3);
            double sa = 4 * Math.PI * Math.pow(r, 2);
            System.out.println("Volume       = " + vol);
            System.out.println("Surface area = " + sa);
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+---------------------------+
 * | Name of the Variable | Data Type | Purpose / Description     |
 * +----------------------+-----------+---------------------------+
 * | r                    | double    | to store the radius       |
 * | vol                  | double    | to store the volume       |
 * | sa                   | double    | to store the surface area |
 * +----------------------+-----------+---------------------------+
 */
