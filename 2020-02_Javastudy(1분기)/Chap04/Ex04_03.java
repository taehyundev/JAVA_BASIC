package Chap04;
class A{ //Super class
	public A() {
		System.out.println("持失切 A");
	}
}
class B extends A{//Sub class
	public B() {
		System.out.println("持失切 B");
	}
}
public class Ex04_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		// if Inherited 
		// First => Super Class Constructor Active
		// Second => Sub Class Constructor Active
		
	}

}
