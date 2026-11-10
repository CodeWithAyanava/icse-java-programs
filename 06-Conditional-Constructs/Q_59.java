/*
 * ====================================================================
 *   Program  : Q_59
 *   Chapter  : 06 - Conditional Constructs in Java
 *   Title    : Commission on Sales
 * --------------------------------------------------------------------
 *   Question :
 *
 *   A company pays its salesmen a commission on their total sales as
 *   follows:
 *
 *       Sales (Rs)                   Commission
 *       Up to 25,000                 5% of sales
 *       25,001 to 50,000             7.5% of sales
 *       50,001 to 1,00,000           10% of sales
 *       More than 1,00,000           12% of sales
 *
 *   Write a program to input the name and the sales of a salesman
 *   and display the name and the commission earned. Display "Invalid
 *   sales" for a negative value.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_59
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the salesman's name: ");
        String name = sc.nextLine();
        System.out.print("Enter the sales: ");
        double sales = sc.nextDouble();
        double rate;

        if (sales < 0)
        {
            System.out.println("Invalid sales");
        }
        else
        {
            if (sales <= 25000)
                rate = 5;
            else if (sales <= 50000)
                rate = 7.5;
            else if (sales <= 100000)
                rate = 10;
            else
                rate = 12;
            double comm = sales * rate / 100;
            System.out.println("Name       : " + name);
            System.out.println("Commission : Rs " + comm);
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description        |
 * +----------------------+-----------+------------------------------+
 * | name                 | String    | to store the salesman's name |
 * | sales                | double    | to store the total sales     |
 * | rate                 | double    | to store the commission rate |
 * | comm                 | double    | to store the commission      |
 * +----------------------+-----------+------------------------------+
 */
