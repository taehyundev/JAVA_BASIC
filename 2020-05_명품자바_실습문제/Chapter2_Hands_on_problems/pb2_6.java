import java.util.Scanner;

public class pb2_6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("1~99 ������ ������ �Է��Ͻÿ�>>");
		int n = s.nextInt();
		System.out.print("�ڼ�");
		if((n/10)%3 ==0)
			System.out.print("¦");
		if((n%10)%3 ==0)
			System.out.print("¦");
			
	}
}
