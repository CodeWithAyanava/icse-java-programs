/*
 * ====================================================================
 *   Program  : Q_207
 *   Chapter  : 10 - User-Defined Methods
 *   Title    : Date Helper Methods: isLeap(), daysInMonth(), isValid()
 * --------------------------------------------------------------------
 *   Question :
 *
 *   [Extra] Write a program with the following methods:
 *
 *       boolean isLeap(int y)            : returns true for a leap year
 *       int daysInMonth(int m, int y)    : returns the number of days in
 *                                          month m of year y (0 for an
 *                                          invalid month)
 *       boolean isValid(int d, int m, int y) : returns true if d/m/y is a
 *                                          valid date (y > 0)
 *
 *   In main(), accept a date and display whether it is valid; if it
 *   is, also display whether its year is a leap year and how many
 *   days its month has.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_207
{
    boolean isLeap(int y)
    {
        return (y % 4 == 0 && y % 100 != 0) || y % 400 == 0;
    }

    int daysInMonth(int m, int y)
    {
        switch (m)
        {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if (isLeap(y))
                    return 29;
                else
                    return 28;
            default:
                return 0;
        }
    }

    boolean isValid(int d, int m, int y)
    {
        return y > 0 && d >= 1 && d <= daysInMonth(m, y);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Q_207 ob = new Q_207();
        System.out.print("Enter day, month and year: ");
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();

        if (ob.isValid(d, m, y))
        {
            System.out.println("Valid date");
            if (ob.isLeap(y))
                System.out.println(y + " is a leap year");
            else
                System.out.println(y + " is not a leap year");
            System.out.println("Days in this month = " + ob.daysInMonth(m, y));
        }
        else
        {
            System.out.println("Invalid date");
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+----------------------------+
 * | Name of the Variable | Data Type | Purpose / Description      |
 * +----------------------+-----------+----------------------------+
 * | y                    | int       | to store/receive the year  |
 * | m                    | int       | to store/receive the month |
 * | d                    | int       | to store/receive the day   |
 * | ob                   | Q_207     | to refer to the object     |
 * +----------------------+-----------+----------------------------+
 */
