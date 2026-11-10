/*
 * ====================================================================
 *   Program  : Q_54
 *   Chapter  : 06 - Conditional Constructs in Java
 *   Title    : Season of the Year using Fall-Through in switch
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a month number (1 to 12) and display
 *   the season using the fall-through property of the switch
 *   statement:
 *
 *       December, January, February           : Winter
 *       March, April, May                     : Summer
 *       June, July, August, September         : Monsoon
 *       October, November                     : Autumn
 *
 *   Display "Invalid month" for any other number.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_54
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month number: ");
        int m = sc.nextInt();

        switch (m)
        {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Summer");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println("Monsoon");
                break;
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Invalid month");
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+---------------------------+
 * | Name of the Variable | Data Type | Purpose / Description     |
 * +----------------------+-----------+---------------------------+
 * | m                    | int       | to store the month number |
 * +----------------------+-----------+---------------------------+
 */
