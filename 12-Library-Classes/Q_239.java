/*
 * ====================================================================
 *   Program  : Q_239
 *   Chapter  : 12 - Library Classes
 *   Title    : Count Uppercase, Lowercase, Digits, Spaces and Special Characters
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a sentence and count the number of
 *   uppercase letters, lowercase letters, digits, whitespace
 *   characters and special characters in it, using the methods of
 *   the Character class.
 *
 *   Example: "ICSE 2027 Exam!" -> Uppercase: 5, Lowercase: 3,
 *   Digits: 4, Spaces: 2, Special: 1
 * ====================================================================
 */

import java.util.Scanner;

public class Q_239
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();
        int up = 0, low = 0, dig = 0, sp = 0, spl = 0;

        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch))
                up++;
            else if (Character.isLowerCase(ch))
                low++;
            else if (Character.isDigit(ch))
                dig++;
            else if (Character.isWhitespace(ch))
                sp++;
            else
                spl++;
        }

        System.out.println("Uppercase letters  : " + up);
        System.out.println("Lowercase letters  : " + low);
        System.out.println("Digits             : " + dig);
        System.out.println("Spaces             : " + sp);
        System.out.println("Special characters : " + spl);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+--------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description          |
 * +----------------------+-----------+--------------------------------+
 * | s                    | String    | to store the sentence          |
 * | up                   | int       | to count uppercase letters     |
 * | low                  | int       | to count lowercase letters     |
 * | dig                  | int       | to count digits                |
 * | sp                   | int       | to count whitespace characters |
 * | spl                  | int       | to count special characters    |
 * | i                    | int       | to act as the index            |
 * | ch                   | char      | to store each character        |
 * +----------------------+-----------+--------------------------------+
 */
