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
		  ���� �ε����� ��쿡�� ���� �̸��� �Լ��� ������ �����ϰ�, ���ڰ��� 
		  ���� ����, �ٸ� �޼ҵ��� ���·� ����� �� �ִ�.
		 */
	}

}
