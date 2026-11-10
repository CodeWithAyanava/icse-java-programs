/*
 * ====================================================================
 *   Program  : Q_63
 *   Chapter  : 06 - Conditional Constructs in Java
 *   Title    : Largest of Three Numbers using Nested if
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept three integers and find the largest
 *   among them using nested if statements. If all three numbers are
 *   equal, display "All numbers are equal".
 * ====================================================================
 */

import java.util.Scanner;

public class Q_63
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && b == c)
        {
            System.out.println("All numbers are equal");
        }
        else
        {
            int large;
            if (a >= b)
            {
                if (a >= c)
                    large = a;
                else
                    large = c;
            }
            else
            {
                if (b >= c)
                    large = b;
                else
                    large = c;
            }
            System.out.println("Largest number = " + large);
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-----------------------------+
 * | Name of the Variable | Data Type | Purpose / Description       |
 * +----------------------+-----------+-----------------------------+
 * | a                    | int       | to store the first number   |
 * | b                    | int       | to store the second number  |
 * | c                    | int       | to store the third number   |
 * | large                | int       | to store the largest number |
 * +----------------------+-----------+-----------------------------+
 */
