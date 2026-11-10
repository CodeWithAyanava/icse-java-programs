/*
 * ====================================================================
 *   Program  : Q_48
 *   Chapter  : 06 - Conditional Constructs in Java
 *   Title    : Discount on Laptop or Desktop Purchase
 * --------------------------------------------------------------------
 *   Question :
 *
 *   A computer shop gives discounts on the purchase of a laptop or a
 *   desktop as follows:
 *
 *       Purchase amount (Rs)        Laptop      Desktop
 *       Up to 25,000                0.0%        5.0%
 *       25,001 to 57,000            5.0%        7.5%
 *       57,001 to 1,00,000          7.5%        10.0%
 *       More than 1,00,000          10.0%       15.0%
 *
 *   Write a program to input the purchase amount and the type of
 *   purchase ('L' for laptop, 'D' for desktop), and calculate the
 *   discount and the net amount to be paid. Display "Invalid type"
 *   for any other type and "Invalid amount" for a negative amount.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_48
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the purchase amount: ");
        double amt = sc.nextDouble();
        System.out.print("Enter type (L/D): ");
        char type = sc.next().charAt(0);
        double rate = 0;

        if (amt < 0)
        {
            System.out.println("Invalid amount");
        }
        else if (type == 'L' || type == 'l')
        {
            if (amt <= 25000)
                rate = 0;
            else if (amt <= 57000)
                rate = 5;
            else if (amt <= 100000)
                rate = 7.5;
            else
                rate = 10;
        }
        else if (type == 'D' || type == 'd')
        {
            if (amt <= 25000)
                rate = 5;
            else if (amt <= 57000)
                rate = 7.5;
            else if (amt <= 100000)
                rate = 10;
            else
                rate = 15;
        }
        else
        {
            System.out.println("Invalid type");
            rate = -1;
        }

        if (amt >= 0 && rate >= 0)
        {
            double disc = amt * rate / 100;
            double net = amt - disc;
            System.out.println("Discount   = Rs " + disc);
            System.out.println("Net amount = Rs " + net);
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description         |
 * +----------------------+-----------+-------------------------------+
 * | amt                  | double    | to store the purchase amount  |
 * | type                 | char      | to store the type of purchase |
 * | rate                 | double    | to store the discount rate    |
 * | disc                 | double    | to store the discount         |
 * | net                  | double    | to store the net amount       |
 * +----------------------+-----------+-------------------------------+
 */
