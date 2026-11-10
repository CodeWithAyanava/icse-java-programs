/*
 * ====================================================================
 *   Program  : Q_271
 *   Chapter  : 14 - Arrays
 *   Title    : Swap the First Half with the Second Half
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept n integers in an array and swap the
 *   first half of the array with the second half. If n is odd, the
 *   middle element stays in its place. If the size entered is less
 *   than 1, display "Invalid size".
 *
 *   Example: 1 2 3 4 5 6 -> 4 5 6 1 2 3      1 2 3 4 5 -> 4 5 3 1 2
 * ====================================================================
 */

import java.util.Scanner;

public class Q_271
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

        int half = n / 2;
        int start2 = n - half;
        for (int i = 0; i < half; i++)
        {
            int t = a[i];
            a[i] = a[start2 + i];
            a[start2 + i] = t;
        }

        System.out.print("After swapping halves: ");
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+---------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description                 |
 * +----------------------+-----------+---------------------------------------+
 * | n                    | int       | to store the size of the array        |
 * | a                    | int[]     | to store the elements                 |
 * | i                    | int       | to act as the index                   |
 * | half                 | int       | to store the size of each half        |
 * | start2               | int       | to store the start of the second half |
 * | t                    | int       | to hold a value while swapping        |
 * +----------------------+-----------+---------------------------------------+
 */
