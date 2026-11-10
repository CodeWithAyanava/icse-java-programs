/*
 * ====================================================================
 *   Program  : Q_268
 *   Chapter  : 14 - Arrays
 *   Title    : Remove Duplicate Elements
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept n integers in an array and create a
 *   new array containing only the first occurrence of each element
 *   (removing the duplicates), keeping the original order. Display
 *   the new array and the number of duplicates removed. If the size
 *   entered is less than 1, display "Invalid size".
 * ====================================================================
 */

import java.util.Scanner;

public class Q_268
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

        int b[] = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++)
        {
            boolean present = false;
            for (int j = 0; j < k; j++)
            {
                if (b[j] == a[i])
                {
                    present = true;
                    break;
                }
            }
            if (!present)
            {
                b[k] = a[i];
                k++;
            }
        }

        System.out.print("Without duplicates: ");
        for (int i = 0; i < k; i++)
            System.out.print(b[i] + " ");
        System.out.println();
        System.out.println("Duplicates removed: " + (n - k));
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
 * | b                    | int[]     | to store the unique elements     |
 * | k                    | int       | to count the unique elements     |
 * | i                    | int       | to act as the index of a         |
 * | present              | boolean   | to record whether already stored |
 * | j                    | int       | to act as the index of b         |
 * +----------------------+-----------+----------------------------------+
 */
