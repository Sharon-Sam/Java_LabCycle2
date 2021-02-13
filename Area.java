// Qn4) program to print the area of a rectangle 


import java.util.Scanner;
public class Area {
    static Scanner scan = new Scanner(System.in);
    Area(int l, int b)
    {
        returnArea(l, b);
    }

    void returnArea(int x, int y)
    {
        System.out.println("Area of the reactangle = " +(x * y));
    }

    public static void main(String[] args) {
        int l, b;	
	System.out.println("Enter the length of the rectangle : ");
        l = scan.nextInt();
	System.out.println("Enter the breadth of the rectangle : ");
        b = scan.nextInt();
        Area obj = new Area(l, b);
    }
}

/*OUTPUT
Enter the length of the rectangle :
5
Enter the breadth of the rectangle :
10
Area of the reactangle = 50 */