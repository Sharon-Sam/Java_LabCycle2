/* Qn3) program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating
 a class named 'Triangle' without any parameter in its constructor*/


public class Triangle {
    Triangle()
    {
        System.out.println("Perimeter of the given triangle=" +perimeter(3, 4, 5));
        System.out.println("Area of the given triangle=" +area(3, 4, 5));
    }

    int perimeter(int x,int y , int z)
    {
        return (x + y + z);
    }

    int area(int x, int y, int z)
    {
        return (int) (0.5 * 3 * 4);
    }
    public static void main(String args[]) {
        Triangle obj = new Triangle();
    }
}


/*OUTPUT
Perimeter of the given triangle=12
Area of the given triangle=6 */
