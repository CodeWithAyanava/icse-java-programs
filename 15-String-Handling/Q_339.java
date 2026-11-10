/*
 * ====================================================================
 *   Program  : Q_339
 *   Chapter  : 15 - String Handling
 *   Title    : Words that Begin and End with a Vowel
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a sentence and display the words that
 *   begin and end with a vowel (ignoring case), and their count.
 *
 *   Example: "Anna ate an orange in Asia" -> Anna ate orange Asia,
 *   count = 4
 * ====================================================================
 */

import java.util.Scanner;

public class Q_339
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine().trim() + " ";
        String vowels = "AEIOU";
        String w = "";
        int count = 0;

        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if (ch != ' ')
            {
                w = w + ch;
            }
            else if (w.length() > 0)
            {
                char f = Character.toUpperCase(w.charAt(0));
                char l = Character.toUpperCase(w.charAt(w.length() - 1));
                if (vowels.indexOf(f) != -1 && vowels.indexOf(l) != -1)
                {
                    System.out.print(w + " ");
                    count++;
                }
                w = "";
            }
        }
        System.out.println();
        System.out.println("Count = " + count);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+---------------------------+
 * | Name of the Variable | Data Type | Purpose / Description     |
 * +----------------------+-----------+---------------------------+
 * | s                    | String    | to store the sentence     |
 * | vowels               | String    | to store the vowels       |
 * | w                    | String    | to build each word        |
 * | count                | int       | to count the words        |
 * | i                    | int       | to act as the index       |
 * | ch                   | char      | to store each character   |
 * | f                    | char      | to store the first letter |
 * | l                    | char      | to store the last letter  |
 * +----------------------+-----------+---------------------------+
 */
