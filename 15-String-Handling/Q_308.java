/*
 * ====================================================================
 *   Program  : Q_308
 *   Chapter  : 15 - String Handling
 *   Title    : Names in Alphabetical Order using Selection Sort
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept the names of n cities in a String
 *   array and arrange them in alphabetical order using the selection
 *   sort technique (ignoring case). Display the sorted list. If the
 *   size entered is less than 1, display "Invalid size".
 * ====================================================================
 */

import java.util.Scanner;

public class Q_308
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of cities: ");
        int n = sc.nextInt();
        if (n < 1)
        {
            System.out.println("Invalid size");
            return;
        }
        sc.nextLine();
        String c[] = new String[n];
        for (int i = 0; i < n; i++)
        {
            System.out.print("City " + (i + 1) + ": ");
            c[i] = sc.nextLine().trim();
        }

        for (int i = 0; i < n - 1; i++)
        {
            int min = i;
            for (int j = i + 1; j < n; j++)
            {
                if (c[j].compareToIgnoreCase(c[min]) < 0)
                    min = j;
            }
            String t = c[i];
            c[i] = c[min];
            c[min] = t;
        }

        System.out.println("Cities in alphabetical order:");
        for (int i = 0; i < n; i++)
            System.out.println(c[i]);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-----------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description                   |
 * +----------------------+-----------+-----------------------------------------+
 * | n                    | int       | to store the number of cities           |
 * | c                    | String[]  | to store the city names                 |
 * | i                    | int       | to mark the position being filled       |
 * | min                  | int       | to store the index of the smallest name |
 * | j                    | int       | to act as the search index              |
 * | t                    | String    | to hold a name while swapping           |
 * +----------------------+-----------+-----------------------------------------+
 */
