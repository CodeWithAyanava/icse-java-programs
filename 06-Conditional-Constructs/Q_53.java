/*
 * ====================================================================
 *   Program  : Q_53
 *   Chapter  : 06 - Conditional Constructs in Java
 *   Title    : Name of the Month and Number of Days
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a month number (1 to 12) and a year,
 *   and display the name of the month and the number of days in it
 *   using a switch statement. February has 29 days in a leap year
 *   and 28 days otherwise. A year is a leap year if it is divisible
 *   by 400, or divisible by 4 but not by 100. Display "Invalid
 *   month" for a wrong month number.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_53
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month number and year: ");
        int m = sc.nextInt();
        int y = sc.nextInt();
        String name = "";
        int days = 0;

        switch (m)
        {
            case 1:  name = "January";   days = 31; break;
            case 2:
                name = "February";
                if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
                    days = 29;
                else
                    days = 28;
                break;
            case 3:  name = "March";     days = 31; break;
            case 4:  name = "April";     days = 30; break;
            case 5:  name = "May";       days = 31; break;
            case 6:  name = "June";      days = 30; break;
            case 7:  name = "July";      days = 31; break;
            case 8:  name = "August";    days = 31; break;
            case 9:  name = "September"; days = 30; break;
            case 10: name = "October";   days = 31; break;
            case 11: name = "November";  days = 30; break;
            case 12: name = "December";  days = 31; break;
            default: name = "";
        }

        if (days == 0)
            System.out.println("Invalid month");
        else
            System.out.println(name + " " + y + " has " + days + " days");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+--------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description          |
 * +----------------------+-----------+--------------------------------+
 * | m                    | int       | to store the month number      |
 * | y                    | int       | to store the year              |
 * | name                 | String    | to store the name of the month |
 * | days                 | int       | to store the number of days    |
 * +----------------------+-----------+--------------------------------+
 */
