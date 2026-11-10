/*
 * ====================================================================
 *   Program  : Q_25
 *   Chapter  : 04 - Input in Java
 *   Title    : Volume and Surface Area of a Cuboid
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept the length, breadth and height of a
 *   cuboid and calculate its volume and total surface area.
 *
 *       Volume = l x b x h        Total Surface Area = 2 (lb + bh + hl)
 *
 *   If any dimension is zero or negative, display "Invalid
 *   dimensions".
 * ====================================================================
 */

import java.util.Scanner;

public class Q_25
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length, breadth and height: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        double h = sc.nextDouble();

        if (l <= 0 || b <= 0 || h <= 0)
        {
            System.out.println("Invalid dimensions");
        }
        else
        {
            double vol = l * b * h;
            double tsa = 2 * (l * b + b * h + h * l);
            System.out.println("Volume             = " + vol);
            System.out.println("Total surface area = " + tsa);
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+---------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description           |
 * +----------------------+-----------+---------------------------------+
 * | l                    | double    | to store the length             |
 * | b                    | double    | to store the breadth            |
 * | h                    | double    | to store the height             |
 * | vol                  | double    | to store the volume             |
 * | tsa                  | double    | to store the total surface area |
 * +----------------------+-----------+---------------------------------+
 */
