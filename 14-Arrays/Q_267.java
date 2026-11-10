/*
 * ====================================================================
 *   Program  : Q_267
 *   Chapter  : 14 - Arrays
 *   Title    : Frequency of Each Element
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept n integers in an array and display the
 *   frequency (number of occurrences) of each distinct element, in
 *   the order of their first appearance. If the size entered is less
 *   than 1, display "Invalid size".
 *
 *   Example: 4 7 4 9 7 4 -> 4 occurs 3 times, 7 occurs 2 times, 9
 *   occurs 1 time
 * ====================================================================
 */

import java.util.Scanner;

public class Q_267
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

        boolean counted[] = new boolean[n];
        System.out.println("Element\tFrequency");
        for (int i = 0; i < n; i++)
        {
            if (counted[i])
                continue;
            int f = 1;
            for (int j = i + 1; j < n; j++)
            {
                if (a[j] == a[i])
                {
                    f++;
                    counted[j] = true;
                }
            }
            System.out.println(a[i] + "\t" + f);
        }
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
 * | i                    | int       | to act as the outer index        |
 * | counted              | boolean[] | to mark elements already counted |
 * | f                    | int       | to store the frequency           |
 * | j                    | int       | to act as the inner index        |
 * +----------------------+-----------+----------------------------------+
 */
