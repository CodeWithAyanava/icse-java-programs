/*
 * ====================================================================
 *   Program  : Q_224
 *   Chapter  : 11 - Constructors
 *   Title    : Class Mobike
 *   Class    : Mobike  (file Mobike.java)
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Define a class Mobike with the following description:
 *
 *       Instance variables:
 *       int bno      : to store the bike's number
 *       long phno    : to store the phone number of the customer
 *       String name  : to store the name of the customer
 *       int days     : to store the number of days the bike is taken on
 *                      rent
 *       int charge   : to calculate and store the rental charge
 *
 *       Member methods:
 *       Mobike()       : default constructor
 *       void input()   : to input and store the details of the customer
 *       void compute() : to compute the rental charge. The rent for a
 *                        Mobike is charged on the following basis:
 *                          First five days          Rs 500 per day
 *                          Next five days           Rs 400 per day
 *                          Rest of the days         Rs 200 per day
 *       void display() : to display the details in the following format:
 *                          Bike No.  Phone No.  Name  No. of days  Charge
 *
 *   Write a main method to create an object and call the member
 *   methods.
 * ====================================================================
 */

import java.util.Scanner;

public class Mobike
{
    int bno;
    long phno;
    String name;
    int days, charge;

    Mobike()
    {
        bno = 0;
        phno = 0;
        name = "";
        days = 0;
        charge = 0;
    }

    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter bike number: ");
        bno = sc.nextInt();
        System.out.print("Enter phone number: ");
        phno = sc.nextLong();
        sc.nextLine();
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter number of days: ");
        days = sc.nextInt();
        if (days < 0)
            days = 0;
    }

    void compute()
    {
        if (days <= 5)
            charge = days * 500;
        else if (days <= 10)
            charge = 5 * 500 + (days - 5) * 400;
        else
            charge = 5 * 500 + 5 * 400 + (days - 10) * 200;
    }

    void display()
    {
        System.out.println("Bike No.\tPhone No.\tName\tNo. of days\tCharge");
        System.out.println(bno + "\t\t" + phno + "\t" + name + "\t" + days + "\t\t" + charge);
    }

    public static void main(String[] args)
    {
        Mobike ob = new Mobike();
        ob.input();
        ob.compute();
        ob.display();
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description        |
 * +----------------------+-----------+------------------------------+
 * | bno                  | int       | to store the bike number     |
 * | phno                 | long      | to store the phone number    |
 * | name                 | String    | to store the customer's name |
 * | days                 | int       | to store the number of days  |
 * | charge               | int       | to store the rental charge   |
 * | ob                   | Mobike    | to refer to the object       |
 * +----------------------+-----------+------------------------------+
 */
