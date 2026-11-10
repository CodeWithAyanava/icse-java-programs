/*
 * ====================================================================
 *   Program  : Q_272
 *   Chapter  : 14 - Arrays
 *   Title    : Rotate an Array Left and Right by One Position
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept n integers in an array and display the
 *   array after rotating it (a) one position to the left (the first
 *   element moves to the end) and (b) one position to the right (the
 *   last element moves to the beginning), starting from the original
 *   array each time.
 *
 *   Example: 1 2 3 4 5 -> left: 2 3 4 5 1, right: 5 1 2 3 4
 * ====================================================================
 */

import java.util.Scanner;

public class Q_272
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

        int left[] = new int[n];
        int right[] = new int[n];
        for (int i = 0; i < n; i++)
        {
            left[i] = a[(i + 1) % n];
            right[i] = a[(i - 1 + n) % n];
        }

        System.out.print("Rotated left : ");
        for (int i = 0; i < n; i++)
            System.out.print(left[i] + " ");
        System.out.println();
        System.out.print("Rotated right: ");
        for (int i = 0; i < n; i++)
            System.out.print(right[i] + " ");
        System.out.println();
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
 * | left                 | int[]     | to store the left-rotated array  |
 * | right                | int[]     | to store the right-rotated array |
 * +----------------------+-----------+----------------------------------+
 */
