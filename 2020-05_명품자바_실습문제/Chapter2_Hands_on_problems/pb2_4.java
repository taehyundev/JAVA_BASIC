import java.util.Scanner;

public class pb2_4 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int x,y,z;
		System.out.print("���� 3�� �Է�>>");
		x = s.nextInt();
		y = s.nextInt();
		z = s.nextInt();
		if((y<x&&x<z)||(z<x&&x<y))
			System.out.println("�߰� ���� "+x);
		else if((z<y&&y<x)||(x<y&&y<z))
			System.out.println("�߰� ���� "+y);
		else if((x<z&&z<y)||(y<z&&z<x))
			System.out.println("�߰� ���� "+z);
	}
}
