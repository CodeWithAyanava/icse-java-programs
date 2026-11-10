/*
 * ====================================================================
 *   Program  : Q_30
 *   Chapter  : 04 - Input in Java
 *   Title    : Distance Conversion: Kilometres to Metres, Centimetres and Miles
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a distance in kilometres and convert
 *   it into metres, centimetres and miles (1 mile = 1.609344 km).
 *   Display "Invalid distance" for a negative value.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_30
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance in km: ");
        double km = sc.nextDouble();

        if (km < 0)
        {
            System.out.println("Invalid distance");
        }
        else
        {
            double m = km * 1000;
            double cm = m * 100;
            double miles = km / 1.609344;
            System.out.println("Metres      = " + m);
            System.out.println("Centimetres = " + cm);
            System.out.println("Miles       = " + miles);
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+--------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description                |
 * +----------------------+-----------+--------------------------------------+
 * | km                   | double    | to store the distance in kilometres  |
 * | m                    | double    | to store the distance in metres      |
 * | cm                   | double    | to store the distance in centimetres |
 * | miles                | double    | to store the distance in miles       |
 * +----------------------+-----------+--------------------------------------+
 */
