/*
 * ====================================================================
 *   Program  : Q_324
 *   Chapter  : 15 - String Handling
 *   Title    : Overloading joystring()
 * --------------------------------------------------------------------
 *   Question :
 *
 *   [ICSE 2015] Design a class (written here as class Q_324) to
 *   overload a method joystring() as follows:
 *
 *       (i)   void joystring(String s, char ch1, char ch2)
 *             to replace every occurrence of ch1 with ch2 in s and print
 *             the new string
 *             Example: s = "TECHNALAGY", ch1 = 'A', ch2 = 'O'
 *                      Output: TECHNOLOGY
 *       (ii)  void joystring(String s)
 *             to print the position of the first space and the last
 *             space in s (or "No space" if there is none)
 *             Example: s = "Cloud computing means Internet based computing"
 *                      Output: First index: 5, Last index: 36
 *       (iii) void joystring(String s1, String s2)
 *             to join the two strings with a space between them using
 *             concat() and print the result
 *             Example: s1 = "COMMON WEALTH", s2 = "GAMES"
 *                      Output: COMMON WEALTH GAMES
 *
 *   Write a main method to call the methods with the example values.
 * ====================================================================
 */

public class Q_324
{
    void joystring(String s, char ch1, char ch2)
    {
        System.out.println(s.replace(ch1, ch2));
    }

    void joystring(String s)
    {
        int f = s.indexOf(' ');
        int l = s.lastIndexOf(' ');
        if (f == -1)
            System.out.println("No space");
        else
            System.out.println("First index: " + f + ", Last index: " + l);
    }

    void joystring(String s1, String s2)
    {
        System.out.println(s1.concat(" ").concat(s2));
    }

    public static void main(String[] args)
    {
        Q_324 ob = new Q_324();
        ob.joystring("TECHNALAGY", 'A', 'O');
        ob.joystring("Cloud computing means Internet based computing");
        ob.joystring("COMMON WEALTH", "GAMES");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+---------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description                 |
 * +----------------------+-----------+---------------------------------------+
 * | s                    | String    | to receive the string                 |
 * | ch1                  | char      | to receive the character to replace   |
 * | ch2                  | char      | to receive the new character          |
 * | f                    | int       | to store the index of the first space |
 * | l                    | int       | to store the index of the last space  |
 * | s1                   | String    | to receive the first string           |
 * | s2                   | String    | to receive the second string          |
 * | ob                   | Q_324     | to refer to the object                |
 * +----------------------+-----------+---------------------------------------+
 */
