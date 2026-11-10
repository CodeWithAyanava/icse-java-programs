/*
 * ====================================================================
 *   Program  : Q_41
 *   Chapter  : 05 - Mathematical Library Methods
 *   Title    : Rolling a Pair of Dice using Math.random()
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to simulate the rolling of a pair of dice.
 *   Generate two random numbers from 1 to 6 using Math.random(),
 *   display both numbers and their sum, and display "Doubles!" if
 *   both numbers are the same.
 * ====================================================================
 */

public class Q_41
{
    public static void main(String[] args)
    {
        int d1 = (int) (Math.random() * 6) + 1;
        int d2 = (int) (Math.random() * 6) + 1;
        System.out.println("Die 1 : " + d1);
        System.out.println("Die 2 : " + d2);
        System.out.println("Sum   : " + (d1 + d2));
        if (d1 == d2)
            System.out.println("Doubles!");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description         |
 * +----------------------+-----------+-------------------------------+
 * | d1                   | int       | to store the first die value  |
 * | d2                   | int       | to store the second die value |
 * +----------------------+-----------+-------------------------------+
 */
