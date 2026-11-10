/*
 * ====================================================================
 *   Program  : Q_235
 *   Chapter  : 11 - Constructors
 *   Title    : Class BusConveyance
 *   Class    : BusConveyance   (compile: javac Q_235.java   run: java BusConveyance)
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Define a class BusConveyance with the following description:
 *
 *       Instance variables:
 *       String name; int age; double distance, fare
 *
 *       Member methods:
 *       BusConveyance() : default constructor
 *       void input()    : to accept the passenger's name, age and distance
 *       void calculate(): to calculate the fare (slab by slab):
 *                           First 10 km           Rs 5 per km
 *                           Next 20 km            Rs 4 per km
 *                           Above 30 km           Rs 3 per km
 *                         Senior citizens (age 60 and above) get a 30%
 *                         concession on the fare.
 *       void display()  : to display the details and the fare
 *
 *   Write a main method to create an object and call the member
 *   methods.
 * ====================================================================
 */

import java.util.Scanner;

class BusConveyance
{
    String name;
    int age;
    double distance, fare;

    BusConveyance()
    {
        name = "";
        age = 0;
        distance = 0;
        fare = 0;
    }

    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter age and distance (km): ");
        age = sc.nextInt();
        distance = sc.nextDouble();
        if (distance < 0)
            distance = 0;
    }

    void calculate()
    {
        if (distance <= 10)
            fare = distance * 5;
        else if (distance <= 30)
            fare = 10 * 5 + (distance - 10) * 4;
        else
            fare = 10 * 5 + 20 * 4 + (distance - 30) * 3;
        if (age >= 60)
            fare = fare - fare * 30 / 100;
    }

    void display()
    {
        System.out.println("Name     : " + name);
        System.out.println("Age      : " + age);
        System.out.println("Distance : " + distance + " km");
        System.out.println("Fare     : Rs " + fare);
    }

    public static void main(String[] args)
    {
        BusConveyance ob = new BusConveyance();
        ob.input();
        ob.calculate();
        ob.display();
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+---------------+-------------------------------+
 * | Name of the Variable | Data Type     | Purpose / Description         |
 * +----------------------+---------------+-------------------------------+
 * | name                 | String        | to store the passenger's name |
 * | age                  | int           | to store the age              |
 * | distance             | double        | to store the distance         |
 * | fare                 | double        | to store the fare             |
 * | ob                   | BusConveyance | to refer to the object        |
 * +----------------------+---------------+-------------------------------+
 */
