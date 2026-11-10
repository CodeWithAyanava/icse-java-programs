/*
 * ====================================================================
 *   Program  : Q_346
 *   Chapter  : 15 - String Handling
 *   Title    : Number to Roman Numerals
 * --------------------------------------------------------------------
 *   Question :
 *
 *   [Extra] Write a program to accept a number from 1 to 3999 and
 *   convert it into Roman numerals, using the symbols and values
 *   below stored in two parallel arrays (from the largest value to
 *   the smallest, repeatedly subtracting the largest value that
 *   fits).
 *
 *       M=1000 CM=900 D=500 CD=400 C=100 XC=90 L=50 XL=40 X=10 IX=9
 *       V=5 IV=4 I=1
 *
 *   Example: 1994 -> MCMXCIV, 2027 -> MMXXVII. Display "Out of
 *   range" for other numbers.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_346
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int val[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String sym[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        System.out.print("Enter a number (1-3999): ");
        int n = sc.nextInt();

        if (n < 1 || n > 3999)
        {
            System.out.println("Out of range");
            return;
        }
        String roman = "";
        int num = n;
        for (int i = 0; i < val.length; i++)
        {
            while (num >= val[i])
            {
                roman = roman + sym[i];
                num = num - val[i];
            }
        }
        System.out.println(n + " = " + roman);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description              |
 * +----------------------+-----------+------------------------------------+
 * | val                  | int[]     | to store the values of the symbols |
 * | sym                  | String[]  | to store the roman symbols         |
 * | n                    | int       | to store the number                |
 * | roman                | String    | to store the roman numeral         |
 * | num                  | int       | to store the value left to convert |
 * | i                    | int       | to act as the index                |
 * +----------------------+-----------+------------------------------------+
 */
