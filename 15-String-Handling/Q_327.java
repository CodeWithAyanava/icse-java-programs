/*
 * ====================================================================
 *   Program  : Q_327
 *   Chapter  : 15 - String Handling
 *   Title    : Names Starting or Ending with Given Letters
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept n names in a String array. Then accept
 *   a starting string and an ending string, and display the names
 *   that begin with the starting string (using startsWith()) and the
 *   names that end with the ending string (using endsWith()).
 *   Comparisons are case sensitive. If the size entered is less than
 *   1, display "Invalid size".
 *
 *   Example: Names: Anita, Arnav, Rina, Asha, Ronit; start "A", end
 *   "a" -> starting with A: Anita Arnav Asha; ending with a: Anita
 *   Rina Asha
 * ====================================================================
 */

import java.util.Scanner;

public class Q_327
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
        String names[] = new String[n];
        System.out.println("Enter the names:");
        for (int i = 0; i < n; i++)
            names[i] = sc.next();
        System.out.print("Enter the starting string: ");
        String st = sc.next();
        System.out.print("Enter the ending string: ");
        String en = sc.next();

        System.out.print("Starting with " + st + ": ");
        for (int i = 0; i < n; i++)
        {
            if (names[i].startsWith(st))
                System.out.print(names[i] + " ");
        }
        System.out.println();
        System.out.print("Ending with " + en + "  : ");
        for (int i = 0; i < n; i++)
        {
            if (names[i].endsWith(en))
                System.out.print(names[i] + " ");
        }
        System.out.println();
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description        |
 * +----------------------+-----------+------------------------------+
 * | n                    | int       | to store the number of names |
 * | names                | String[]  | to store the names           |
 * | i                    | int       | to act as the index          |
 * | st                   | String    | to store the starting string |
 * | en                   | String    | to store the ending string   |
 * +----------------------+-----------+------------------------------+
 */
