/*
 * ====================================================================
 *   Program  : Q_246
 *   Chapter  : 12 - Library Classes
 *   Title    : Remove Characters that are not Letters or Digits
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a sentence and remove all characters
 *   that are neither letters nor digits (keep the spaces), using
 *   Character.isLetterOrDigit() and Character.isWhitespace().
 *   Display the cleaned sentence and the number of characters
 *   removed.
 *
 *   Example: "Hi!! I'm #1 @ ICSE." -> "Hi Im 1  ICSE"
 * ====================================================================
 */

import java.util.Scanner;

public class Q_246
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();
        String res = "";
        int removed = 0;

        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch) || Character.isWhitespace(ch))
                res = res + ch;
            else
                removed++;
        }
        System.out.println("Cleaned sentence : " + res);
        System.out.println("Characters removed : " + removed);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+---------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description           |
 * +----------------------+-----------+---------------------------------+
 * | s                    | String    | to store the sentence           |
 * | res                  | String    | to store the cleaned sentence   |
 * | removed              | int       | to count the characters removed |
 * | i                    | int       | to act as the index             |
 * | ch                   | char      | to store each character         |
 * +----------------------+-----------+---------------------------------+
 */
