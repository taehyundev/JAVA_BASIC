package Chap04;
class AAA{
	public AAA() { // no Active;
		System.out.println("생성자 A");
	}
	public AAA(int x) { // Active
		System.out.println("매개변수생성자 A");
	}
}
class BBB extends AAA{ 
	public BBB() {
		System.out.println("생성자 B");
	}
	public BBB(int x) {
		super(x);//Must come on first line
		System.out.println("매개변수생성자 B");
	}
}
public class Ex04_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BBB b;
		b = new BBB(5);
	}

}
