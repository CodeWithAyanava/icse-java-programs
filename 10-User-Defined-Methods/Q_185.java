/*
 * ====================================================================
 *   Program  : Q_185
 *   Chapter  : 10 - User-Defined Methods
 *   Title    : Overloading polygon(): Square, Rectangle and Triangle Patterns
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Design a class (written here as class Q_185) to overload a
 *   method polygon() as follows:
 *
 *       (i)   void polygon(int n, char ch)
 *             to print a filled square of side n using the character ch
 *       (ii)  void polygon(int x, int y)
 *             to print a filled rectangle of x rows and y columns using
 *             the symbol @
 *       (iii) void polygon()
 *             to print the filled triangle shown below:
 *                 *
 *                 * *
 *                 * * *
 *
 *   Example: polygon(2, 'o') gives       polygon(2, 5) gives
 *            o o                         @ @ @ @ @
 *            o o                         @ @ @ @ @
 * ====================================================================
 */

public class Q_185
{
    void polygon(int n, char ch)
    {
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
                System.out.print(ch + " ");
            System.out.println();
        }
    }

    void polygon(int x, int y)
    {
        for (int i = 1; i <= x; i++)
        {
            for (int j = 1; j <= y; j++)
                System.out.print("@ ");
            System.out.println();
        }
    }

    void polygon()
    {
        for (int i = 1; i <= 3; i++)
        {
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Q_185 ob = new Q_185();
        ob.polygon(2, 'o');
        System.out.println();
        ob.polygon(2, 5);
        System.out.println();
        ob.polygon();
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-----------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description             |
 * +----------------------+-----------+-----------------------------------+
 * | n                    | int       | to receive the side of the square |
 * | ch                   | char      | to receive the character to print |
 * | x                    | int       | to receive the number of rows     |
 * | y                    | int       | to receive the number of columns  |
 * | i                    | int       | to control the rows               |
 * | j                    | int       | to control the columns            |
 * | ob                   | Q_185     | to refer to the object            |
 * +----------------------+-----------+-----------------------------------+
 */
