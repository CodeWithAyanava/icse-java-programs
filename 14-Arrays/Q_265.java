/*
 * ====================================================================
 *   Program  : Q_265
 *   Chapter  : 14 - Arrays
 *   Title    : Reverse an Array in Place
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept n integers in an array and reverse the
 *   array in place (without using another array) by swapping the
 *   first and last elements, the second and second-last elements,
 *   and so on. Display the reversed array.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_265
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

        for (int i = 0, j = n - 1; i < j; i++, j--)
        {
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
        }

        System.out.print("Reversed array: ");
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+--------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description          |
 * +----------------------+-----------+--------------------------------+
 * | n                    | int       | to store the size of the array |
 * | a                    | int[]     | to store the elements          |
 * | i                    | int       | to act as the left index       |
 * | j                    | int       | to act as the right index      |
 * | t                    | int       | to hold a value while swapping |
 * +----------------------+-----------+--------------------------------+
 */
