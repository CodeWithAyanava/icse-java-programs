/*
 * ====================================================================
 *   Program  : Q_46
 *   Chapter  : 06 - Conditional Constructs in Java
 *   Title    : Electricity Bill (Slab System)
 * --------------------------------------------------------------------
 *   Question :
 *
 *   An electricity board charges its consumers according to the
 *   following tariff. The rates apply slab by slab (the first 100
 *   units at the first rate, the next 200 units at the second rate,
 *   and so on).
 *
 *       Units consumed              Rate per unit
 *       First 100 units             Rs 2.00
 *       Next 200 units (101-300)    Rs 3.00
 *       Above 300 units             Rs 5.00
 *
 *   A surcharge of 2.5% of the bill is added if the units consumed
 *   exceed 300. Write a program to accept the name of the consumer
 *   and the number of units consumed, and display the name, the
 *   units and the bill amount. Display "Invalid units" if the units
 *   are negative.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_46
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the consumer's name: ");
        String name = sc.nextLine();
        System.out.print("Enter the units consumed: ");
        int units = sc.nextInt();
        double bill;

        if (units < 0)
        {
            System.out.println("Invalid units");
        }
        else
        {
            if (units <= 100)
                bill = units * 2.0;
            else if (units <= 300)
                bill = 100 * 2.0 + (units - 100) * 3.0;
            else
                bill = 100 * 2.0 + 200 * 3.0 + (units - 300) * 5.0;

            if (units > 300)
                bill = bill + bill * 2.5 / 100;

            System.out.println("Name of consumer : " + name);
            System.out.println("Units consumed   : " + units);
            System.out.println("Bill amount      : Rs " + bill);
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description        |
 * +----------------------+-----------+------------------------------+
 * | name                 | String    | to store the consumer's name |
 * | units                | int       | to store the units consumed  |
 * | bill                 | double    | to store the bill amount     |
 * +----------------------+-----------+------------------------------+
 */
