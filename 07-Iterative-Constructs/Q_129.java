/*
 * ====================================================================
 *   Program  : Q_129
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : Number Guessing Game
 * --------------------------------------------------------------------
 *   Question :
 *
 *   [Extra] Write a program for a number guessing game. The computer
 *   chooses a secret number from 1 to 100 using Math.random(). The
 *   user gets at most 7 attempts. After each wrong guess, display
 *   "Too high!" or "Too low!". If the user guesses correctly,
 *   display "Correct! You guessed it in <k> attempts." (or "1
 *   attempt.") and stop. If all attempts are used up, display "Out
 *   of attempts! The number was <secret>."
 * ====================================================================
 */

import java.util.Scanner;

public class Q_129
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int secret = (int) (Math.random() * 100) + 1;
        boolean won = false;
        int attempt;

        for (attempt = 1; attempt <= 7; attempt++)
        {
            System.out.print("Attempt " + attempt + " - enter your guess: ");
            int guess = sc.nextInt();
            if (guess == secret)
            {
                won = true;
                break;
            }
            else if (guess > secret)
            {
                System.out.println("Too high!");
            }
            else
            {
                System.out.println("Too low!");
            }
        }

        if (won)
            System.out.println("Correct! You guessed it in " + attempt + (attempt == 1 ? " attempt." : " attempts."));
        else
            System.out.println("Out of attempts! The number was " + secret + ".");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+--------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description          |
 * +----------------------+-----------+--------------------------------+
 * | secret               | int       | to store the secret number     |
 * | won                  | boolean   | to record whether the user won |
 * | attempt              | int       | to count the attempts          |
 * | guess                | int       | to store the user's guess      |
 * +----------------------+-----------+--------------------------------+
 */
