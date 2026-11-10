/*
 * ====================================================================
 *   Program  : Q_233
 *   Chapter  : 11 - Constructors
 *   Title    : Class Eshop: Discount on Online Purchase
 *   Class    : Eshop  (file Eshop.java)
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Define a class Eshop with the following description:
 *
 *       Instance variables:
 *       String name   : to store the name of the item purchased
 *       double price  : to store the price of the item
 *
 *       Member methods:
 *       Eshop()          : default constructor
 *       void accept()    : to accept the name and the price of the item
 *       void calculate() : to calculate the net amount to be paid after
 *                          discount:
 *                            Price                    Discount
 *                            1000 to 25000            5.0%
 *                            25001 to 57000           7.5%
 *                            57001 to 100000          10.0%
 *                            More than 100000         15.0%
 *                            (below 1000: no discount)
 *       void display()   : to display the name of the item and the net
 *                          amount
 *
 *   Write a main method to create an object and call the member
 *   methods.
 * ====================================================================
 */

import java.util.Scanner;

public class Eshop
{
    String name;
    double price;
    double net;

    Eshop()
    {
        name = "";
        price = 0.0;
        net = 0.0;
    }

    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter item name: ");
        name = sc.nextLine();
        System.out.print("Enter price: ");
        price = sc.nextDouble();
    }

    void calculate()
    {
        double rate;
        if (price < 1000)
            rate = 0;
        else if (price <= 25000)
            rate = 5.0;
        else if (price <= 57000)
            rate = 7.5;
        else if (price <= 100000)
            rate = 10.0;
        else
            rate = 15.0;
        net = price - price * rate / 100;
    }

    void display()
    {
        System.out.println("Item       : " + name);
        System.out.println("Net amount : Rs " + net);
    }

    public static void main(String[] args)
    {
        Eshop ob = new Eshop();
        ob.accept();
        ob.calculate();
        ob.display();
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+----------------------------+
 * | Name of the Variable | Data Type | Purpose / Description      |
 * +----------------------+-----------+----------------------------+
 * | name                 | String    | to store the item name     |
 * | price                | double    | to store the price         |
 * | net                  | double    | to store the net amount    |
 * | rate                 | double    | to store the discount rate |
 * | ob                   | Eshop     | to refer to the object     |
 * +----------------------+-----------+----------------------------+
 */
