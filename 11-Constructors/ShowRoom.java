/*
 * ====================================================================
 *   Program  : Q_218
 *   Chapter  : 11 - Constructors
 *   Title    : Class ShowRoom
 *   Class    : ShowRoom  (file ShowRoom.java)
 * --------------------------------------------------------------------
 *   Question :
 *
 *   [ICSE 2019] Define a class ShowRoom with the following
 *   description:
 *
 *       Instance variables:
 *       String name   : to store the name of the customer
 *       long mobno    : to store the mobile number of the customer
 *       double cost   : to store the cost of the items purchased
 *       double dis    : to store the discount amount
 *       double amount : to store the amount to be paid after discount
 *
 *       Member methods:
 *       ShowRoom()       : default constructor to initialise the data
 *                          members
 *       void input()     : to input the customer name, mobile number and
 *                          cost
 *       void calculate() : to calculate the discount on the cost of the
 *                          purchased items, based on the following:
 *                            Cost                         Discount (%)
 *                            Less than or equal to 10000      5%
 *                            10001 to 20000                  10%
 *                            20001 to 35000                  15%
 *                            More than 35000                 20%
 *       void display()   : to display the customer name, mobile number
 *                          and the amount to be paid after discount
 *
 *   Write a main method to create an object and call the member
 *   methods.
 * ====================================================================
 */

import java.util.Scanner;

public class ShowRoom
{
    String name;
    long mobno;
    double cost, dis, amount;

    ShowRoom()
    {
        name = "";
        mobno = 0;
        cost = 0;
        dis = 0;
        amount = 0;
    }

    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        name = sc.nextLine();
        System.out.print("Enter mobile number: ");
        mobno = sc.nextLong();
        System.out.print("Enter cost: ");
        cost = sc.nextDouble();
    }

    void calculate()
    {
        int rate;
        if (cost <= 10000)
            rate = 5;
        else if (cost <= 20000)
            rate = 10;
        else if (cost <= 35000)
            rate = 15;
        else
            rate = 20;
        dis = cost * rate / 100;
        amount = cost - dis;
    }

    void display()
    {
        System.out.println("Customer name : " + name);
        System.out.println("Mobile number : " + mobno);
        System.out.println("Amount to pay : " + amount);
    }

    public static void main(String[] args)
    {
        ShowRoom ob = new ShowRoom();
        ob.input();
        ob.calculate();
        ob.display();
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+----------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description            |
 * +----------------------+-----------+----------------------------------+
 * | name                 | String    | to store the customer's name     |
 * | mobno                | long      | to store the mobile number       |
 * | cost                 | double    | to store the cost of items       |
 * | dis                  | double    | to store the discount            |
 * | amount               | double    | to store the amount to be paid   |
 * | rate                 | int       | to store the discount percentage |
 * | ob                   | ShowRoom  | to refer to the object           |
 * +----------------------+-----------+----------------------------------+
 */
