package OverLoading;

import java.util.Scanner;

public class testMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overloading_ex oe = new overloading_ex();
		Scanner s = new Scanner(System.in);
		int n, n1,n2;
		n = s.nextInt();
		n1 = s.nextInt();
		System.out.println(oe.Add(n, n1));
		
		n2 = s.nextInt();
		System.out.println(oe.Add(n, n1, n2));
		
		String x,y;
		x = s.next();
		y = s.next();
		System.out.println(oe.Add(x, y));
		
		/*
		  오버 로딩같은 경우에는 같은 이름의 함수를 여러개 정의하고, 인자값의 
		  수에 따라, 다른 메소드의 형태로 사용할 수 있다.
		 */
	}

}
