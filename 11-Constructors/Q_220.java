/*
 * ====================================================================
 *   Program  : Q_220
 *   Chapter  : 11 - Constructors
 *   Title    : Class BookFair
 *   Class    : BookFair   (compile: javac Q_220.java   run: java BookFair)
 * --------------------------------------------------------------------
 *   Question :
 *
 *   [ICSE 2016] Define a class BookFair with the following
 *   description:
 *
 *       Instance variables:
 *       String Bname  : to store the name of the book
 *       double price  : to store the price of the book
 *
 *       Member methods:
 *       BookFair()       : default constructor to initialise the data
 *                          members
 *       void Input()     : to input and store the name and the price of
 *                          the book
 *       void calculate() : to calculate the price after discount.
 *                          Discount is calculated based on the following:
 *                            Price                         Discount
 *                            Less than or equal to Rs 1000    2% of price
 *                            More than Rs 1000 and less
 *                              than or equal to Rs 3000      10% of price
 *                            More than Rs 3000               15% of price
 *       void display()   : to display the name and the price of the book
 *                          after discount
 *
 *   Write a main method to create an object and call the member
 *   methods.
 * ====================================================================
 */

import java.util.Scanner;

class BookFair
{
    String Bname;
    double price;

    BookFair()
    {
        Bname = "";
        price = 0.0;
    }

    void Input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the book: ");
        Bname = sc.nextLine();
        System.out.print("Enter the price: ");
        price = sc.nextDouble();
    }

    void calculate()
    {
        double disc;
        if (price <= 1000)
            disc = price * 2 / 100;
        else if (price <= 3000)
            disc = price * 10 / 100;
        else
            disc = price * 15 / 100;
        price = price - disc;
    }

    void display()
    {
        System.out.println("Name of the book       : " + Bname);
        System.out.println("Price after discount   : " + price);
    }

    public static void main(String[] args)
    {
        BookFair ob = new BookFair();
        ob.Input();
        ob.calculate();
        ob.display();
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+--------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description          |
 * +----------------------+-----------+--------------------------------+
 * | Bname                | String    | to store the name of the book  |
 * | price                | double    | to store the price of the book |
 * | disc                 | double    | to store the discount          |
 * | ob                   | BookFair  | to refer to the object         |
 * +----------------------+-----------+--------------------------------+
 */
