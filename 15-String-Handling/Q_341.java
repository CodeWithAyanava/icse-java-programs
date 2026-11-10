/*
 * ====================================================================
 *   Program  : Q_341
 *   Chapter  : 15 - String Handling
 *   Title    : First Non-Repeating Character
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a word and display the first character
 *   that does not repeat anywhere in the word (ignoring case). If
 *   every character repeats, display "No non-repeating character".
 *
 *   Example: "swiss" -> w, "Programming" -> P, "aabb" -> No non-
 *   repeating character
 * ====================================================================
 */

import java.util.Scanner;

public class Q_341
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String w = sc.next();
        String low = w.toLowerCase();
        int pos = -1;

        for (int i = 0; i < low.length(); i++)
        {
            char ch = low.charAt(i);
            if (low.indexOf(ch) == low.lastIndexOf(ch))
            {
                pos = i;
                break;
            }
        }
        if (pos == -1)
            System.out.println("No non-repeating character");
        else
            System.out.println("First non-repeating character: " + w.charAt(pos));
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+--------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description          |
 * +----------------------+-----------+--------------------------------+
 * | w                    | String    | to store the word              |
 * | low                  | String    | to store the word in lowercase |
 * | pos                  | int       | to store the position found    |
 * | i                    | int       | to act as the index            |
 * | ch                   | char      | to store each character        |
 * +----------------------+-----------+--------------------------------+
 */
