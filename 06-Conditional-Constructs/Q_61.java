/*
 * ====================================================================
 *   Program  : Q_61
 *   Chapter  : 06 - Conditional Constructs in Java
 *   Title    : Taxi Fare by Distance
 * --------------------------------------------------------------------
 *   Question :
 *
 *   A taxi service charges fares as follows (slab by slab):
 *
 *       Distance                     Fare
 *       First 1 km                   Rs 25 (minimum fare)
 *       Next 4 km (1 to 5 km)        Rs 15 per km
 *       Next 5 km (5 to 10 km)       Rs 12 per km
 *       Above 10 km                  Rs 10 per km
 *
 *   Write a program to input the distance travelled (in km) and the
 *   vehicle number, and display the vehicle number, the distance and
 *   the fare. Display "Invalid distance" for a zero or negative
 *   distance.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_61
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the vehicle number: ");
        String vno = sc.next();
        System.out.print("Enter the distance (km): ");
        double km = sc.nextDouble();
        double fare;

        if (km <= 0)
        {
            System.out.println("Invalid distance");
        }
        else
        {
            if (km <= 1)
                fare = 25;
            else if (km <= 5)
                fare = 25 + (km - 1) * 15;
            else if (km <= 10)
                fare = 25 + 4 * 15 + (km - 5) * 12;
            else
                fare = 25 + 4 * 15 + 5 * 12 + (km - 10) * 10;
            System.out.println("Vehicle number : " + vno);
            System.out.println("Distance       : " + km + " km");
            System.out.println("Fare           : Rs " + fare);
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+---------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description           |
 * +----------------------+-----------+---------------------------------+
 * | vno                  | String    | to store the vehicle number     |
 * | km                   | double    | to store the distance travelled |
 * | fare                 | double    | to store the fare               |
 * +----------------------+-----------+---------------------------------+
 */
