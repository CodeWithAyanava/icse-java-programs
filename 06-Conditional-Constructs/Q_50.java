/*
 * ====================================================================
 *   Program  : Q_50
 *   Chapter  : 06 - Conditional Constructs in Java
 *   Title    : Simple Calculator using switch
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept two numbers and an arithmetic operator
 *   (+, -, *, / or %) and perform the corresponding operation using
 *   a switch statement. If the second number is zero for / or %,
 *   display "Division by zero not allowed". For any other operator,
 *   display "Invalid operator".
 * ====================================================================
 */

import java.util.Scanner;

public class Q_50
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter the operator (+, -, *, /, %): ");
        char op = sc.next().charAt(0);
        System.out.print("Enter the second number: ");
        double b = sc.nextDouble();

        switch (op)
        {
            case '+':
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
            case '-':
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            case '*':
                System.out.println(a + " * " + b + " = " + (a * b));
                break;
            case '/':
                if (b == 0)
                    System.out.println("Division by zero not allowed");
                else
                    System.out.println(a + " / " + b + " = " + (a / b));
                break;
            case '%':
                if (b == 0)
                    System.out.println("Division by zero not allowed");
                else
                    System.out.println(a + " % " + b + " = " + (a % b));
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+----------------------------+
 * | Name of the Variable | Data Type | Purpose / Description      |
 * +----------------------+-----------+----------------------------+
 * | a                    | double    | to store the first number  |
 * | op                   | char      | to store the operator      |
 * | b                    | double    | to store the second number |
 * +----------------------+-----------+----------------------------+
 */
