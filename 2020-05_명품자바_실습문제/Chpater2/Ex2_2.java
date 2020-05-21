package Chpater2;

import java.util.Scanner;

public class Ex2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("2자리 정수 입력(10-99)>>");
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		if(n %10 == n /10) {
			System.out.println("YES!");
		}
	}

}
