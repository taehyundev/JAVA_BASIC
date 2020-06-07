import java.util.Scanner;

public class pb2_4 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int x,y,z;
		System.out.print("정수 3개 입력>>");
		x = s.nextInt();
		y = s.nextInt();
		z = s.nextInt();
		if((y<x&&x<z)||(z<x&&x<y))
			System.out.println("중간 값은 "+x);
		else if((z<y&&y<x)||(x<y&&y<z))
			System.out.println("중간 값은 "+y);
		else if((x<z&&z<y)||(y<z&&z<x))
			System.out.println("중간 값은 "+z);
	}
}
