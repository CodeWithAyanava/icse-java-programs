/*
 * ====================================================================
 *   Program  : Q_274
 *   Chapter  : 14 - Arrays
 *   Title    : Delete an Element from a Given Position
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept n integers in an array and a position
 *   (from 1 to n). Delete the element at that position by shifting
 *   the later elements one place to the left, and display the
 *   remaining n - 1 elements. Display "Invalid position" for a wrong
 *   position. If the size entered is less than 1, display "Invalid
 *   size".
 * ====================================================================
 */

import java.util.Scanner;

public class Q_274
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
        System.out.print("Enter the position to delete: ");
        int p = sc.nextInt();

        if (p < 1 || p > n)
        {
            System.out.println("Invalid position");
        }
        else
        {
            int del = a[p - 1];
            for (int i = p - 1; i < n - 1; i++)
                a[i] = a[i + 1];
            System.out.println("Deleted element: " + del);
            System.out.print("Remaining array: ");
            for (int i = 0; i < n - 1; i++)
                System.out.print(a[i] + " ");
            System.out.println();
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+---------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description           |
 * +----------------------+-----------+---------------------------------+
 * | n                    | int       | to store the number of elements |
 * | a                    | int[]     | to store the elements           |
 * | i                    | int       | to act as the index             |
 * | p                    | int       | to store the position           |
 * | del                  | int       | to store the deleted element    |
 * +----------------------+-----------+---------------------------------+
 */
