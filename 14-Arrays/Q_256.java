/*
 * ====================================================================
 *   Program  : Q_256
 *   Chapter  : 14 - Arrays
 *   Title    : Binary Search
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept n integers in ascending order in an
 *   array and a number to be searched. Search for the number using
 *   the binary search technique and display its position (counting
 *   from 1) if found; otherwise display "Search unsuccessful". If
 *   the numbers entered are not in ascending order, display "Array
 *   is not sorted" and stop.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_256
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
        System.out.println("Enter " + n + " integers in ascending order:");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        for (int i = 0; i < n - 1; i++)
        {
            if (a[i] > a[i + 1])
            {
                System.out.println("Array is not sorted");
                return;
            }
        }

        System.out.print("Enter the number to search: ");
        int key = sc.nextInt();
        int low = 0, high = n - 1, pos = -1;
        while (low <= high)
        {
            int mid = (low + high) / 2;
            if (a[mid] == key)
            {
                pos = mid;
                break;
            }
            else if (a[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }

        if (pos != -1)
            System.out.println("Search successful, found at position " + (pos + 1));
        else
            System.out.println("Search unsuccessful");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+--------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description          |
 * +----------------------+-----------+--------------------------------+
 * | n                    | int       | to store the size of the array |
 * | a                    | int[]     | to store the sorted elements   |
 * | i                    | int       | to act as the index            |
 * | key                  | int       | to store the number to search  |
 * | low                  | int       | to store the lower index       |
 * | high                 | int       | to store the upper index       |
 * | pos                  | int       | to store the index where found |
 * | mid                  | int       | to store the middle index      |
 * +----------------------+-----------+--------------------------------+
 */
