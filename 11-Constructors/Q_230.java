/*
 * ====================================================================
 *   Program  : Q_230
 *   Chapter  : 11 - Constructors
 *   Title    : Class Telephone: Bill from Meter Readings
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Define a class Telephone (written here as class Q_230) with the
 *   following description:
 *
 *       Instance variables:
 *       int prv, pre   : to store the previous and present meter readings
 *       int call       : to store the calls made (pre - prv)
 *       String name    : to store the name of the consumer
 *       double amt     : to store the call charges
 *       double total   : to store the total amount to be paid
 *
 *       Member methods:
 *       Telephone()     : default constructor
 *       void input()    : to accept the readings and the name; display
 *                         "Invalid readings" (and treat calls as 0) if
 *                         the present reading is less than the previous
 *       void cal()      : to calculate the charges as follows (slab by
 *                         slab):
 *                           First 100 calls        Rs 0.60 per call
 *                           Next 100 calls         Rs 0.80 per call
 *                           Next 100 calls         Rs 1.20 per call
 *                           Above 300 calls        Rs 1.50 per call
 *                         Every consumer pays a monthly rental of Rs 180.
 *       void display()  : to display the name, calls, amount and total
 *
 *   Write a main method to create an object and call the methods.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_230
{
    int prv, pre, call;
    String name;
    double amt, total;

    Q_230()
    {
        prv = 0;
        pre = 0;
        call = 0;
        name = "";
        amt = 0;
        total = 0;
    }

    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter previous and present readings: ");
        prv = sc.nextInt();
        pre = sc.nextInt();
        if (pre < prv)
        {
            System.out.println("Invalid readings");
            call = 0;
        }
        else
        {
            call = pre - prv;
        }
    }

    void cal()
    {
        if (call <= 100)
            amt = call * 0.60;
        else if (call <= 200)
            amt = 100 * 0.60 + (call - 100) * 0.80;
        else if (call <= 300)
            amt = 100 * 0.60 + 100 * 0.80 + (call - 200) * 1.20;
        else
            amt = 100 * 0.60 + 100 * 0.80 + 100 * 1.20 + (call - 300) * 1.50;
        total = amt + 180;
    }

    void display()
    {
        System.out.println("Name          : " + name);
        System.out.println("Calls made    : " + call);
        System.out.println("Call charges  : Rs " + amt);
        System.out.println("Total payable : Rs " + total);
    }

    public static void main(String[] args)
    {
        Q_230 ob = new Q_230();
        ob.input();
        ob.cal();
        ob.display();
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description         |
 * +----------------------+-----------+-------------------------------+
 * | prv                  | int       | to store the previous reading |
 * | pre                  | int       | to store the present reading  |
 * | call                 | int       | to store the calls made       |
 * | name                 | String    | to store the consumer's name  |
 * | amt                  | double    | to store the call charges     |
 * | total                | double    | to store the total amount     |
 * | ob                   | Q_230     | to refer to the object        |
 * +----------------------+-----------+-------------------------------+
 */
