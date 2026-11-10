/*
 * ====================================================================
 *   Program  : Q_177
 *   Chapter  : 09 - Class as the Basis of all Computation
 *   Title    : Class Student: Average and Grade
 *   Class    : Student   (compile: javac Q_177.java   run: java Student)
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Define a class Student with the following description:
 *
 *       Data members : String name; int m1, m2, m3; double avg; char grade
 *       void accept()  : to accept the name and marks in three subjects
 *       void compute() : to calculate the average and assign the grade:
 *                          average >= 80  : 'A'
 *                          60 to below 80 : 'B'
 *                          40 to below 60 : 'C'
 *                          below 40       : 'D'
 *       void display() : to display the name, marks, average and grade
 *
 *   Write a main method to create an object and call the methods.
 * ====================================================================
 */

import java.util.Scanner;

class Student
{
    String name;
    int m1, m2, m3;
    double avg;
    char grade;

    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter marks in three subjects: ");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
    }

    void compute()
    {
        avg = (m1 + m2 + m3) / 3.0;
        if (avg >= 80)
            grade = 'A';
        else if (avg >= 60)
            grade = 'B';
        else if (avg >= 40)
            grade = 'C';
        else
            grade = 'D';
    }

    void display()
    {
        System.out.println("Name    : " + name);
        System.out.println("Marks   : " + m1 + ", " + m2 + ", " + m3);
        System.out.println("Average : " + Math.round(avg * 100) / 100.0);
        System.out.println("Grade   : " + grade);
    }

    public static void main(String[] args)
    {
        Student s = new Student();
        s.accept();
        s.compute();
        s.display();
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+--------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description          |
 * +----------------------+-----------+--------------------------------+
 * | name                 | String    | to store the student's name    |
 * | m1                   | int       | to store marks in subject 1    |
 * | m2                   | int       | to store marks in subject 2    |
 * | m3                   | int       | to store marks in subject 3    |
 * | avg                  | double    | to store the average marks     |
 * | grade                | char      | to store the grade             |
 * | s                    | Student   | to refer to the student object |
 * +----------------------+-----------+--------------------------------+
 */
