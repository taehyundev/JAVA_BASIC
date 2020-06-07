import java.util.Scanner;
public class pb2_1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위 원)>>");
		int money = s.nextInt();
		System.out.println(money+"원 은 $"+(double)money/1100+"입니다.");
	}
}
