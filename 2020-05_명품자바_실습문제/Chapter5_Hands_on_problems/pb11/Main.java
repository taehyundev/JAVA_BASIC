package pb11;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("�� ������ �����ڸ� �Է��Ͻÿ�>>");
		int n= s.nextInt();
		int m = s.nextInt();
		Calc calc= null;
		char oper= s.next().charAt(0);
		if(oper=='+') {
			calc = new Add(n,m);
		}else if(oper=='-') {
			calc = new Sub(n,m);
			
		}else if(oper=='*') {
			calc = new Mul(n,m);
			
		}else if(oper=='/') {
			calc = new Div(n,m);
		}
		System.out.println(calc.calculate());
	}
}
