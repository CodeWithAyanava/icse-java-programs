/*
 * ====================================================================
 *   Program  : Q_57
 *   Chapter  : 06 - Conditional Constructs in Java
 *   Title    : Courier Charges by Weight and Type
 * --------------------------------------------------------------------
 *   Question :
 *
 *   A courier company charges for parcels as follows:
 *
 *       Weight of parcel              Ordinary        Express
 *       Up to 5 kg (minimum charge)   Rs 80           Rs 150
 *       For each kg from 5 to 10 kg   Rs 15 per kg    Rs 25 per kg
 *       For each kg above 10 kg       Rs 10 per kg    Rs 20 per kg
 *
 *   Write a program to input the weight of the parcel (in kg) and
 *   the type of service ('O' for ordinary, 'E' for express) and
 *   calculate the charge. Display "Invalid input" for a zero or
 *   negative weight or a wrong type.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_57
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight (kg): ");
        double w = sc.nextDouble();
        System.out.print("Enter type (O/E): ");
        char t = sc.next().charAt(0);
        double charge = 0;

        if (w <= 0)
        {
            System.out.println("Invalid input");
        }
        else if (t == 'O' || t == 'o')
        {
            if (w <= 5)
                charge = 80;
            else if (w <= 10)
                charge = 80 + (w - 5) * 15;
            else
                charge = 80 + 5 * 15 + (w - 10) * 10;
            System.out.println("Ordinary charge = Rs " + charge);
        }
        else if (t == 'E' || t == 'e')
        {
            if (w <= 5)
                charge = 150;
            else if (w <= 10)
                charge = 150 + (w - 5) * 25;
            else
                charge = 150 + 5 * 25 + (w - 10) * 20;
            System.out.println("Express charge = Rs " + charge);
        }
        else
        {
            System.out.println("Invalid input");
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-----------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description             |
 * +----------------------+-----------+-----------------------------------+
 * | w                    | double    | to store the weight of the parcel |
 * | t                    | char      | to store the type of service      |
 * | charge               | double    | to store the courier charge       |
 * +----------------------+-----------+-----------------------------------+
 */
