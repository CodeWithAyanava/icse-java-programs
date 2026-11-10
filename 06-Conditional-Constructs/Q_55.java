/*
 * ====================================================================
 *   Program  : Q_55
 *   Chapter  : 06 - Conditional Constructs in Java
 *   Title    : Vowel or Consonant using switch
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a character and check whether it is a
 *   vowel or a consonant using a switch statement with fall-through
 *   for both uppercase and lowercase vowels. If the character is not
 *   a letter, display "Not an alphabet".
 * ====================================================================
 */

import java.util.Scanner;

public class Q_55
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        switch (ch)
        {
            case 'a': case 'A':
            case 'e': case 'E':
            case 'i': case 'I':
            case 'o': case 'O':
            case 'u': case 'U':
                System.out.println("Vowel");
                break;
            default:
                if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
                    System.out.println("Consonant");
                else
                    System.out.println("Not an alphabet");
        }
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
