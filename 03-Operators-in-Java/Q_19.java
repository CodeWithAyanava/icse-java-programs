/*
 * ====================================================================
 *   Program  : Q_19
 *   Chapter  : 03 - Operators in Java
 *   Title    : Convert Days into Years, Months and Days
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a number of days and convert it into
 *   years, months and days, assuming 1 year = 365 days and 1 month =
 *   30 days.
 *
 *   Example: Input: 1005    Output: 2 years 9 months 5 days
 *
 *   Display "Invalid input" for a negative value.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_19
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int days = sc.nextInt();

        if (days < 0)
        {
            System.out.println("Invalid input");
        }
        else
        {
            int y = days / 365;
            int rem = days % 365;
            int m = rem / 30;
            int d = rem % 30;
            System.out.println(y + " years " + m + " months " + d + " days");
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description              |
 * +----------------------+-----------+------------------------------------+
 * | days                 | int       | to store the number of days        |
 * | y                    | int       | to store the number of years       |
 * | rem                  | int       | to store the days left after years |
 * | m                    | int       | to store the number of months      |
 * | d                    | int       | to store the remaining days        |
 * +----------------------+-----------+------------------------------------+
 */
