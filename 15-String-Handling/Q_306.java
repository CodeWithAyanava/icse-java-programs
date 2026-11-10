/*
 * ====================================================================
 *   Program  : Q_306
 *   Chapter  : 15 - String Handling
 *   Title    : Initials of a Name
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a person's full name and display it
 *   with the initials of all the names except the last name
 *   (surname), which is written in full.
 *
 *   Example: Mohandas Karamchand Gandhi -> M.K. Gandhi Subhas
 *   Chandra Bose -> S.C. Bose Tagore -> Tagore
 *
 *   Extra spaces in the input must be ignored, and the initials must
 *   be in uppercase.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_306
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the full name: ");
        String s = sc.nextLine().trim();
        int last = s.lastIndexOf(' ');
        String res = "";

        if (last == -1)
        {
            res = s;
        }
        else
        {
            String first = " " + s.substring(0, last);
            for (int i = 0; i < first.length() - 1; i++)
            {
                if (first.charAt(i) == ' ' && first.charAt(i + 1) != ' ')
                    res = res + Character.toUpperCase(first.charAt(i + 1)) + ".";
            }
            res = res + " " + s.substring(last + 1);
        }
        System.out.println(res);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+---------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description                 |
 * +----------------------+-----------+---------------------------------------+
 * | s                    | String    | to store the full name                |
 * | last                 | int       | to store the index of the last space  |
 * | res                  | String    | to store the abbreviated name         |
 * | first                | String    | to store the names before the surname |
 * | i                    | int       | to act as the index                   |
 * +----------------------+-----------+---------------------------------------+
 */
