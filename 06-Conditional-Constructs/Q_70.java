/*
 * ====================================================================
 *   Program  : Q_70
 *   Chapter  : 06 - Conditional Constructs in Java
 *   Title    : Divisibility by 5 and 11
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept an integer and check whether it is
 *   divisible by both 5 and 11, by 5 only, by 11 only, or by
 *   neither. Display one of the messages: "Divisible by 5 and 11",
 *   "Divisible by 5 only", "Divisible by 11 only" or "Not divisible
 *   by 5 or 11".
 * ====================================================================
 */

import java.util.Scanner;

public class Q_70
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        if (n % 5 == 0 && n % 11 == 0)
            System.out.println("Divisible by 5 and 11");
        else if (n % 5 == 0)
            System.out.println("Divisible by 5 only");
        else if (n % 11 == 0)
            System.out.println("Divisible by 11 only");
        else
            System.out.println("Not divisible by 5 or 11");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-----------------------+
 * | Name of the Variable | Data Type | Purpose / Description |
 * +----------------------+-----------+-----------------------+
 * | n                    | int       | to store the number   |
 * +----------------------+-----------+-----------------------+
 */
