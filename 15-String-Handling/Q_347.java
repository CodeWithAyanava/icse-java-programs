/*
 * ====================================================================
 *   Program  : Q_347
 *   Chapter  : 15 - String Handling
 *   Title    : Caesar Cipher: Encrypt and Decrypt
 * --------------------------------------------------------------------
 *   Question :
 *
 *   [Extra] In a Caesar cipher, each letter is shifted forward by a
 *   key k (from 1 to 25) in the alphabet, wrapping around after Z;
 *   decryption shifts it back by k. Write a program with the
 *   methods:
 *
 *       String encrypt(String s, int k)
 *       String decrypt(String s, int k)
 *
 *   that keep the case of letters and leave other characters
 *   unchanged. In main(), accept a message and a key, display the
 *   encrypted text, and decrypt it back to show the original
 *   message. Display "Invalid key" for a key outside 1 to 25.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_347
{
    static String encrypt(String s, int k)
    {
        String res = "";
        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch))
                ch = (char) ('A' + (ch - 'A' + k) % 26);
            else if (Character.isLowerCase(ch))
                ch = (char) ('a' + (ch - 'a' + k) % 26);
            res = res + ch;
        }
        return res;
    }

    static String decrypt(String s, int k)
    {
        return encrypt(s, 26 - k);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the message: ");
        String msg = sc.nextLine();
        System.out.print("Enter the key (1-25): ");
        int key = sc.nextInt();

        if (key < 1 || key > 25)
        {
            System.out.println("Invalid key");
            return;
        }
        String enc = encrypt(msg, key);
        System.out.println("Encrypted: " + enc);
        System.out.println("Decrypted: " + decrypt(enc, key));
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-----------------------------+
 * | Name of the Variable | Data Type | Purpose / Description       |
 * +----------------------+-----------+-----------------------------+
 * | s                    | String    | to receive the text         |
 * | k                    | int       | to receive the key          |
 * | res                  | String    | to build the result         |
 * | i                    | int       | to act as the index         |
 * | ch                   | char      | to store each character     |
 * | msg                  | String    | to store the message        |
 * | key                  | int       | to store the key            |
 * | enc                  | String    | to store the encrypted text |
 * +----------------------+-----------+-----------------------------+
 */
