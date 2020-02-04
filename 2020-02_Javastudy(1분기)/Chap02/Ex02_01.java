package Chap02;

public class Ex02_01 {
	public static void main(String[] arg) {
		int sum =0;
		for(int i=1; i<=10;i++) {
			sum += i;
			System.out.print(i);
			if(i <10) System.out.print('+');
			else System.out.print('=');
		}
		System.out.print(sum);
	}
}
