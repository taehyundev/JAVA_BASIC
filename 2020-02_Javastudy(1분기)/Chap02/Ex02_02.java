package Chap02;

import java.util.Scanner;
public class Ex02_02 {
	public static void main(String[] args) {
		double avg =0;
		int cnt =0;
		Scanner s = new Scanner(System.in);
		System.out.println("������ �Է��� �ּ���(�������� -1) ");
		int num;
		while(true) {
			num = s.nextInt();
			if(num ==-1) {
				break;
			}
			avg += num;
			cnt++;
		}
		System.out.println((cnt)+"���̸�, ����� "+(avg/cnt));
		
	}
}
