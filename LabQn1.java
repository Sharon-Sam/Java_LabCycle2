//program with class having overload methods to calculate area of rectangle & circle

public class LabQn1{
	public static void main(String args[]){
		int l,b,r;

		//creating object for the methods
		AreaRc obj=new AreaRc();
		obj.Area(2,3);
		obj.Area(4);
	}
}
class AreaRc{
	void Area(int l, int b){
		System.out.println("Area of the rectangle=" +(l*b));
	}
	
	void Area(float r){
		System.out.println("Area of the circle=" +(3.14*r*r));
	}
}

//OUTPUT
//Area of the rectangle=6
//Area of the circle=50.24		