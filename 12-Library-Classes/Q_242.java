/*
 * ====================================================================
 *   Program  : Q_242
 *   Chapter  : 12 - Library Classes
 *   Title    : Output of the Wrapper Class Methods
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to store the strings "123", "9876543210", "2.5"
 *   and "3.75" and the characters '7', 'x', '@', 'a', '\t' (tab),
 *   'Q', 'q' and '5' in variables, and display the results of the
 *   following wrapper class methods:
 *
 *       Integer.parseInt("123") + 1        Long.parseLong("9876543210")
 *       Float.parseFloat("2.5")            Double.parseDouble("3.75") * 2
 *       Character.isDigit('7')             Character.isLetter('x')
 *       Character.isLetterOrDigit('@')     Character.isLowerCase('a')
 *       Character.isUpperCase('a')         Character.isWhitespace('\t')
 *       Character.toLowerCase('Q')         Character.toUpperCase('q')
 *       Character.toUpperCase('5')
 * ====================================================================
 */

public class Q_242
{
    public static void main(String[] args)
    {
        String si = "123", sl = "9876543210", sf = "2.5", sd = "3.75";
        char c1 = '7', c2 = 'x', c3 = '@', c4 = 'a', c5 = '\t', c6 = 'Q', c7 = 'q', c8 = '5';

        System.out.println("Integer.parseInt(\"123\") + 1    = " + (Integer.parseInt(si) + 1));
        System.out.println("Long.parseLong(\"9876543210\")   = " + Long.parseLong(sl));
        System.out.println("Float.parseFloat(\"2.5\")        = " + Float.parseFloat(sf));
        System.out.println("Double.parseDouble(\"3.75\") * 2 = " + (Double.parseDouble(sd) * 2));
        System.out.println("Character.isDigit('7')         = " + Character.isDigit(c1));
        System.out.println("Character.isLetter('x')        = " + Character.isLetter(c2));
        System.out.println("Character.isLetterOrDigit('@') = " + Character.isLetterOrDigit(c3));
        System.out.println("Character.isLowerCase('a')     = " + Character.isLowerCase(c4));
        System.out.println("Character.isUpperCase('a')     = " + Character.isUpperCase(c4));
        System.out.println("Character.isWhitespace('\\t')   = " + Character.isWhitespace(c5));
        System.out.println("Character.toLowerCase('Q')     = " + Character.toLowerCase(c6));
        System.out.println("Character.toUpperCase('q')     = " + Character.toUpperCase(c7));
        System.out.println("Character.toUpperCase('5')     = " + Character.toUpperCase(c8));
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+----------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description            |
 * +----------------------+-----------+----------------------------------+
 * | si                   | String    | to store an integer in text form |
 * | sl                   | String    | to store a long in text form     |
 * | sf                   | String    | to store a float in text form    |
 * | sd                   | String    | to store a double in text form   |
 * | c1                   | char      | to store the digit character '7' |
 * | c2                   | char      | to store the letter 'x'          |
 * | c3                   | char      | to store the symbol '@'          |
 * | c4                   | char      | to store the letter 'a'          |
 * | c5                   | char      | to store the tab character       |
 * | c6                   | char      | to store the letter 'Q'          |
 * | c7                   | char      | to store the letter 'q'          |
 * | c8                   | char      | to store the digit character '5' |
 * +----------------------+-----------+----------------------------------+
 */
