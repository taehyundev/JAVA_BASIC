package Chap02;
import java.util.Scanner;
public class Ex02_03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Put 5 Integers : ");
		int sum =0;
		for(int i=0; i<5; i++) {
			int n=s.nextInt();
			if(n<=0)
				continue;
			else
				sum += n;
		}
		System.out.println("sum= "+ sum);
		s.close();
	}
}
