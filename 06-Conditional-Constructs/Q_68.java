/*
 * ====================================================================
 *   Program  : Q_68
 *   Chapter  : 06 - Conditional Constructs in Java
 *   Title    : Uppercase, Lowercase, Digit or Special Character
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a character and check whether it is an
 *   uppercase letter, a lowercase letter, a digit or a special
 *   character, using relational operators on the character (without
 *   using any library method).
 * ====================================================================
 */

import java.util.Scanner;

public class Q_68
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z')
            System.out.println("Uppercase letter");
        else if (ch >= 'a' && ch <= 'z')
            System.out.println("Lowercase letter");
        else if (ch >= '0' && ch <= '9')
            System.out.println("Digit");
        else
            System.out.println("Special character");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+--------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description          |
 * +----------------------+-----------+--------------------------------+
 * | ch                   | char      | to store the entered character |
 * +----------------------+-----------+--------------------------------+
 */
