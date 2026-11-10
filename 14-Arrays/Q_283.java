/*
 * ====================================================================
 *   Program  : Q_283
 *   Chapter  : 14 - Arrays
 *   Title    : Count of Perfect Squares in an Array
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept n integers in an array and display the
 *   elements that are perfect squares (0, 1, 4, 9, 16, ...) and
 *   their count. If the size entered is less than 1, display
 *   "Invalid size".
 * ====================================================================
 */

import java.util.Scanner;

public class Q_283
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        if (n < 1)
        {
            System.out.println("Invalid size");
            return;
        }
        int a[] = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int count = 0;
        System.out.print("Perfect squares: ");
        for (int i = 0; i < n; i++)
        {
            if (a[i] >= 0)
            {
                int r = (int) Math.round(Math.sqrt(a[i]));
                if (r * r == a[i])
                {
                    System.out.print(a[i] + " ");
                    count++;
                }
            }
        }
        System.out.println();
        System.out.println("Count = " + count);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+----------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description            |
 * +----------------------+-----------+----------------------------------+
 * | n                    | int       | to store the size of the array   |
 * | a                    | int[]     | to store the elements            |
 * | i                    | int       | to act as the index              |
 * | count                | int       | to count the perfect squares     |
 * | r                    | int       | to store the rounded square root |
 * +----------------------+-----------+----------------------------------+
 */
