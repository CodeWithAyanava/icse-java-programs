/*
 * ====================================================================
 *   Program  : Q_241
 *   Chapter  : 12 - Library Classes
 *   Title    : Adding Numbers Entered as Strings
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept two numbers as strings (each may be a
 *   whole number or a decimal number, and may begin with a minus
 *   sign). Display:
 *
 *       (a) the result of joining the two strings with +
 *       (b) their sum, using Double.parseDouble()
 *       (c) their sum, using Integer.parseInt(), only if both are whole
 *           numbers
 *
 *   Use a method boolean isNumber(String s) to check that a string
 *   is a valid number (digits with at most one decimal point and an
 *   optional leading minus sign) before converting it; if not,
 *   display "Invalid number".
 * ====================================================================
 */

import java.util.Scanner;

public class Q_241
{
    static boolean isNumber(String s)
    {
        int start = 0, dots = 0, digits = 0;
        if (s.length() > 0 && s.charAt(0) == '-')
            start = 1;
        for (int i = start; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if (ch == '.')
                dots++;
            else if (Character.isDigit(ch))
                digits++;
            else
                return false;
        }
        return digits > 0 && dots <= 1;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        String a = sc.next();
        String b = sc.next();

        if (!isNumber(a) || !isNumber(b))
        {
            System.out.println("Invalid number");
        }
        else
        {
            System.out.println("(a) a + b as strings : " + a + b);
            double sum = Double.parseDouble(a) + Double.parseDouble(b);
            System.out.println("(b) sum as double    : " + sum);
            if (a.indexOf('.') == -1 && b.indexOf('.') == -1 && a.length() <= 9 && b.length() <= 9)
                System.out.println("(c) sum as int       : " + (Integer.parseInt(a) + Integer.parseInt(b)));
            else
                System.out.println("(c) not both whole numbers (int range)");
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+--------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description                |
 * +----------------------+-----------+--------------------------------------+
 * | s                    | String    | to receive the string to check       |
 * | start                | int       | to store the index to start checking |
 * | dots                 | int       | to count decimal points              |
 * | digits               | int       | to count digits                      |
 * | i                    | int       | to act as the index                  |
 * | ch                   | char      | to store each character              |
 * | a                    | String    | to store the first number            |
 * | b                    | String    | to store the second number           |
 * | sum                  | double    | to store the sum                     |
 * +----------------------+-----------+--------------------------------------+
 */
