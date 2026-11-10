/*
 * ====================================================================
 *   Program  : Q_284
 *   Chapter  : 14 - Arrays
 *   Title    : Interchange the Largest and Smallest Elements
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept n integers in an array, find the
 *   positions of the largest and the smallest elements (first
 *   occurrence of each), and interchange these two elements. Display
 *   the array before and after the interchange.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_284
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

        System.out.print("Before: ");
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        System.out.println();

        int maxPos = 0, minPos = 0;
        for (int i = 1; i < n; i++)
        {
            if (a[i] > a[maxPos])
                maxPos = i;
            if (a[i] < a[minPos])
                minPos = i;
        }
        int t = a[maxPos];
        a[maxPos] = a[minPos];
        a[minPos] = t;

        System.out.print("After : ");
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
 * | i                    | int       | to act as the index                |
 * | maxPos               | int       | to store the index of the largest  |
 * | minPos               | int       | to store the index of the smallest |
 * | t                    | int       | to hold a value while swapping     |
 * +----------------------+-----------+------------------------------------+
 */
