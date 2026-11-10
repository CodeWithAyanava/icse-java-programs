/*
 * ====================================================================
 *   Program  : Q_2
 *   Chapter  : 01 - Introduction to OOP and Java
 *   Title    : Marks Table using Tab and New-Line Escape Sequences
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to store the marks obtained by a student in
 *   English, Mathematics and Science (85, 92 and 88 respectively) in
 *   integer variables. Calculate the total marks and display a neat
 *   table of subjects and marks using the escape sequences \t
 *   (horizontal tab) and \n (new line). Use only one
 *   System.out.print() statement to print the rows of the table.
 * ====================================================================
 */

public class Q_2
{
    public static void main(String[] args)
    {
        int eng = 85, mat = 92, sci = 88;
        int total = eng + mat + sci;

        System.out.print("Subject\t\tMarks\n"
                       + "-------\t\t-----\n"
                       + "English\t\t" + eng + "\n"
                       + "Maths\t\t" + mat + "\n"
                       + "Science\t\t" + sci + "\n"
                       + "-------\t\t-----\n"
                       + "Total\t\t" + total + "\n");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-----------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description             |
 * +----------------------+-----------+-----------------------------------+
 * | eng                  | int       | to store the marks in english     |
 * | mat                  | int       | to store the marks in mathematics |
 * | sci                  | int       | to store the marks in science     |
 * | total                | int       | to store the total marks          |
 * +----------------------+-----------+-----------------------------------+
 */
