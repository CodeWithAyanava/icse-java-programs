/*
 * ====================================================================
 *   Program  : Q_221
 *   Chapter  : 11 - Constructors
 *   Title    : Class ParkingLot
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Define a class ParkingLot (written here as class Q_221) with the
 *   following description:
 *
 *       Instance variables:
 *       int vno       : to store the vehicle number
 *       int hours     : to store the number of hours the vehicle is parked
 *       double bill   : to store the bill amount
 *
 *       Member methods:
 *       ParkingLot()     : default constructor
 *       void input()     : to input and store the vehicle number and hours
 *       void calculate() : to compute the parking charge at the rate of
 *                          Rs 3 for the first hour or part thereof, and
 *                          Rs 1.50 for each additional hour or part thereof
 *       void display()   : to display the details
 *
 *   Write a main method to create an object and call the member
 *   methods. (Treat hours less than 1 as 1 hour.)
 * ====================================================================
 */

import java.util.Scanner;

public class Q_221
{
    int vno, hours;
    double bill;

    Q_221()
    {
        vno = 0;
        hours = 0;
        bill = 0.0;
    }

    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter vehicle number: ");
        vno = sc.nextInt();
        System.out.print("Enter hours parked: ");
        hours = sc.nextInt();
        if (hours < 1)
            hours = 1;
    }

    void calculate()
    {
        bill = 3 + (hours - 1) * 1.50;
    }

    void display()
    {
        System.out.println("Vehicle number : " + vno);
        System.out.println("Hours parked   : " + hours);
        System.out.println("Bill           : Rs " + bill);
    }

    public static void main(String[] args)
    {
        Q_221 ob = new Q_221();
        ob.input();
        ob.calculate();
        ob.display();
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-----------------------------+
 * | Name of the Variable | Data Type | Purpose / Description       |
 * +----------------------+-----------+-----------------------------+
 * | vno                  | int       | to store the vehicle number |
 * | hours                | int       | to store the hours parked   |
 * | bill                 | double    | to store the bill amount    |
 * | ob                   | Q_221     | to refer to the object      |
 * +----------------------+-----------+-----------------------------+
 */
