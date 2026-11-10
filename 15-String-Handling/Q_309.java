/*
 * ====================================================================
 *   Program  : Q_309
 *   Chapter  : 15 - String Handling
 *   Title    : Linear Search for a Name
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept the names of n students in a String
 *   array and a name to be searched. Search for the name using
 *   linear search (ignoring case and extra spaces at the ends) and
 *   display "Name found at position <p>" or "Name not found".
 * ====================================================================
 */

import java.util.Scanner;

public class Q_309
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of names: ");
        int n = sc.nextInt();
        sc.nextLine();
        String names[] = new String[n];
        for (int i = 0; i < n; i++)
        {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = sc.nextLine().trim();
        }
        System.out.print("Enter the name to search: ");
        String key = sc.nextLine().trim();

        int pos = -1;
        for (int i = 0; i < n; i++)
        {
            if (names[i].equalsIgnoreCase(key))
            {
                pos = i;
                break;
            }
        }
        if (pos != -1)
            System.out.println("Name found at position " + (pos + 1));
        else
            System.out.println("Name not found");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+--------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description          |
 * +----------------------+-----------+--------------------------------+
 * | n                    | int       | to store the number of names   |
 * | names                | String[]  | to store the names             |
 * | i                    | int       | to act as the index            |
 * | key                  | String    | to store the name to search    |
 * | pos                  | int       | to store the index where found |
 * +----------------------+-----------+--------------------------------+
 */
