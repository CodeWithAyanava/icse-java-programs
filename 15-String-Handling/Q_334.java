/*
 * ====================================================================
 *   Program  : Q_334
 *   Chapter  : 15 - String Handling
 *   Title    : Username and Domain from an Email Address
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept an email address and extract the
 *   username (the part before @) and the domain (the part after @)
 *   using indexOf(), lastIndexOf() and substring(). The address is
 *   valid only if it contains exactly one @, the @ is neither the
 *   first nor the last character, and the domain contains a dot that
 *   is not its first or last character. Display "Invalid email
 *   address" otherwise.
 *
 *   Example: aarav.sen@school.edu.in -> Username: aarav.sen, Domain:
 *   school.edu.in
 * ====================================================================
 */

import java.util.Scanner;

public class Q_334
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an email address: ");
        String e = sc.nextLine().trim();
        int at = e.indexOf('@');
        boolean valid = at > 0 && at == e.lastIndexOf('@') && at < e.length() - 1;

        String user = "", domain = "";
        if (valid)
        {
            user = e.substring(0, at);
            domain = e.substring(at + 1);
            int dot = domain.indexOf('.');
            if (dot <= 0 || domain.charAt(domain.length() - 1) == '.')
                valid = false;
        }

        if (valid)
        {
            System.out.println("Username: " + user);
            System.out.println("Domain  : " + domain);
        }
        else
        {
            System.out.println("Invalid email address");
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+----------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description                  |
 * +----------------------+-----------+----------------------------------------+
 * | e                    | String    | to store the email address             |
 * | at                   | int       | to store the position of @             |
 * | valid                | boolean   | to record whether the address is valid |
 * | user                 | String    | to store the username                  |
 * | domain               | String    | to store the domain                    |
 * | dot                  | int       | to store the position of the first dot |
 * +----------------------+-----------+----------------------------------------+
 */
