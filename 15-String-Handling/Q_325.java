/*
 * ====================================================================
 *   Program  : Q_325
 *   Chapter  : 15 - String Handling
 *   Title    : Overloading count(): Vowels and a Given Character
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Design a class (written here as class Q_325) to overload a
 *   method count() as follows:
 *
 *       (i)  int count(String s)          : returns the number of vowels
 *                                           in s (ignoring case)
 *       (ii) int count(String s, char ch) : returns the number of times
 *                                           ch occurs in s (ignoring case)
 *
 *   Write a main method to accept a sentence and a character and
 *   display both counts.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_325
{
    int count(String s)
    {
        int c = 0;
        String t = s.toLowerCase();
        for (int i = 0; i < t.length(); i++)
        {
            char ch = t.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                c++;
        }
        return c;
    }

    int count(String s, char ch)
    {
        int c = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(ch))
                c++;
        }
        return c;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Q_325 ob = new Q_325();
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();
        System.out.print("Enter a character: ");
        char x = sc.next().charAt(0);
        System.out.println("Number of vowels = " + ob.count(str));
        System.out.println("Occurrences of " + x + " = " + ob.count(str, x));
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+--------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description          |
 * +----------------------+-----------+--------------------------------+
 * | s                    | String    | to receive the string          |
 * | c                    | int       | to store the count             |
 * | t                    | String    | to store s in lowercase        |
 * | i                    | int       | to act as the index            |
 * | ch                   | char      | to store/receive a character   |
 * | str                  | String    | to store the sentence entered  |
 * | x                    | char      | to store the character entered |
 * | ob                   | Q_325     | to refer to the object         |
 * +----------------------+-----------+--------------------------------+
 */
