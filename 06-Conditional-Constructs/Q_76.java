/*
 * ====================================================================
 *   Program  : Q_76
 *   Chapter  : 06 - Conditional Constructs in Java
 *   Title    : Valid Date Checker
 * --------------------------------------------------------------------
 *   Question :
 *
 *   [Extra] Write a program to accept a date as three integers (day,
 *   month and year) and check whether it is a valid date. Take leap
 *   years into account (a year is a leap year if it is divisible by
 *   400, or divisible by 4 but not by 100). Display "Valid Date" or
 *   "Invalid Date". Years must be positive.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_76
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day, month and year: ");
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();
        int maxDay = 0;

        switch (m)
        {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                maxDay = 31;
                break;
            case 4: case 6: case 9: case 11:
                maxDay = 30;
                break;
            case 2:
                if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
                    maxDay = 29;
                else
                    maxDay = 28;
                break;
            default:
                maxDay = 0;
        }

        if (y > 0 && d >= 1 && d <= maxDay)
            System.out.println("Valid Date");
        else
            System.out.println("Invalid Date");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+--------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description          |
 * +----------------------+-----------+--------------------------------+
 * | d                    | int       | to store the day               |
 * | m                    | int       | to store the month             |
 * | y                    | int       | to store the year              |
 * | maxDay               | int       | to store the days in the month |
 * +----------------------+-----------+--------------------------------+
 */
