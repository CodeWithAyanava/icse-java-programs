/*
 * ====================================================================
 *   Program  : Q_231
 *   Chapter  : 11 - Constructors
 *   Title    : Class Courier: Charges per 500 g
 *   Class    : Courier  (file Courier.java)
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Define a class Courier with the following description:
 *
 *       Instance variables:
 *       String sender; double weight (in kg); char type; double charge
 *
 *       Member methods:
 *       Courier()       : default constructor
 *       void accept()   : to accept the sender's name, the weight of the
 *                         parcel and the type ('D' domestic,
 *                         'I' international)
 *       void compute()  : to calculate the charge for every 500 g or part
 *                         thereof:
 *                           Domestic        Rs 50 per 500 g or part
 *                           International   Rs 200 per 500 g or part
 *                         (e.g. a 1.2 kg parcel counts as 3 parts of 500 g)
 *       void display()  : to display the details and the charge
 *
 *   Write a main method to create an object and call the member
 *   methods. Display "Invalid input" for a weight that is not
 *   positive or a wrong type.
 * ====================================================================
 */

import java.util.Scanner;

public class Courier
{
    String sender;
    double weight, charge;
    char type;

    Courier()
    {
        sender = "";
        weight = 0;
        type = ' ';
        charge = 0;
    }

    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sender's name: ");
        sender = sc.nextLine();
        System.out.print("Enter weight (kg): ");
        weight = sc.nextDouble();
        System.out.print("Enter type (D/I): ");
        type = sc.next().charAt(0);
    }

    void compute()
    {
        int parts = (int) Math.ceil(weight / 0.5);
        if (weight <= 0)
            charge = -1;
        else if (type == 'D' || type == 'd')
            charge = parts * 50;
        else if (type == 'I' || type == 'i')
            charge = parts * 200;
        else
            charge = -1;
    }

    void display()
    {
        if (charge < 0)
        {
            System.out.println("Invalid input");
        }
        else
        {
            System.out.println("Sender : " + sender);
            System.out.println("Weight : " + weight + " kg");
            System.out.println("Type   : " + type);
            System.out.println("Charge : Rs " + charge);
        }
    }

    public static void main(String[] args)
    {
        Courier ob = new Courier();
        ob.accept();
        ob.compute();
        ob.display();
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description              |
 * +----------------------+-----------+------------------------------------+
 * | sender               | String    | to store the sender's name         |
 * | weight               | double    | to store the weight in kg          |
 * | charge               | double    | to store the charge                |
 * | type                 | char      | to store the type of service       |
 * | parts                | int       | to store the number of 500 g parts |
 * | ob                   | Courier   | to refer to the object             |
 * +----------------------+-----------+------------------------------------+
 */
