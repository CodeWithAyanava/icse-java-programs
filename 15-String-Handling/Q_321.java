/*
 * ====================================================================
 *   Program  : Q_321
 *   Chapter  : 15 - String Handling
 *   Title    : Remove the Vowels from a Sentence
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a sentence and remove all the vowels
 *   (uppercase and lowercase) from it. Display the new sentence and
 *   the number of vowels removed.
 *
 *   Example: "Computer Applications" -> "Cmptr pplctns" (8 vowels
 *   removed)
 * ====================================================================
 */

import java.util.Scanner;

public class Q_321
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
            char lc = Character.toLowerCase(ch);
            if (lc == 'a' || lc == 'e' || lc == 'i' || lc == 'o' || lc == 'u')
                removed++;
            else
                res = res + ch;
        }
        System.out.println(res);
        System.out.println("Vowels removed: " + removed);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+--------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description                |
 * +----------------------+-----------+--------------------------------------+
 * | s                    | String    | to store the sentence                |
 * | res                  | String    | to store the sentence without vowels |
 * | removed              | int       | to count the vowels removed          |
 * | i                    | int       | to act as the index                  |
 * | ch                   | char      | to store each character              |
 * | lc                   | char      | to store the lowercase form of ch    |
 * +----------------------+-----------+--------------------------------------+
 */
