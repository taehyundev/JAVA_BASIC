package java_project;

import java.util.Scanner;

public class chap3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);// �Է� ��ü�� ���� ���ش�.
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>>");
		char c = s.next().charAt(0); // ���� c �� ���ڿ��� ���� ��ĭ�� �Է� �޴´�.(���� 1��)
		for(int i = 0; i<=c-'a'; i++) { 
			// 0 ~ c-'a'������ �Ѵ�. c - 'a' ������ �ƽ�Ű �ڵ�� �̷������, �ҹ��� ���ĺ��� ���° ������ c-'a'�� ���� ����
			for(char j = 'a'; j <= c - i; j++) {
				// for���� ���� a���� �Է¹��� ����-i���� �ݺ��Ѵ�.
				//�ﰢ���� ���·� ��Ÿ���� ���ؼ��� c- i�� ���� �ټ��� �þ ���� ��°��� �پ���.
				System.out.print(j);
			}
			System.out.println(); //�ٹٲ��� ���ش�.
		}
		
		s.close(); // �Է� ��ü�� �ݴ´�.
	}
}
