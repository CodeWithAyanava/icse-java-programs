/*
 * ====================================================================
 *   Program  : Q_318
 *   Chapter  : 15 - String Handling
 *   Title    : Count the Palindrome Words in a Sentence
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a sentence and display the palindrome
 *   words in it and their count. Ignore case, and consider only
 *   words with at least two letters.
 *
 *   Example: "MOM AND DAD ARE COMING AT NOON" -> MOM DAD NOON, count
 *   = 3
 * ====================================================================
 */

import java.util.Scanner;

public class Q_318
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine().trim() + " ";
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
                String rev = "";
                for (int j = w.length() - 1; j >= 0; j--)
                    rev = rev + w.charAt(j);
                if (w.length() > 1 && rev.equalsIgnoreCase(w))
                {
                    System.out.print(w + " ");
                    count++;
                }
                w = "";
            }
        }
        System.out.println();
        System.out.println("Number of palindrome words = " + count);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description         |
 * +----------------------+-----------+-------------------------------+
 * | s                    | String    | to store the sentence         |
 * | w                    | String    | to build each word            |
 * | count                | int       | to count the palindrome words |
 * | i                    | int       | to act as the index           |
 * | ch                   | char      | to store each character       |
 * | rev                  | String    | to store the reversed word    |
 * | j                    | int       | to act as the reverse index   |
 * +----------------------+-----------+-------------------------------+
 */
