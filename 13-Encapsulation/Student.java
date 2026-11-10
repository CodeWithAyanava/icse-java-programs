/*
 * ====================================================================
 *   Program  : Q_250
 *   Chapter  : 13 - Encapsulation
 *   Title    : Private Data with Public Getter and Setter Methods
 *   Class    : Student  (file Student.java)
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Define a class Student to demonstrate encapsulation:
 *
 *       private String name;  private int marks;
 *       public void setName(String n)  : to assign the name; a blank name
 *                                        is stored as "Unknown"
 *       public void setMarks(int m)    : to assign the marks only if m is
 *                                        from 0 to 100; otherwise display
 *                                        "Invalid marks" and keep the old
 *                                        value
 *       public String getName()        : to return the name
 *       public int getMarks()          : to return the marks
 *
 *   In main(), create an object, set the name and marks using values
 *   entered by the user, then try to set invalid marks (150), and
 *   display the data using the getter methods.
 * ====================================================================
 */

import java.util.Scanner;

public class Student
{
    private String name;
    private int marks;

    public void setName(String n)
    {
        if (n.trim().length() == 0)
            name = "Unknown";
        else
            name = n.trim();
    }

    public void setMarks(int m)
    {
        if (m >= 0 && m <= 100)
            marks = m;
        else
            System.out.println("Invalid marks");
    }

    public String getName()
    {
        return name;
    }

    public int getMarks()
    {
        return marks;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        System.out.print("Enter name: ");
        s.setName(sc.nextLine());
        System.out.print("Enter marks: ");
        s.setMarks(sc.nextInt());
        System.out.println("Trying to set marks to 150...");
        s.setMarks(150);
        System.out.println("Name  : " + s.getName());
        System.out.println("Marks : " + s.getMarks());
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+---------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description                 |
 * +----------------------+-----------+---------------------------------------+
 * | name                 | String    | to store the student's name (private) |
 * | marks                | int       | to store the marks (private)          |
 * | n                    | String    | to receive the name                   |
 * | m                    | int       | to receive the marks                  |
 * | s                    | Student   | to refer to the student object        |
 * +----------------------+-----------+---------------------------------------+
 */
