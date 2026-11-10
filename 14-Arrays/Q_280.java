/*
 * ====================================================================
 *   Program  : Q_280
 *   Chapter  : 14 - Arrays
 *   Title    : Bubble Sort followed by Binary Search
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept n integers in an array in any order,
 *   sort them in ascending order using bubble sort, display the
 *   sorted array, and then search for a number entered by the user
 *   using binary search. Display the position of the number in the
 *   sorted array, or "Search unsuccessful".
 * ====================================================================
 */

import java.util.Scanner;

public class Q_280
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        for (int i = 0; i < n - 1; i++)
        {
            for (int j = 0; j < n - 1 - i; j++)
            {
                if (a[j] > a[j + 1])
                {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        System.out.println();

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
        if (pos >= 0)
            System.out.println("Found at position " + (pos + 1) + " of the sorted array");
        else
            System.out.println("Search unsuccessful");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description              |
 * +----------------------+-----------+------------------------------------+
 * | n                    | int       | to store the size of the array     |
 * | a                    | int[]     | to store the elements              |
 * | i                    | int       | to count the passes / act as index |
 * | j                    | int       | to act as the comparison index     |
 * | t                    | int       | to hold a value while swapping     |
 * | key                  | int       | to store the number to search      |
 * | low                  | int       | to store the lower index           |
 * | high                 | int       | to store the upper index           |
 * | pos                  | int       | to store the index where found     |
 * | mid                  | int       | to store the middle index          |
 * +----------------------+-----------+------------------------------------+
 */
