/*
 * ====================================================================
 *   Program  : Q_273
 *   Chapter  : 14 - Arrays
 *   Title    : Insert an Element at a Given Position
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept n integers in an array, a new element
 *   and a position (from 1 to n + 1). Insert the element at that
 *   position by shifting the later elements one place to the right,
 *   and display the new array. Display "Invalid position" for a
 *   wrong position.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_273
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int a[] = new int[n + 1];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        System.out.print("Enter the element to insert: ");
        int x = sc.nextInt();
        System.out.print("Enter the position: ");
        int p = sc.nextInt();

        if (p < 1 || p > n + 1)
        {
            System.out.println("Invalid position");
        }
        else
        {
            for (int i = n; i >= p; i--)
                a[i] = a[i - 1];
            a[p - 1] = x;
            System.out.print("New array: ");
            for (int i = 0; i <= n; i++)
                System.out.print(a[i] + " ");
            System.out.println();
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+--------------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description                      |
 * +----------------------+-----------+--------------------------------------------+
 * | n                    | int       | to store the number of elements            |
 * | a                    | int[]     | to store the elements with one extra place |
 * | i                    | int       | to act as the index                        |
 * | x                    | int       | to store the element to insert             |
 * | p                    | int       | to store the position                      |
 * +----------------------+-----------+--------------------------------------------+
 */
