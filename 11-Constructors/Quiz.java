/*
 * ====================================================================
 *   Program  : Q_237
 *   Chapter  : 11 - Constructors
 *   Title    : Class Quiz: A Small Quiz Game
 *   Class    : Quiz  (file Quiz.java)
 * --------------------------------------------------------------------
 *   Question :
 *
 *   [Extra] Define a class Quiz to conduct a short multiple-choice
 *   quiz:
 *
 *       Instance variables:
 *       String player; int score, asked
 *
 *       Member methods:
 *       Quiz(String p) : parameterised constructor to store the player's
 *                        name and set score and asked to 0
 *       void ask(String question, String options, char answer) : to
 *                        display the question and options, accept the
 *                        player's answer (a, b, c or d) and add 1 to the
 *                        score if it is correct (ignoring case); it also
 *                        increments asked
 *       void result()  : to display the score out of the questions asked,
 *                        the percentage and a remark: "Excellent!" (80%
 *                        or more), "Good" (50% or more) or "Keep practising"
 *
 *   Use a single Scanner object shared by the whole class (a static
 *   data member). In main(), accept the player's name, create the
 *   object and ask four Java questions.
 * ====================================================================
 */

import java.util.Scanner;

public class Quiz
{
    static Scanner sc = new Scanner(System.in);
    String player;
    int score, asked;

    Quiz(String p)
    {
        player = p;
        score = 0;
        asked = 0;
    }

    void ask(String question, String options, char answer)
    {
        asked++;
        System.out.println("Q" + asked + ". " + question);
        System.out.println(options);
        System.out.print("Your answer: ");
        char reply = sc.next().charAt(0);
        if (Character.toLowerCase(reply) == answer)
        {
            score++;
            System.out.println("Correct!");
        }
        else
        {
            System.out.println("Wrong! The answer is " + answer);
        }
    }

    void result()
    {
        double per = score * 100.0 / asked;
        System.out.println(player + ", you scored " + score + " out of " + asked + " (" + per + "%)");
        if (per >= 80)
            System.out.println("Excellent!");
        else if (per >= 50)
            System.out.println("Good");
        else
            System.out.println("Keep practising");
    }

    public static void main(String[] args)
    {
        System.out.print("Enter your name: ");
        String nm = sc.nextLine();
        Quiz q = new Quiz(nm);
        q.ask("Which keyword creates an object?", "(a) class  (b) new  (c) this  (d) void", 'b');
        q.ask("What is the size of a char in Java?", "(a) 1 byte  (b) 4 bytes  (c) 2 bytes  (d) 8 bytes", 'c');
        q.ask("Which loop runs at least once?", "(a) for  (b) while  (c) nested for  (d) do-while", 'd');
        q.ask("Math.round(-2.5) returns", "(a) -2  (b) -3  (c) -2.0  (d) 2", 'a');
        q.result();
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description         |
 * +----------------------+-----------+-------------------------------+
 * | player               | String    | to store the player's name    |
 * | score                | int       | to store the score            |
 * | asked                | int       | to count the questions asked  |
 * | p                    | String    | to receive the player's name  |
 * | question             | String    | to receive the question text  |
 * | options              | String    | to receive the options text   |
 * | answer               | char      | to receive the correct option |
 * | reply                | char      | to store the player's answer  |
 * | per                  | double    | to store the percentage       |
 * | nm                   | String    | to store the name entered     |
 * | q                    | Quiz      | to refer to the quiz object   |
 * +----------------------+-----------+-------------------------------+
 */
