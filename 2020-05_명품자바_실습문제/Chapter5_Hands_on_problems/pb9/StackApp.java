package pb9;

import java.util.Scanner;

public class StackApp {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		int n = s.nextInt();
		StringStack stack = new StringStack(n);
		while(true) {
			System.out.print("문자열 입력 >> ");
			String x = s.next();
			if(x.equals("그만")) break;
			if(!stack.push(x)) 
				System.out.println("스택이 꽉 차서 푸시 불가!");
			
		}
		System.out.print("스택에 저장된 모든 문자열 팝 : " );
		while(stack.length()!=0) {
			System.out.print(stack.pop()+" ");
		}
	}
}
