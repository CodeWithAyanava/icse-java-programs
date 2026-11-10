/*
 * ====================================================================
 *   Program  : Q_310
 *   Chapter  : 15 - String Handling
 *   Title    : Count the Words in a Sentence
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a sentence and count the number of
 *   words in it. The sentence may have extra spaces at the
 *   beginning, at the end and between words; these must not be
 *   counted as words. Display 0 for a blank sentence.
 *
 *   Example: "   Java   is  fun  " -> Number of words = 3
 * ====================================================================
 */

import java.util.Scanner;

public class Q_310
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();
        int count = 0;

        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            boolean prevSpace = (i == 0) || s.charAt(i - 1) == ' ';
            if (ch != ' ' && prevSpace)
                count++;
        }
        System.out.println("Number of words = " + count);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-----------------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description                         |
 * +----------------------+-----------+-----------------------------------------------+
 * | s                    | String    | to store the sentence                         |
 * | count                | int       | to count the words                            |
 * | i                    | int       | to act as the index                           |
 * | ch                   | char      | to store each character                       |
 * | prevSpace            | boolean   | to check if the previous character is a space |
 * +----------------------+-----------+-----------------------------------------------+
 */
