/*
 * ====================================================================
 *   Program  : Q_225
 *   Chapter  : 11 - Constructors
 *   Title    : Class CabService
 *   Class    : CabService   (compile: javac Q_225.java   run: java CabService)
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Define a class CabService with the following description:
 *
 *       Instance variables:
 *       String car_type : to store the type of car ("AC" or "NON AC")
 *       double km       : to store the kilometres travelled
 *       double bill     : to calculate and store the bill amount
 *
 *       Member methods:
 *       CabService()     : default constructor to initialise the data
 *                          members (String to "" and double to 0.0)
 *       void accept()    : to accept car_type and km
 *       void calculate() : to calculate the bill as per the rules:
 *                            Car type    Up to 5 km    Beyond 5 km
 *                            AC          Rs 150        Rs 10 per km extra
 *                            NON AC      Rs 120        Rs 8 per km extra
 *       void display()   : to display the bill in the format
 *                            CAR TYPE  : ...
 *                            KILOMETRE TRAVELLED : ...
 *                            TOTAL BILL : ...
 *
 *   Write a main method to create an object and call the member
 *   methods. Display "Invalid car type" for any other type.
 * ====================================================================
 */

import java.util.Scanner;

class CabService
{
    String car_type;
    double km, bill;

    CabService()
    {
        car_type = "";
        km = 0.0;
        bill = 0.0;
    }

    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter car type (AC / NON AC): ");
        car_type = sc.nextLine().trim().toUpperCase();
        System.out.print("Enter kilometres travelled: ");
        km = sc.nextDouble();
    }

    void calculate()
    {
        if (car_type.equals("AC"))
            bill = (km <= 5) ? 150 : 150 + (km - 5) * 10;
        else if (car_type.equals("NON AC"))
            bill = (km <= 5) ? 120 : 120 + (km - 5) * 8;
        else
            bill = -1;
    }

    void display()
    {
        if (bill < 0)
        {
            System.out.println("Invalid car type");
        }
        else
        {
            System.out.println("CAR TYPE            : " + car_type);
            System.out.println("KILOMETRE TRAVELLED : " + km);
            System.out.println("TOTAL BILL          : " + bill);
        }
    }

    public static void main(String[] args)
    {
        CabService ob = new CabService();
        ob.accept();
        ob.calculate();
        ob.display();
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+------------+-----------------------------------+
 * | Name of the Variable | Data Type  | Purpose / Description             |
 * +----------------------+------------+-----------------------------------+
 * | car_type             | String     | to store the type of car          |
 * | km                   | double     | to store the kilometres travelled |
 * | bill                 | double     | to store the bill amount          |
 * | ob                   | CabService | to refer to the object            |
 * +----------------------+------------+-----------------------------------+
 */
