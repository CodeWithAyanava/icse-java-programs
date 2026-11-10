/*
 * ====================================================================
 *   Program  : Q_229
 *   Chapter  : 11 - Constructors
 *   Title    : Class Hotel: Room Bill
 *   Class    : Hotel   (compile: javac Q_229.java   run: java Hotel)
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Define a class Hotel with the following description:
 *
 *       Instance variables:
 *       String guest; char roomType; int days; double bill
 *
 *       Member methods:
 *       Hotel()        : default constructor
 *       void input()   : to accept the guest's name, the room type
 *                        ('S' single, 'D' double, 'U' suite) and the
 *                        number of days of stay
 *       void compute() : to calculate the bill using the daily tariff
 *                          Single Rs 1500, Double Rs 2500, Suite Rs 4000
 *                        A GST of 12% is added if the bill exceeds
 *                        Rs 7500; otherwise 5% is added.
 *       void display() : to display the guest name, room type, days and
 *                        the bill
 *
 *   Write a main method to create an object and call the methods.
 *   For a wrong room type display "Invalid room type".
 * ====================================================================
 */

import java.util.Scanner;

class Hotel
{
    String guest;
    char roomType;
    int days;
    double bill;

    Hotel()
    {
        guest = "";
        roomType = ' ';
        days = 0;
        bill = 0;
    }

    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter guest name: ");
        guest = sc.nextLine();
        System.out.print("Enter room type (S/D/U): ");
        roomType = sc.next().charAt(0);
        System.out.print("Enter number of days: ");
        days = sc.nextInt();
    }

    void compute()
    {
        int rate;
        switch (roomType)
        {
            case 'S': case 's': rate = 1500; break;
            case 'D': case 'd': rate = 2500; break;
            case 'U': case 'u': rate = 4000; break;
            default: rate = -1;
        }
        if (rate < 0 || days < 1)
        {
            bill = -1;
        }
        else
        {
            bill = rate * days;
            if (bill > 7500)
                bill = bill + bill * 12 / 100;
            else
                bill = bill + bill * 5 / 100;
        }
    }

    void display()
    {
        if (bill < 0)
        {
            System.out.println("Invalid room type");
        }
        else
        {
            System.out.println("Guest     : " + guest);
            System.out.println("Room type : " + roomType);
            System.out.println("Days      : " + days);
            System.out.println("Bill      : Rs " + bill);
        }
    }

    public static void main(String[] args)
    {
        Hotel ob = new Hotel();
        ob.input();
        ob.compute();
        ob.display();
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+---------------------------+
 * | Name of the Variable | Data Type | Purpose / Description     |
 * +----------------------+-----------+---------------------------+
 * | guest                | String    | to store the guest's name |
 * | roomType             | char      | to store the room type    |
 * | days                 | int       | to store the days of stay |
 * | bill                 | double    | to store the bill         |
 * | rate                 | int       | to store the daily tariff |
 * | ob                   | Hotel     | to refer to the object    |
 * +----------------------+-----------+---------------------------+
 */
