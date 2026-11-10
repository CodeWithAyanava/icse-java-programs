/*
 * ====================================================================
 *   Program  : Q_277
 *   Chapter  : 14 - Arrays
 *   Title    : Telephone Directory: Search a Name in Parallel Arrays
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to store the names and telephone numbers of n
 *   people in two parallel arrays. Then accept a name and search for
 *   it using the linear search technique (ignoring case and extra
 *   spaces at the ends). If found, display the name with the
 *   telephone number; otherwise display "Name not found".
 * ====================================================================
 */

import java.util.Scanner;

public class Q_277
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of entries: ");
        int n = sc.nextInt();
        sc.nextLine();
        String name[] = new String[n];
        long tel[] = new long[n];
        for (int i = 0; i < n; i++)
        {
            System.out.print("Name: ");
            name[i] = sc.nextLine().trim();
            System.out.print("Telephone: ");
            tel[i] = sc.nextLong();
            sc.nextLine();
        }

        System.out.print("Enter the name to search: ");
        String key = sc.nextLine().trim();
        int pos = -1;
        for (int i = 0; i < n; i++)
        {
            if (name[i].equalsIgnoreCase(key))
            {
                pos = i;
                break;
            }
        }

        if (pos >= 0)
            System.out.println(name[pos] + " : " + tel[pos]);
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
 * | n                    | int       | to store the number of entries |
 * | name                 | String[]  | to store the names             |
 * | tel                  | long[]    | to store the telephone numbers |
 * | i                    | int       | to act as the index            |
 * | key                  | String    | to store the name to search    |
 * | pos                  | int       | to store the index where found |
 * +----------------------+-----------+--------------------------------+
 */
