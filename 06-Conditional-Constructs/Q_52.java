/*
 * ====================================================================
 *   Program  : Q_52
 *   Chapter  : 06 - Conditional Constructs in Java
 *   Title    : Day of the Week using switch
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a number from 1 to 7 and display the
 *   corresponding day of the week using a switch statement (1 =
 *   Sunday, 2 = Monday, ..., 7 = Saturday). For any other number,
 *   display "Invalid day number".
 * ====================================================================
 */

import java.util.Scanner;

public class Q_52
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a day number (1-7): ");
        int d = sc.nextInt();

        switch (d)
        {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day number");
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-------------------------+
 * | Name of the Variable | Data Type | Purpose / Description   |
 * +----------------------+-----------+-------------------------+
 * | d                    | int       | to store the day number |
 * +----------------------+-----------+-------------------------+
 */
