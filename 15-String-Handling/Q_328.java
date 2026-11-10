/*
 * ====================================================================
 *   Program  : Q_328
 *   Chapter  : 15 - String Handling
 *   Title    : Output of the String Class Methods
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to store the strings s1 =
 *   "  Computer Applications  " and s2 = "ICSE" in variables and
 *   display the results of the following String methods:
 *
 *       s1.length()            s1.trim()               s1.trim().length()
 *       s2.charAt(2)           s2.toLowerCase()        s2.concat(" 2027")
 *       s1.indexOf('p')        s1.lastIndexOf('p')     s1.indexOf("tion")
 *       s1.trim().substring(9) s1.trim().substring(0, 8)
 *       s2.replace('C', 'K')   s1.trim().startsWith("Comp")
 *       s2.endsWith("se")      s2.equals("icse")       s2.equalsIgnoreCase("icse")
 *       String.valueOf(2027)   String.valueOf(3.5) + 1
 * ====================================================================
 */

public class Q_328
{
    public static void main(String[] args)
    {
        String s1 = "  Computer Applications  ";
        String s2 = "ICSE";

        System.out.println("s1.length()                  = " + s1.length());
        System.out.println("s1.trim()                    = [" + s1.trim() + "]");
        System.out.println("s1.trim().length()           = " + s1.trim().length());
        System.out.println("s2.charAt(2)                 = " + s2.charAt(2));
        System.out.println("s2.toLowerCase()             = " + s2.toLowerCase());
        System.out.println("s2.concat(\" 2027\")           = " + s2.concat(" 2027"));
        System.out.println("s1.indexOf('p')              = " + s1.indexOf('p'));
        System.out.println("s1.lastIndexOf('p')          = " + s1.lastIndexOf('p'));
        System.out.println("s1.indexOf(\"tion\")           = " + s1.indexOf("tion"));
        System.out.println("s1.trim().substring(9)       = " + s1.trim().substring(9));
        System.out.println("s1.trim().substring(0, 8)    = " + s1.trim().substring(0, 8));
        System.out.println("s2.replace('C', 'K')         = " + s2.replace('C', 'K'));
        System.out.println("s1.trim().startsWith(\"Comp\") = " + s1.trim().startsWith("Comp"));
        System.out.println("s2.endsWith(\"se\")            = " + s2.endsWith("se"));
        System.out.println("s2.equals(\"icse\")            = " + s2.equals("icse"));
        System.out.println("s2.equalsIgnoreCase(\"icse\")  = " + s2.equalsIgnoreCase("icse"));
        System.out.println("String.valueOf(2027)         = " + String.valueOf(2027));
        System.out.println("String.valueOf(3.5) + 1      = " + String.valueOf(3.5) + 1);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+----------------------------+
 * | Name of the Variable | Data Type | Purpose / Description      |
 * +----------------------+-----------+----------------------------+
 * | s1                   | String    | to store the first string  |
 * | s2                   | String    | to store the second string |
 * +----------------------+-----------+----------------------------+
 */
