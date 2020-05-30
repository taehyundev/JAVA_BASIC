package java_project;

import java.util.Scanner;

public class chap2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in); // 입력 객체를 선언 해준다.
		System.out.print("2자리수 정수 입력(10~99)>>"); 
		int n = s.nextInt(); // n에 int형 데이터를 받는다.
		if((n/10) == (n%10)) { // 십의 자리와 일의 자리수를 나누기와 나머지 연산자를 통해서 연산후
								// == 기호로 같은지 확인한다.
			//참일때
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		}else {
			//거짓일때
			System.out.println("No! 10의 자리와 1의 자리가 같지않습니다.");
		}
		s.close();//Scanner 객체 종료
	}
}
