import java.util.Scanner;
public class pb2_2 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.print("2�ڸ��� ���� �Է�(10~99)>>");
		int n = s.nextInt();
		if(n/10 == n%10)
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		else
			System.out.println("No! �ٸ��ϴ�.!");
	}
}
