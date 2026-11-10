/*
 * ====================================================================
 *   Program  : Q_219
 *   Chapter  : 11 - Constructors
 *   Title    : Class RailwayTicket
 * --------------------------------------------------------------------
 *   Question :
 *
 *   [ICSE 2018] Design a class RailwayTicket (written here as class
 *   Q_219) with the following description:
 *
 *       Instance variables:
 *       String name     : to store the name of the customer
 *       String coach    : to store the type of coach the customer wants
 *                         to travel in
 *       long mobno      : to store the customer's mobile number
 *       int amt         : to store the basic amount of the ticket
 *       int totalamt    : to store the amount to be paid after updating
 *                         the original amount
 *
 *       Member methods:
 *       RailwayTicket() : default constructor
 *       void accept()   : to take input for name, coach, mobile number
 *                         and amount
 *       void update()   : to update the amount as per the coach selected
 *                           Type of coach      Extra amount
 *                           First_AC           700
 *                           Second_AC          500
 *                           Third_AC           250
 *                           sleeper            None
 *       void display()  : to display all the details of the customer,
 *                         such as name, coach, total amount and mobile
 *                         number
 *
 *   Write a main method to create an object and call the member
 *   methods. (The coach type is compared ignoring case.)
 * ====================================================================
 */

import java.util.Scanner;

public class Q_219
{
    String name, coach;
    long mobno;
    int amt, totalamt;

    Q_219()
    {
        name = "";
        coach = "";
        mobno = 0;
        amt = 0;
        totalamt = 0;
    }

    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter coach (First_AC/Second_AC/Third_AC/sleeper): ");
        coach = sc.next();
        System.out.print("Enter mobile number: ");
        mobno = sc.nextLong();
        System.out.print("Enter basic amount: ");
        amt = sc.nextInt();
    }

    void update()
    {
        if (coach.equalsIgnoreCase("First_AC"))
            totalamt = amt + 700;
        else if (coach.equalsIgnoreCase("Second_AC"))
            totalamt = amt + 500;
        else if (coach.equalsIgnoreCase("Third_AC"))
            totalamt = amt + 250;
        else
            totalamt = amt;
    }

    void display()
    {
        System.out.println("Name          : " + name);
        System.out.println("Coach         : " + coach);
        System.out.println("Total amount  : " + totalamt);
        System.out.println("Mobile number : " + mobno);
    }

    public static void main(String[] args)
    {
        Q_219 ob = new Q_219();
        ob.accept();
        ob.update();
        ob.display();
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description        |
 * +----------------------+-----------+------------------------------+
 * | name                 | String    | to store the customer's name |
 * | coach                | String    | to store the type of coach   |
 * | mobno                | long      | to store the mobile number   |
 * | amt                  | int       | to store the basic amount    |
 * | totalamt             | int       | to store the total amount    |
 * | ob                   | Q_219     | to refer to the object       |
 * +----------------------+-----------+------------------------------+
 */
