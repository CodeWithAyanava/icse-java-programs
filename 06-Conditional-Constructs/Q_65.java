/*
 * ====================================================================
 *   Program  : Q_65
 *   Chapter  : 06 - Conditional Constructs in Java
 *   Title    : Odd or Even Number
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept an integer and check whether it is
 *   even or odd. The program must work correctly for negative
 *   numbers and zero. Display "Even" or "Odd".
 * ====================================================================
 */

import java.util.Scanner;

public class Q_65
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        if (n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
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
