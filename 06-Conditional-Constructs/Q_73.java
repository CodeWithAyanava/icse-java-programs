/*
 * ====================================================================
 *   Program  : Q_73
 *   Chapter  : 06 - Conditional Constructs in Java
 *   Title    : Menu with an Exit Option using System.exit(0)
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a menu-driven program with the following options:
 *
 *       1. Square of a number
 *       2. Cube of a number
 *       3. Exit
 *
 *   For choices 1 and 2, accept a number and display the result. For
 *   choice 3, display "Program terminated" and stop the program
 *   immediately using System.exit(0). For any other choice, display
 *   "Wrong choice". After the switch statement, display "Thank you"
 *   (this line must not appear when the user chooses Exit).
 * ====================================================================
 */

import java.util.Scanner;

public class Q_73
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Square of a number");
        System.out.println("2. Cube of a number");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();
        long n;

        switch (ch)
        {
            case 1:
                System.out.print("Enter a number: ");
                n = sc.nextLong();
                System.out.println("Square = " + (n * n));
                break;
            case 2:
                System.out.print("Enter a number: ");
                n = sc.nextLong();
                System.out.println("Cube = " + (n * n * n));
                break;
            case 3:
                System.out.println("Program terminated");
                System.exit(0);
                break;
            default:
                System.out.println("Wrong choice");
        }
        System.out.println("Thank you");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+----------------------------+
 * | Name of the Variable | Data Type | Purpose / Description      |
 * +----------------------+-----------+----------------------------+
 * | ch                   | int       | to store the user's choice |
 * | n                    | long      | to store the number        |
 * +----------------------+-----------+----------------------------+
 */
