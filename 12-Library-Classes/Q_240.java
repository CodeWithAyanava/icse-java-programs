/*
 * ====================================================================
 *   Program  : Q_240
 *   Chapter  : 12 - Library Classes
 *   Title    : Change the Case of a Character
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a character. If it is an uppercase
 *   letter, convert it to lowercase; if it is a lowercase letter,
 *   convert it to uppercase, using Character.toLowerCase() and
 *   Character.toUpperCase(). Otherwise display the message "<ch> is
 *   not a letter".
 * ====================================================================
 */

import java.util.Scanner;

public class Q_240
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (Character.isUpperCase(ch))
            System.out.println(ch + " becomes " + Character.toLowerCase(ch));
        else if (Character.isLowerCase(ch))
            System.out.println(ch + " becomes " + Character.toUpperCase(ch));
        else
            System.out.println(ch + " is not a letter");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------+
 * | Name of the Variable | Data Type | Purpose / Description  |
 * +----------------------+-----------+------------------------+
 * | ch                   | char      | to store the character |
 * +----------------------+-----------+------------------------+
 */
