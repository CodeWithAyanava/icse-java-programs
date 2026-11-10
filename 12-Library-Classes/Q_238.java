/*
 * ====================================================================
 *   Program  : Q_238
 *   Chapter  : 12 - Library Classes
 *   Title    : Type of a Character using Character Methods
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a character and check whether it is an
 *   uppercase letter, a lowercase letter, a digit, a whitespace
 *   character or a special character, using the methods of the
 *   Character wrapper class: isUpperCase(), isLowerCase(),
 *   isDigit(), isWhitespace() and isLetterOrDigit(). (Read a whole
 *   line so that a blank space can also be entered; if nothing is
 *   entered, display "No character entered".)
 * ====================================================================
 */

import java.util.Scanner;

public class Q_238
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String line = sc.nextLine();

        if (line.length() == 0)
        {
            System.out.println("No character entered");
        }
        else
        {
            char ch = line.charAt(0);
            if (Character.isUpperCase(ch))
                System.out.println("Uppercase letter");
            else if (Character.isLowerCase(ch))
                System.out.println("Lowercase letter");
            else if (Character.isDigit(ch))
                System.out.println("Digit");
            else if (Character.isWhitespace(ch))
                System.out.println("Whitespace character");
            else if (!Character.isLetterOrDigit(ch))
                System.out.println("Special character");
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description        |
 * +----------------------+-----------+------------------------------+
 * | line                 | String    | to store the line entered    |
 * | ch                   | char      | to store the first character |
 * +----------------------+-----------+------------------------------+
 */
