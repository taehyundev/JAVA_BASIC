package Chap03;
import java.util.Scanner;
class Rectangle{
	int width;
	int height;
	public int getArea() {
		return width*height;
	}
}
public class Ex03_01 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle();
		Scanner s = new Scanner(System.in);
		System.out.print(">> ");
		r.width = s.nextInt();
		r.height = s.nextInt();
		int result = r.getArea();
		System.out.println("Result : " + result);
		
	}

}
