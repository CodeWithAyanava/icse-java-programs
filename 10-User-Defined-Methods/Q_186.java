/*
 * ====================================================================
 *   Program  : Q_186
 *   Chapter  : 10 - User-Defined Methods
 *   Title    : Overloading display() for Patterns
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Design a class (written here as class Q_186) to overload a
 *   method display() as follows:
 *
 *       (i)   void display()          : to display the pattern
 *                                       1
 *                                       2 2
 *                                       3 3 3
 *                                       4 4 4 4
 *       (ii)  void display(int n)     : to display n rows of the pattern
 *                                       1
 *                                       1 2
 *                                       1 2 3   ... up to n rows
 *       (iii) void display(char ch, int n) : to display n rows of the
 *                                       character ch in a triangle
 *                                       ch
 *                                       ch ch
 *                                       ch ch ch ...
 *
 *   Write a main method to call the methods with n = 5 and ch = '#'.
 * ====================================================================
 */

public class Q_186
{
    void display()
    {
        for (int i = 1; i <= 4; i++)
        {
            for (int j = 1; j <= i; j++)
                System.out.print(i + " ");
            System.out.println();
        }
    }

    void display(int n)
    {
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
                System.out.print(j + " ");
            System.out.println();
        }
    }

    void display(char ch, int n)
    {
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
                System.out.print(ch + " ");
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Q_186 ob = new Q_186();
        ob.display();
        ob.display(5);
        ob.display('#', 5);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-----------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description             |
 * +----------------------+-----------+-----------------------------------+
 * | n                    | int       | to receive the number of rows     |
 * | ch                   | char      | to receive the character to print |
 * | i                    | int       | to control the rows               |
 * | j                    | int       | to control the columns            |
 * | ob                   | Q_186     | to refer to the object            |
 * +----------------------+-----------+-----------------------------------+
 */
