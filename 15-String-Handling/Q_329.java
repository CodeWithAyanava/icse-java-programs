/*
 * ====================================================================
 *   Program  : Q_329
 *   Chapter  : 15 - String Handling
 *   Title    : Output of compareTo(), compareToIgnoreCase() and equals()
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to display the results of the following
 *   comparisons and explain each result in a comment beside it:
 *
 *       "APPLE".compareTo("APPLY")        "apple".compareTo("APPLE")
 *       "BAT".compareTo("BALL")           "CAT".compareTo("CATALOG")
 *       "Zebra".compareTo("apple")        "Mango".compareToIgnoreCase("mango")
 *       "ICSE".compareTo("ICSE")          "Java".equals("java")
 *       "Java".equalsIgnoreCase("JAVA")
 * ====================================================================
 */

public class Q_329
{
    public static void main(String[] args)
    {
        String a = "APPLE", b = "APPLY", c = "apple";
        System.out.println(a.compareTo(b));                     // 'E' - 'Y' = 69 - 89 = -20
        System.out.println(c.compareTo(a));                     // 'a' - 'A' = 97 - 65 = 32
        System.out.println("BAT".compareTo("BALL"));            // 'T' - 'L' = 84 - 76 = 8
        System.out.println("CAT".compareTo("CATALOG"));         // prefix: 3 - 7 = -4 (difference in lengths)
        System.out.println("Zebra".compareTo("apple"));         // 'Z' - 'a' = 90 - 97 = -7
        System.out.println("Mango".compareToIgnoreCase("mango")); // equal ignoring case: 0
        System.out.println("ICSE".compareTo("ICSE"));           // identical strings: 0
        System.out.println("Java".equals("java"));              // case sensitive: false
        System.out.println("Java".equalsIgnoreCase("JAVA"));    // ignores case: true
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+---------------------------+
 * | Name of the Variable | Data Type | Purpose / Description     |
 * +----------------------+-----------+---------------------------+
 * | a                    | String    | to store the string APPLE |
 * | b                    | String    | to store the string APPLY |
 * | c                    | String    | to store the string apple |
 * +----------------------+-----------+---------------------------+
 */
