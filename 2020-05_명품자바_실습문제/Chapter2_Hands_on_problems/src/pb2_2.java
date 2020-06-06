import java.util.Scanner;
public class pb2_2 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.print("2자리수 정수 입력(10~99)>>");
		int n = s.nextInt();
		if(n/10 == n%10)
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		else
			System.out.println("No! 다릅니다.!");
	}
}
