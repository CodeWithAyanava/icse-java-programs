/*
 * ====================================================================
 *   Program  : Q_333
 *   Chapter  : 15 - String Handling
 *   Title    : Display Each Word with its Length
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a sentence and display each word on a
 *   separate line along with the number of characters in it,
 *   followed by the total number of words.
 *
 *   Example: "Java is fun" ->  Java 4 / is 2 / fun 3 / Total words:
 *   3
 * ====================================================================
 */

import java.util.Scanner;

public class Q_333
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
                System.out.println(w + "\t" + w.length());
                count++;
                w = "";
            }
        }
        System.out.println("Total words: " + count);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-------------------------+
 * | Name of the Variable | Data Type | Purpose / Description   |
 * +----------------------+-----------+-------------------------+
 * | s                    | String    | to store the sentence   |
 * | w                    | String    | to build each word      |
 * | count                | int       | to count the words      |
 * | i                    | int       | to act as the index     |
 * | ch                   | char      | to store each character |
 * +----------------------+-----------+-------------------------+
 */
