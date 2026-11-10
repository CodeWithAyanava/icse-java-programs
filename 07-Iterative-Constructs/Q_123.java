/*
 * ====================================================================
 *   Program  : Q_123
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : Looping Menu: Sum of Digits, Reverse, Count of Digits
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a menu-driven program that repeatedly displays the
 *   following menu until the user chooses Exit:
 *
 *       1. Sum of digits of a number
 *       2. Reverse of a number
 *       3. Number of digits in a number
 *       4. Exit
 *
 *   For choices 1 to 3, accept a number and display the result.
 *   Display "Wrong choice" for any other choice. Use a do-while loop
 *   with a switch statement.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_123
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int ch;
        long n, res;

        do
        {
            System.out.println("1. Sum of digits");
            System.out.println("2. Reverse of a number");
            System.out.println("3. Number of digits");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch)
            {
                case 1:
                    System.out.print("Enter a number: ");
                    n = Math.abs(sc.nextLong());
                    res = 0;
                    while (n > 0)
                    {
                        res = res + n % 10;
                        n = n / 10;
                    }
                    System.out.println("Sum of digits = " + res);
                    break;
                case 2:
                    System.out.print("Enter a number: ");
                    n = Math.abs(sc.nextLong());
                    res = 0;
                    while (n > 0)
                    {
                        res = res * 10 + n % 10;
                        n = n / 10;
                    }
                    System.out.println("Reverse = " + res);
                    break;
                case 3:
                    System.out.print("Enter a number: ");
                    n = Math.abs(sc.nextLong());
                    res = 0;
                    do
                    {
                        res++;
                        n = n / 10;
                    } while (n > 0);
                    System.out.println("Number of digits = " + res);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Wrong choice");
            }
            System.out.println();
        } while (ch != 4);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-----------------------------+
 * | Name of the Variable | Data Type | Purpose / Description       |
 * +----------------------+-----------+-----------------------------+
 * | ch                   | int       | to store the user's choice  |
 * | n                    | long      | to store the number entered |
 * | res                  | long      | to store the result         |
 * +----------------------+-----------+-----------------------------+
 */
