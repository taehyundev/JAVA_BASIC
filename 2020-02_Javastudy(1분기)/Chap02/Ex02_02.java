package Chap02;

import java.util.Scanner;
public class Ex02_02 {
	public static void main(String[] args) {
		double avg =0;
		int cnt =0;
		Scanner s = new Scanner(System.in);
		System.out.println("정수를 입력해 주세요(끝낼려면 -1) ");
		int num;
		while(true) {
			num = s.nextInt();
			if(num ==-1) {
				break;
			}
			avg += num;
			cnt++;
		}
		System.out.println((cnt)+"개이며, 평균은 "+(avg/cnt));
		
	}
}
