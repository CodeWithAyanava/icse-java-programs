/*
 * ====================================================================
 *   Program  : Q_307
 *   Chapter  : 15 - String Handling
 *   Title    : Names in Alphabetical Order using Bubble Sort
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept the names of n students in a String
 *   array and arrange them in alphabetical order using the bubble
 *   sort technique (ignore the case of letters while comparing).
 *   Display the sorted list. If the size entered is less than 1,
 *   display "Invalid size".
 * ====================================================================
 */

import java.util.Scanner;

public class Q_307
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of names: ");
        int n = sc.nextInt();
        if (n < 1)
        {
            System.out.println("Invalid size");
            return;
        }
        sc.nextLine();
        String names[] = new String[n];
        for (int i = 0; i < n; i++)
        {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = sc.nextLine().trim();
        }

        for (int i = 0; i < n - 1; i++)
        {
            for (int j = 0; j < n - 1 - i; j++)
            {
                if (names[j].compareToIgnoreCase(names[j + 1]) > 0)
                {
                    String t = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = t;
                }
            }
        }

        System.out.println("Names in alphabetical order:");
        for (int i = 0; i < n; i++)
            System.out.println(names[i]);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description              |
 * +----------------------+-----------+------------------------------------+
 * | n                    | int       | to store the number of names       |
 * | names                | String[]  | to store the names                 |
 * | i                    | int       | to count the passes / act as index |
 * | j                    | int       | to act as the comparison index     |
 * | t                    | String    | to hold a name while swapping      |
 * +----------------------+-----------+------------------------------------+
 */
