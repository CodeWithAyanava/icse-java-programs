/*
 * ====================================================================
 *   Program  : Q_18
 *   Chapter  : 03 - Operators in Java
 *   Title    : Convert Seconds into Hours, Minutes and Seconds
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a time in seconds and convert it into
 *   hours, minutes and seconds using the / and % operators.
 *
 *   Example: Input: 7384    Output: 2 hours 3 minutes 4 seconds
 *
 *   Display "Invalid input" for a negative value.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_18
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter time in seconds: ");
        long total = sc.nextLong();

        if (total < 0)
        {
            System.out.println("Invalid input");
        }
        else
        {
            long h = total / 3600;
            long m = (total % 3600) / 60;
            long s = total % 60;
            System.out.println(h + " hours " + m + " minutes " + s + " seconds");
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+--------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description          |
 * +----------------------+-----------+--------------------------------+
 * | total                | long      | to store the time in seconds   |
 * | h                    | long      | to store the hours             |
 * | m                    | long      | to store the remaining minutes |
 * | s                    | long      | to store the remaining seconds |
 * +----------------------+-----------+--------------------------------+
 */
