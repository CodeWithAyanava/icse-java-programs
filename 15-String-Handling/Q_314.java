/*
 * ====================================================================
 *   Program  : Q_314
 *   Chapter  : 15 - String Handling
 *   Title    : Toggle the Case of Each Letter
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a sentence and toggle the case of each
 *   letter (uppercase to lowercase and lowercase to uppercase).
 *   Other characters remain unchanged.
 *
 *   Example: "Hello World 2027!" -> "hELLO wORLD 2027!"
 * ====================================================================
 */

import java.util.Scanner;

public class Q_314
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();
        String res = "";

        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch))
                res = res + Character.toLowerCase(ch);
            else if (Character.isLowerCase(ch))
                res = res + Character.toUpperCase(ch);
            else
                res = res + ch;
        }
        System.out.println(res);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description         |
 * +----------------------+-----------+-------------------------------+
 * | s                    | String    | to store the sentence         |
 * | res                  | String    | to store the toggled sentence |
 * | i                    | int       | to act as the index           |
 * | ch                   | char      | to store each character       |
 * +----------------------+-----------+-------------------------------+
 */
