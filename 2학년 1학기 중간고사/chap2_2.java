package java_project;

import java.util.Scanner;

public class chap2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in); // �Է� ��ü�� ���� ���ش�.
		System.out.print("2�ڸ��� ���� �Է�(10~99)>>"); 
		int n = s.nextInt(); // n�� int�� �����͸� �޴´�.
		if((n/10) == (n%10)) { // ���� �ڸ��� ���� �ڸ����� ������� ������ �����ڸ� ���ؼ� ������
								// == ��ȣ�� ������ Ȯ���Ѵ�.
			//���϶�
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		}else {
			//�����϶�
			System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� �����ʽ��ϴ�.");
		}
		s.close();//Scanner ��ü ����
	}
}
