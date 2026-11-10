/*
 * ====================================================================
 *   Program  : Q_348
 *   Chapter  : 15 - String Handling
 *   Title    : Word Scramble Game
 * --------------------------------------------------------------------
 *   Question :
 *
 *   [Extra] Write a word scramble game. Store ten Java keywords in a
 *   String array. The computer picks one at random, scrambles it by
 *   swapping each letter with a randomly chosen letter of the word
 *   (if the result is the same as the word, it swaps the first two
 *   letters), and shows the scrambled word. The player gets three
 *   attempts to guess the word (ignoring case). Display "Correct!"
 *   or "Wrong, try again", and after three wrong attempts display
 *   the answer.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_348
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String words[] = {"public", "static", "string", "switch", "double",
                          "return", "import", "boolean", "private", "while"};
        String word = words[(int) (Math.random() * words.length)];
        int n = word.length();
        char c[] = new char[n];
        for (int i = 0; i < n; i++)
            c[i] = word.charAt(i);

        for (int i = 0; i < n; i++)
        {
            int r = (int) (Math.random() * n);
            char t = c[i];
            c[i] = c[r];
            c[r] = t;
        }
        String mixed = "";
        for (int i = 0; i < n; i++)
            mixed = mixed + c[i];
        if (mixed.equals(word))
            mixed = word.substring(1, 2) + word.substring(0, 1) + word.substring(2);

        System.out.println("Unscramble this Java keyword: " + mixed.toUpperCase());
        boolean won = false;
        for (int tries = 1; tries <= 3 && !won; tries++)
        {
            System.out.print("Attempt " + tries + ": ");
            String g = sc.next();
            if (g.equalsIgnoreCase(word))
            {
                won = true;
                System.out.println("Correct!");
            }
            else
            {
                System.out.println("Wrong, try again");
            }
        }
        if (!won)
            System.out.println("The word was: " + word);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+----------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description            |
 * +----------------------+-----------+----------------------------------+
 * | words                | String[]  | to store the keywords            |
 * | word                 | String    | to store the chosen word         |
 * | n                    | int       | to store the length of the word  |
 * | c                    | char[]    | to store the letters to scramble |
 * | i                    | int       | to act as the index              |
 * | r                    | int       | to store a random index          |
 * | t                    | char      | to hold a letter while swapping  |
 * | mixed                | String    | to store the scrambled word      |
 * | won                  | boolean   | to record whether the player won |
 * | tries                | int       | to count the attempts            |
 * | g                    | String    | to store the player's guess      |
 * +----------------------+-----------+----------------------------------+
 */
