/*
 * ====================================================================
 *   Program  : Q_71
 *   Chapter  : 06 - Conditional Constructs in Java
 *   Title    : Profit or Loss and its Percentage
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept the cost price and the selling price
 *   of an article and determine whether the seller has made a profit
 *   or a loss, and the percentage of profit or loss. If there is
 *   neither, display "No profit, no loss".
 *
 *       Profit% = (Profit / Cost price) x 100    Loss% = (Loss / Cost price) x 100
 *
 *   Display "Invalid input" if the cost price is zero or negative,
 *   or the selling price is negative.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_71
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost price and selling price: ");
        double cp = sc.nextDouble();
        double sp = sc.nextDouble();

        if (cp <= 0 || sp < 0)
        {
            System.out.println("Invalid input");
        }
        else if (sp > cp)
        {
            double profit = sp - cp;
            System.out.println("Profit = Rs " + profit + ", Profit% = " + (profit / cp * 100));
        }
        else if (sp < cp)
        {
            double loss = cp - sp;
            System.out.println("Loss = Rs " + loss + ", Loss% = " + (loss / cp * 100));
        }
        else
        {
            System.out.println("No profit, no loss");
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+----------------------------+
 * | Name of the Variable | Data Type | Purpose / Description      |
 * +----------------------+-----------+----------------------------+
 * | cp                   | double    | to store the cost price    |
 * | sp                   | double    | to store the selling price |
 * | profit               | double    | to store the profit        |
 * | loss                 | double    | to store the loss          |
 * +----------------------+-----------+----------------------------+
 */
