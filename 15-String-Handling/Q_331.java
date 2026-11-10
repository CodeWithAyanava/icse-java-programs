/*
 * ====================================================================
 *   Program  : Q_331
 *   Chapter  : 15 - String Handling
 *   Title    : Word with the Maximum Number of Vowels
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a sentence and display the word having
 *   the maximum number of vowels, along with that number. If two or
 *   more words have the same maximum, display the first one.
 *
 *   Example: "Education is the key to opportunity" -> Education (5
 *   vowels)
 * ====================================================================
 */

import java.util.Scanner;

public class Q_331
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine().trim() + " ";
        String w = "", best = "";
        int max = -1;

        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if (ch != ' ')
            {
                w = w + ch;
            }
            else if (w.length() > 0)
            {
                int v = 0;
                for (int j = 0; j < w.length(); j++)
                {
                    char c = Character.toLowerCase(w.charAt(j));
                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                        v++;
                }
                if (v > max)
                {
                    max = v;
                    best = w;
                }
                w = "";
            }
        }
        if (max < 0)
            System.out.println("No words entered");
        else
            System.out.println(best + " (" + max + " vowels)");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-----------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description                   |
 * +----------------------+-----------+-----------------------------------------+
 * | s                    | String    | to store the sentence                   |
 * | w                    | String    | to build each word                      |
 * | best                 | String    | to store the word with most vowels      |
 * | max                  | int       | to store the maximum vowel count        |
 * | i                    | int       | to act as the index                     |
 * | ch                   | char      | to store each character                 |
 * | v                    | int       | to count the vowels in a word           |
 * | j                    | int       | to act as the index within a word       |
 * | c                    | char      | to store a lowercase letter of the word |
 * +----------------------+-----------+-----------------------------------------+
 */
