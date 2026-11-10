/*
 * ====================================================================
 *   Program  : Q_255
 *   Chapter  : 14 - Arrays
 *   Title    : Linear Search
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept n integers in a single dimensional
 *   array and a number to be searched. Search for the number using
 *   the linear search technique. If it is found, display "Search
 *   successful" and its position (counting from 1); otherwise
 *   display "Search unsuccessful". Display "Invalid size" if n is
 *   less than 1.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_255
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
        System.out.print("Enter the number to search: ");
        int key = sc.nextInt();

        int pos = -1;
        for (int i = 0; i < n; i++)
        {
            if (a[i] == key)
            {
                pos = i;
                break;
            }
        }

        if (pos != -1)
            System.out.println("Search successful, found at position " + (pos + 1));
        else
            System.out.println("Search unsuccessful");
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
 * | i                    | int       | to act as the index            |
 * | key                  | int       | to store the number to search  |
 * | pos                  | int       | to store the index where found |
 * +----------------------+-----------+--------------------------------+
 */
