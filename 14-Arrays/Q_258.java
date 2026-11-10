/*
 * ====================================================================
 *   Program  : Q_258
 *   Chapter  : 14 - Arrays
 *   Title    : Selection Sort in Ascending Order
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept n integers in an array and arrange
 *   them in ascending order using the selection sort technique.
 *   Display the sorted array.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_258
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
            int min = i;
            for (int j = i + 1; j < n; j++)
            {
                if (a[j] < a[min])
                    min = j;
            }
            int t = a[i];
            a[i] = a[min];
            a[min] = t;
        }

        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        System.out.println();
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
 * | i                    | int       | to mark the position being filled  |
 * | min                  | int       | to store the index of the smallest |
 * | j                    | int       | to act as the search index         |
 * | t                    | int       | to hold a value while swapping     |
 * +----------------------+-----------+------------------------------------+
 */
