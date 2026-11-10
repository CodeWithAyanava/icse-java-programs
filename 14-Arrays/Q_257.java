/*
 * ====================================================================
 *   Program  : Q_257
 *   Chapter  : 14 - Arrays
 *   Title    : Bubble Sort in Ascending Order
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept n integers in an array and arrange
 *   them in ascending order using the bubble sort technique. Display
 *   the array before and after sorting. If the size entered is less
 *   than 1, display "Invalid size".
 * ====================================================================
 */

import java.util.Scanner;

public class Q_257
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

        System.out.print("Before sorting: ");
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        System.out.println();

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

        System.out.print("After sorting : ");
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
 * | i                    | int       | to count the passes / act as index |
 * | j                    | int       | to act as the comparison index     |
 * | t                    | int       | to hold a value while swapping     |
 * +----------------------+-----------+------------------------------------+
 */
