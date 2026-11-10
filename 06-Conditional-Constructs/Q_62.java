/*
 * ====================================================================
 *   Program  : Q_62
 *   Chapter  : 06 - Conditional Constructs in Java
 *   Title    : Leap Year Check
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a year and check whether it is a leap
 *   year or not. A year is a leap year if it is divisible by 400, or
 *   if it is divisible by 4 but not divisible by 100. Display "Leap
 *   Year" or "Not a Leap Year". Display "Invalid year" for a zero or
 *   negative year.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_62
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int y = sc.nextInt();

        if (y <= 0)
            System.out.println("Invalid year");
        else if (y % 400 == 0)
            System.out.println("Leap Year");
        else if (y % 100 == 0)
            System.out.println("Not a Leap Year");
        else if (y % 4 == 0)
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-----------------------+
 * | Name of the Variable | Data Type | Purpose / Description |
 * +----------------------+-----------+-----------------------+
 * | y                    | int       | to store the year     |
 * +----------------------+-----------+-----------------------+
 */
