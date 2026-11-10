/*
 * ====================================================================
 *   Program  : Q_77
 *   Chapter  : 06 - Conditional Constructs in Java
 *   Title    : BMI Calculator with Category
 * --------------------------------------------------------------------
 *   Question :
 *
 *   [Extra] Body Mass Index (BMI) = weight (kg) / [height (m)]^2.
 *   Write a program to accept the weight in kilograms and the height
 *   in centimetres, calculate the BMI (rounded to one decimal place)
 *   and display the category:
 *
 *       BMI below 18.5            Underweight
 *       18.5 to below 25          Normal weight
 *       25 to below 30            Overweight
 *       30 and above              Obese
 *
 *   Display "Invalid input" if the weight or height is zero or
 *   negative.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_77
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight (kg): ");
        double w = sc.nextDouble();
        System.out.print("Enter height (cm): ");
        double hcm = sc.nextDouble();

        if (w <= 0 || hcm <= 0)
        {
            System.out.println("Invalid input");
        }
        else
        {
            double h = hcm / 100;
            double bmi = Math.round(w / (h * h) * 10) / 10.0;
            System.out.println("BMI = " + bmi);
            if (bmi < 18.5)
                System.out.println("Underweight");
            else if (bmi < 25)
                System.out.println("Normal weight");
            else if (bmi < 30)
                System.out.println("Overweight");
            else
                System.out.println("Obese");
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description         |
 * +----------------------+-----------+-------------------------------+
 * | w                    | double    | to store the weight in kg     |
 * | hcm                  | double    | to store the height in cm     |
 * | h                    | double    | to store the height in metres |
 * | bmi                  | double    | to store the body mass index  |
 * +----------------------+-----------+-------------------------------+
 */
