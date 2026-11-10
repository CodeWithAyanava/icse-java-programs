/*
 * ====================================================================
 *   Program  : Q_269
 *   Chapter  : 14 - Arrays
 *   Title    : Merge Two Arrays
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept two arrays A (of size m) and B (of
 *   size n) and merge them into a third array C of size m + n, with
 *   the elements of A followed by the elements of B. Display array
 *   C. If a size entered is less than 1, display "Invalid size".
 * ====================================================================
 */

import java.util.Scanner;

public class Q_269
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array A: ");
        int m = sc.nextInt();
        if (m < 1)
        {
            System.out.println("Invalid size");
            return;
        }
        int a[] = new int[m];
        System.out.println("Enter the elements of A:");
        for (int i = 0; i < m; i++)
            a[i] = sc.nextInt();
        System.out.print("Enter the size of array B: ");
        int n = sc.nextInt();
        if (n < 1)
        {
            System.out.println("Invalid size");
            return;
        }
        int b[] = new int[n];
        System.out.println("Enter the elements of B:");
        for (int i = 0; i < n; i++)
            b[i] = sc.nextInt();

        int c[] = new int[m + n];
        for (int i = 0; i < m; i++)
            c[i] = a[i];
        for (int i = 0; i < n; i++)
            c[m + i] = b[i];

        System.out.print("Merged array C: ");
        for (int i = 0; i < m + n; i++)
            System.out.print(c[i] + " ");
        System.out.println();
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+---------------------------+
 * | Name of the Variable | Data Type | Purpose / Description     |
 * +----------------------+-----------+---------------------------+
 * | m                    | int       | to store the size of a    |
 * | a                    | int[]     | to store array a          |
 * | i                    | int       | to act as the index       |
 * | n                    | int       | to store the size of b    |
 * | b                    | int[]     | to store array b          |
 * | c                    | int[]     | to store the merged array |
 * +----------------------+-----------+---------------------------+
 */
