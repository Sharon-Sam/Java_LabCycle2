//program that shows class and subclass

class Parent{
	void method1(){
		System.out.println("This is parent class");
	}
}

class Child extends Parent{
	void method2(){
		System.out.println("This is child class");
	}
}
class Labqn5{
	public static void main(String args[]){
		Parent obj1 = new Parent();
		Child obj2 = new Child();
		obj1.method1();		//method of parent class by object of parent class
		obj2.method2();		//method of child class by object of child class
		obj2.method1();		//method of parent class by object of child class
	}	
}


/*OUTPUT
This is parent class
This is child class
This is parent class */	