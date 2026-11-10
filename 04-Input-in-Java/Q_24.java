/*
 * ====================================================================
 *   Program  : Q_24
 *   Chapter  : 04 - Input in Java
 *   Title    : Input using Every Scanner Method
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept the following data from the user using
 *   the appropriate methods of the Scanner class and display them:
 *
 *       (a) a short integer     - nextShort()
 *       (b) an integer          - nextInt()
 *       (c) a long integer      - nextLong()
 *       (d) a float value       - nextFloat()
 *       (e) a double value      - nextDouble()
 *       (f) a single word       - next()
 *       (g) a single character  - next().charAt(0)
 *       (h) a complete sentence - nextLine()
 *
 *   Take care that the sentence is read correctly after the other
 *   inputs.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_24
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a short integer: ");
        short s = sc.nextShort();
        System.out.print("Enter an integer: ");
        int i = sc.nextInt();
        System.out.print("Enter a long integer: ");
        long l = sc.nextLong();
        System.out.print("Enter a float value: ");
        float f = sc.nextFloat();
        System.out.print("Enter a double value: ");
        double d = sc.nextDouble();
        System.out.print("Enter a word: ");
        String word = sc.next();
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        sc.nextLine();
        System.out.print("Enter a sentence: ");
        String line = sc.nextLine();

        System.out.println();
        System.out.println("short     : " + s);
        System.out.println("int       : " + i);
        System.out.println("long      : " + l);
        System.out.println("float     : " + f);
        System.out.println("double    : " + d);
        System.out.println("word      : " + word);
        System.out.println("character : " + ch);
        System.out.println("sentence  : " + line);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description        |
 * +----------------------+-----------+------------------------------+
 * | s                    | short     | to store the short integer   |
 * | i                    | int       | to store the integer         |
 * | l                    | long      | to store the long integer    |
 * | f                    | float     | to store the float value     |
 * | d                    | double    | to store the double value    |
 * | word                 | String    | to store a single word       |
 * | ch                   | char      | to store a single character  |
 * | line                 | String    | to store a complete sentence |
 * +----------------------+-----------+------------------------------+
 */
