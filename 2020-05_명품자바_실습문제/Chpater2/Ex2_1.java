package Chpater2;

import java.util.Scanner;

public class Ex2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("원화를 입력하세요(단위 원)>>");
		Scanner s = new Scanner(System.in);
		int money = s.nextInt();
		double dollar = money/1100;
		System.out.println(money+"원은 $"+dollar+"입니다.");
	}

}
