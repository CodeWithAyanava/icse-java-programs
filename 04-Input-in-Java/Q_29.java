/*
 * ====================================================================
 *   Program  : Q_29
 *   Chapter  : 04 - Input in Java
 *   Title    : Bill Amount after a 10% Discount
 * --------------------------------------------------------------------
 *   Question :
 *
 *   A shop gives a discount of 10% on the total cost of an item.
 *   Write a program to accept the price of one item and the quantity
 *   purchased, and calculate and display the total cost, the
 *   discount and the amount to be paid. Display "Invalid input" if
 *   the price or the quantity is negative.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_29
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of one item: ");
        double price = sc.nextDouble();
        System.out.print("Enter the quantity: ");
        int qty = sc.nextInt();

        if (price < 0 || qty < 0)
        {
            System.out.println("Invalid input");
        }
        else
        {
            double cost = price * qty;
            double disc = cost * 10 / 100;
            double pay = cost - disc;
            System.out.println("Total cost     = " + cost);
            System.out.println("Discount (10%) = " + disc);
            System.out.println("Amount to pay  = " + pay);
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+--------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description          |
 * +----------------------+-----------+--------------------------------+
 * | price                | double    | to store the price of one item |
 * | qty                  | int       | to store the quantity          |
 * | cost                 | double    | to store the total cost        |
 * | disc                 | double    | to store the discount          |
 * | pay                  | double    | to store the amount to be paid |
 * +----------------------+-----------+--------------------------------+
 */
