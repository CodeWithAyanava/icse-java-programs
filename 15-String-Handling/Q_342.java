/*
 * ====================================================================
 *   Program  : Q_342
 *   Chapter  : 15 - String Handling
 *   Title    : Anagram Check
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Two words or phrases are anagrams if they contain the same
 *   letters the same number of times (ignoring case and spaces),
 *   e.g. LISTEN and SILENT, "Dormitory" and "Dirty room". Write a
 *   program to accept two strings and check whether they are
 *   anagrams, using an array of 26 counters. Display "Anagrams" or
 *   "Not Anagrams".
 * ====================================================================
 */

import java.util.Scanner;

public class Q_342
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String a = sc.nextLine().toUpperCase();
        System.out.print("Enter the second string: ");
        String b = sc.nextLine().toUpperCase();
        int count[] = new int[26];

        for (int i = 0; i < a.length(); i++)
        {
            char ch = a.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                count[ch - 'A']++;
        }
        for (int i = 0; i < b.length(); i++)
        {
            char ch = b.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                count[ch - 'A']--;
        }

        boolean ana = true;
        for (int i = 0; i < 26; i++)
        {
            if (count[i] != 0)
            {
                ana = false;
                break;
            }
        }
        if (ana)
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+---------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description                 |
 * +----------------------+-----------+---------------------------------------+
 * | a                    | String    | to store the first string             |
 * | b                    | String    | to store the second string            |
 * | count                | int[]     | to store the letter count differences |
 * | i                    | int       | to act as the index                   |
 * | ch                   | char      | to store each character               |
 * | ana                  | boolean   | to record whether they are anagrams   |
 * +----------------------+-----------+---------------------------------------+
 */
