/*
 * ====================================================================
 *   Program  : Q_344
 *   Chapter  : 15 - String Handling
 *   Title    : Login Check using concat() and equalsIgnoreCase()
 * --------------------------------------------------------------------
 *   Question :
 *
 *   A school portal creates a username by joining the first name, a
 *   dot and the last name in lowercase using concat(), e.g. Ria Sen
 *   -> ria.sen; the password is "Icse@2027". Write a program to
 *   accept a student's first name and last name, generate and
 *   display the username, then accept a username and a password for
 *   login. The username is checked with equalsIgnoreCase() and the
 *   password with equals() (case sensitive). Display "Login
 *   successful", "Wrong username" or "Wrong password".
 * ====================================================================
 */

import java.util.Scanner;

public class Q_344
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        final String PASS = "Icse@2027";
        System.out.print("Enter first name and last name: ");
        String f = sc.next();
        String l = sc.next();
        String user = f.toLowerCase().concat(".").concat(l.toLowerCase());
        System.out.println("Your username is " + user);

        System.out.print("Login - username: ");
        String u = sc.next();
        System.out.print("Login - password: ");
        String p = sc.next();

        if (!u.equalsIgnoreCase(user))
            System.out.println("Wrong username");
        else if (!p.equals(PASS))
            System.out.println("Wrong password");
        else
            System.out.println("Login successful");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+---------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description           |
 * +----------------------+-----------+---------------------------------+
 * | PASS                 | String    | to store the correct password   |
 * | f                    | String    | to store the first name         |
 * | l                    | String    | to store the last name          |
 * | user                 | String    | to store the generated username |
 * | u                    | String    | to store the username entered   |
 * | p                    | String    | to store the password entered   |
 * +----------------------+-----------+---------------------------------+
 */
