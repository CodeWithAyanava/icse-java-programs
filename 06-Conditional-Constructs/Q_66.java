/*
 * ====================================================================
 *   Program  : Q_66
 *   Chapter  : 06 - Conditional Constructs in Java
 *   Title    : Positive, Negative or Zero
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a number and check whether it is
 *   positive, negative or zero.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_66
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double n = sc.nextDouble();

        if (n > 0)
            System.out.println("Positive");
        else if (n < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-----------------------+
 * | Name of the Variable | Data Type | Purpose / Description |
 * +----------------------+-----------+-----------------------+
 * | n                    | double    | to store the number   |
 * +----------------------+-----------+-----------------------+
 */
