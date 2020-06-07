package pb9;

import java.util.Scanner;

public class StackApp {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("�� ���� ���� ������ ũ�� �Է� >> ");
		int n = s.nextInt();
		StringStack stack = new StringStack(n);
		while(true) {
			System.out.print("���ڿ� �Է� >> ");
			String x = s.next();
			if(x.equals("�׸�")) break;
			if(!stack.push(x)) 
				System.out.println("������ �� ���� Ǫ�� �Ұ�!");
			
		}
		System.out.print("���ÿ� ����� ��� ���ڿ� �� : " );
		while(stack.length()!=0) {
			System.out.print(stack.pop()+" ");
		}
	}
}
