/*
 * ====================================================================
 *   Program  : Q_217
 *   Chapter  : 11 - Constructors
 *   Title    : Class ElectricBill
 *   Class    : ElectricBill  (file ElectricBill.java)
 * --------------------------------------------------------------------
 *   Question :
 *
 *   [ICSE 2017] Define a class ElectricBill with the following
 *   specifications:
 *
 *       Instance variables:
 *       String n      : to store the name of the customer
 *       int units     : to store the number of units consumed
 *       double bill   : to store the amount to be paid
 *
 *       Member methods:
 *       ElectricBill()   : default constructor to initialise the data
 *                          members (n = "", units = 0, bill = 0.0)
 *       void accept()    : to accept the name and the units consumed
 *       void calculate() : to calculate the bill as per the tariff:
 *                            First 100 units        Rs 2.00 per unit
 *                            Next 200 units         Rs 3.00 per unit
 *                            Above 300 units        Rs 5.00 per unit
 *                          A surcharge of 2.5% is charged if the number
 *                          of units consumed is above 300 units.
 *       void print()     : to print the details as follows:
 *                            Name of the customer : ...
 *                            Number of units consumed : ...
 *                            Bill amount : ...
 *
 *   Write a main method to create an object of the class and call
 *   the above member methods.
 * ====================================================================
 */

import java.util.Scanner;

public class ElectricBill
{
    String n;
    int units;
    double bill;

    ElectricBill()
    {
        n = "";
        units = 0;
        bill = 0.0;
    }

    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the customer: ");
        n = sc.nextLine();
        System.out.print("Enter the units consumed: ");
        units = sc.nextInt();
        if (units < 0)
            units = 0;
    }

    void calculate()
    {
        if (units <= 100)
            bill = units * 2.0;
        else if (units <= 300)
            bill = 100 * 2.0 + (units - 100) * 3.0;
        else
        {
            bill = 100 * 2.0 + 200 * 3.0 + (units - 300) * 5.0;
            bill = bill + bill * 2.5 / 100;
        }
    }

    void print()
    {
        System.out.println("Name of the customer     : " + n);
        System.out.println("Number of units consumed : " + units);
        System.out.println("Bill amount              : " + bill);
    }

    public static void main(String[] args)
    {
        ElectricBill ob = new ElectricBill();
        ob.accept();
        ob.calculate();
        ob.print();
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+--------------+------------------------------+
 * | Name of the Variable | Data Type    | Purpose / Description        |
 * +----------------------+--------------+------------------------------+
 * | n                    | String       | to store the customer's name |
 * | units                | int          | to store the units consumed  |
 * | bill                 | double       | to store the bill amount     |
 * | ob                   | ElectricBill | to refer to the object       |
 * +----------------------+--------------+------------------------------+
 */
