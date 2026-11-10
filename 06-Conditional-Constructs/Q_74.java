/*
 * ====================================================================
 *   Program  : Q_74
 *   Chapter  : 06 - Conditional Constructs in Java
 *   Title    : Rock, Paper, Scissors against the Computer
 * --------------------------------------------------------------------
 *   Question :
 *
 *   [Extra] Write a program to play one round of Rock-Paper-Scissors
 *   against the computer. The user enters R, P or S. The computer's
 *   choice is generated randomly using Math.random() (0 = Rock, 1 =
 *   Paper, 2 = Scissors). Rock beats Scissors, Scissors beats Paper
 *   and Paper beats Rock. Display both choices and the result: "You
 *   win!", "Computer wins!" or "It's a draw!". Display "Invalid
 *   choice" for any other input.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_74
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter R (Rock), P (Paper) or S (Scissors): ");
        char u = sc.next().charAt(0);
        int user;

        switch (u)
        {
            case 'R': case 'r': user = 0; break;
            case 'P': case 'p': user = 1; break;
            case 'S': case 's': user = 2; break;
            default: user = -1;
        }

        if (user == -1)
        {
            System.out.println("Invalid choice");
        }
        else
        {
            int comp = (int) (Math.random() * 3);
            String un = (user == 0) ? "Rock" : (user == 1) ? "Paper" : "Scissors";
            String cn = (comp == 0) ? "Rock" : (comp == 1) ? "Paper" : "Scissors";
            System.out.println("You chose      : " + un);
            System.out.println("Computer chose : " + cn);

            if (user == comp)
                System.out.println("It's a draw!");
            else if ((user == 0 && comp == 2) || (user == 2 && comp == 1) || (user == 1 && comp == 0))
                System.out.println("You win!");
            else
                System.out.println("Computer wins!");
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+--------------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description                      |
 * +----------------------+-----------+--------------------------------------------+
 * | u                    | char      | to store the user's letter                 |
 * | user                 | int       | to store the user's choice as a number     |
 * | comp                 | int       | to store the computer's choice             |
 * | un                   | String    | to store the name of the user's choice     |
 * | cn                   | String    | to store the name of the computer's choice |
 * +----------------------+-----------+--------------------------------------------+
 */
