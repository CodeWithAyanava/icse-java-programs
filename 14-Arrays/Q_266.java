/*
 * ====================================================================
 *   Program  : Q_266
 *   Chapter  : 14 - Arrays
 *   Title    : Second Largest Element
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept n integers in an array and find the
 *   second largest distinct element without sorting the array. If
 *   all the elements are equal (or n < 2), display "No second
 *   largest element". If the size entered is less than 1, display
 *   "Invalid size".
 *
 *   Example: 12, 45, 7, 45, 30 -> Second largest = 30
 * ====================================================================
 */

import java.util.Scanner;

public class Q_266
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

        if (n < 2)
        {
            System.out.println("No second largest element");
            return;
        }
        int first = a[0];
        for (int i = 1; i < n; i++)
        {
            if (a[i] > first)
                first = a[i];
        }
        boolean found = false;
        int second = 0;
        for (int i = 0; i < n; i++)
        {
            if (a[i] != first && (!found || a[i] > second))
            {
                second = a[i];
                found = true;
            }
        }

        if (found)
            System.out.println("Second largest = " + second);
        else
            System.out.println("No second largest element");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-----------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description             |
 * +----------------------+-----------+-----------------------------------+
 * | n                    | int       | to store the size of the array    |
 * | a                    | int[]     | to store the elements             |
 * | i                    | int       | to act as the index               |
 * | first                | int       | to store the largest element      |
 * | found                | boolean   | to record whether a second exists |
 * | second               | int       | to store the second largest       |
 * +----------------------+-----------+-----------------------------------+
 */
