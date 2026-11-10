/*
 * ====================================================================
 *   Program  : Q_3
 *   Chapter  : 01 - Introduction to OOP and Java
 *   Title    : Quotation and File Path using Escape Sequences
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to display the following three lines exactly as
 *   shown, using the escape sequences \", \' and \\ wherever
 *   required:
 *
 *       Swami Vivekananda said, "Arise, awake and stop not till the goal is reached."
 *       It's Java's 'Write Once, Run Anywhere' promise.
 *       File saved at: C:\ICSE\Java\Q_3.java
 * ====================================================================
 */

public class Q_3
{
    public static void main(String[] args)
    {
        String person = "Swami Vivekananda";
        char apos = '\'';

        System.out.println(person + " said, \"Arise, awake and stop not till the goal is reached.\"");
        System.out.println("It" + apos + "s Java" + apos + "s 'Write Once, Run Anywhere' promise.");
        System.out.println("File saved at: C:\\ICSE\\Java\\Q_3.java");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-----------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description             |
 * +----------------------+-----------+-----------------------------------+
 * | person               | String    | to store the name of the speaker  |
 * | apos                 | char      | to store the apostrophe character |
 * +----------------------+-----------+-----------------------------------+
 */
