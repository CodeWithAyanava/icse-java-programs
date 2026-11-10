/*
 * ====================================================================
 *   Program  : Q_47
 *   Chapter  : 06 - Conditional Constructs in Java
 *   Title    : Income Tax by Age, Gender and Slab
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Given below is a hypothetical table showing the rates of income
 *   tax for male citizens below or of the age of 65 years:
 *
 *       Taxable Income (TI) in Rs          Income Tax in Rs
 *       Does not exceed 1,60,000           Nil
 *       1,60,001 to 5,00,000               (TI - 1,60,000) x 10%
 *       5,00,001 to 8,00,000               [(TI - 5,00,000) x 20%] + 34,000
 *       Above 8,00,000                     [(TI - 8,00,000) x 30%] + 94,000
 *
 *   Write a program to input the age, the gender (M or F) and the
 *   taxable income of a person. If the age is more than 65 years or
 *   the gender is female, display "Wrong Category". Otherwise
 *   compute and display the income tax payable.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_47
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter gender (M/F): ");
        char g = sc.next().charAt(0);
        System.out.print("Enter taxable income: ");
        double ti = sc.nextDouble();
        double tax;

        if (age > 65 || g == 'F' || g == 'f')
        {
            System.out.println("Wrong Category");
        }
        else if (age < 0 || ti < 0 || !(g == 'M' || g == 'm'))
        {
            System.out.println("Invalid input");
        }
        else
        {
            if (ti <= 160000)
                tax = 0;
            else if (ti <= 500000)
                tax = (ti - 160000) * 10 / 100;
            else if (ti <= 800000)
                tax = (ti - 500000) * 20 / 100 + 34000;
            else
                tax = (ti - 800000) * 30 / 100 + 94000;
            System.out.println("Income tax = Rs " + tax);
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-----------------------------+
 * | Name of the Variable | Data Type | Purpose / Description       |
 * +----------------------+-----------+-----------------------------+
 * | age                  | int       | to store the age            |
 * | g                    | char      | to store the gender         |
 * | ti                   | double    | to store the taxable income |
 * | tax                  | double    | to store the income tax     |
 * +----------------------+-----------+-----------------------------+
 */
