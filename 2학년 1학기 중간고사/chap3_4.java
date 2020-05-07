package java_project;

import java.util.Scanner;

public class chap3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);// 입력 객체를 선언 해준다.
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		char c = s.next().charAt(0); // 문자 c 에 문자열의 제일 앞칸을 입력 받는다.(문자 1개)
		for(int i = 0; i<=c-'a'; i++) { 
			// 0 ~ c-'a'까지로 한다. c - 'a' 연산은 아스키 코드로 이루워지며, 소문자 알파벳이 몇번째 인지를 c-'a'를 통해 연산
			for(char j = 'a'; j <= c - i; j++) {
				// for문을 문자 a부터 입력받은 문자-i까지 반복한다.
				//삼각형의 형태로 나타내기 위해서는 c- i를 통해 줄수가 늘어날 수록 출력값이 줄어든다.
				System.out.print(j);
			}
			System.out.println(); //줄바꿈을 해준다.
		}
		
		s.close(); // 입력 객체를 닫는다.
	}
}
