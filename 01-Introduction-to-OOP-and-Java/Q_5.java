/*
 * ====================================================================
 *   Program  : Q_5
 *   Chapter  : 01 - Introduction to OOP and Java
 *   Title    : Class Car: Two Objects, Same Behaviour, Different States
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Define a class Car (written here as class Q_5) to show that
 *   objects of the same class share behaviour but have their own
 *   state.
 *
 *       Data members : String brand, int speed
 *       void setBrand(String b) : to assign the brand and set speed to 0
 *       void accelerate(int inc) : to increase the speed by inc
 *       void brake(int dec)      : to decrease the speed by dec; the
 *                                  speed must never become negative
 *       void show()              : to display the brand and the speed
 *
 *   In the main method, create two objects. Send the messages
 *   accelerate(60) and brake(20) to the first car, and
 *   accelerate(40) and brake(70) to the second car, displaying the
 *   state of each car after every message.
 * ====================================================================
 */

public class Q_5
{
    String brand;
    int speed;

    void setBrand(String b)
    {
        brand = b;
        speed = 0;
    }

    void accelerate(int inc)
    {
        speed = speed + inc;
    }

    void brake(int dec)
    {
        speed = speed - dec;
        if (speed < 0)
            speed = 0;
    }

    void show()
    {
        System.out.println(brand + " is moving at " + speed + " km/h");
    }

    public static void main(String[] args)
    {
        Q_5 car1 = new Q_5();
        Q_5 car2 = new Q_5();
        car1.setBrand("Tata Nexon");
        car2.setBrand("Maruti Swift");

        car1.accelerate(60);
        car1.show();
        car1.brake(20);
        car1.show();

        car2.accelerate(40);
        car2.show();
        car2.brake(70);
        car2.show();
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-----------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description             |
 * +----------------------+-----------+-----------------------------------+
 * | brand                | String    | to store the brand of the car     |
 * | speed                | int       | to store the current speed        |
 * | b                    | String    | to receive the brand name         |
 * | inc                  | int       | to receive the increase in speed  |
 * | dec                  | int       | to receive the decrease in speed  |
 * | car1                 | Q_5       | to refer to the first car object  |
 * | car2                 | Q_5       | to refer to the second car object |
 * +----------------------+-----------+-----------------------------------+
 */
