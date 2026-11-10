/*
 * ====================================================================
 *   Program  : Q_285
 *   Chapter  : 14 - Arrays
 *   Title    : Star Bar Chart of Ratings
 * --------------------------------------------------------------------
 *   Question :
 *
 *   [Extra] A shop collects customer ratings from 1 to 5. Write a
 *   program to accept the ratings given by n customers (ignore any
 *   rating outside 1 to 5 and count it as invalid), count how many
 *   customers gave each rating using an array of counters, and
 *   display a horizontal bar chart of stars along with the average
 *   rating.
 *
 *   Example output line:  4 | **** (4)
 * ====================================================================
 */

import java.util.Scanner;

public class Q_285
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of customers: ");
        int n = sc.nextInt();
        int freq[] = new int[6];
        int valid = 0, invalid = 0, sum = 0;

        System.out.println("Enter the ratings:");
        for (int i = 0; i < n; i++)
        {
            int r = sc.nextInt();
            if (r >= 1 && r <= 5)
            {
                freq[r]++;
                valid++;
                sum = sum + r;
            }
            else
            {
                invalid++;
            }
        }

        for (int r = 5; r >= 1; r--)
        {
            System.out.print(r + " | ");
            for (int k = 1; k <= freq[r]; k++)
                System.out.print("*");
            System.out.println(" (" + freq[r] + ")");
        }
        System.out.println("Invalid ratings ignored: " + invalid);
        if (valid > 0)
            System.out.println("Average rating: " + Math.round(sum * 100.0 / valid) / 100.0);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+--------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description                |
 * +----------------------+-----------+--------------------------------------+
 * | n                    | int       | to store the number of customers     |
 * | freq                 | int[]     | to count each rating                 |
 * | valid                | int       | to count valid ratings               |
 * | invalid              | int       | to count invalid ratings             |
 * | sum                  | int       | to store the total of valid ratings  |
 * | i                    | int       | to act as the loop counter           |
 * | r                    | int       | to store a rating / act as row index |
 * | k                    | int       | to print the stars                   |
 * +----------------------+-----------+--------------------------------------+
 */
