import java.util.Scanner;

public class pb2_6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		int n = s.nextInt();
		System.out.print("박수");
		if((n/10)%3 ==0)
			System.out.print("짝");
		if((n%10)%3 ==0)
			System.out.print("짝");
			
	}
}
