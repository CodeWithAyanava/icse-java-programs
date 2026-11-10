/*
 * ====================================================================
 *   Program  : Q_270
 *   Chapter  : 14 - Arrays
 *   Title    : Split an Array into Even and Odd Arrays
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept n integers in an array and store the
 *   even elements in one array and the odd elements in another
 *   array. Display both arrays.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_270
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

        int even[] = new int[n];
        int odd[] = new int[n];
        int e = 0, o = 0;
        for (int i = 0; i < n; i++)
        {
            if (a[i] % 2 == 0)
                even[e++] = a[i];
            else
                odd[o++] = a[i];
        }

        System.out.print("Even array: ");
        for (int i = 0; i < e; i++)
            System.out.print(even[i] + " ");
        System.out.println();
        System.out.print("Odd array : ");
        for (int i = 0; i < o; i++)
            System.out.print(odd[i] + " ");
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
 * | i                    | int       | to act as the index            |
 * | even                 | int[]     | to store the even elements     |
 * | odd                  | int[]     | to store the odd elements      |
 * | e                    | int       | to count the even elements     |
 * | o                    | int       | to count the odd elements      |
 * +----------------------+-----------+--------------------------------+
 */
