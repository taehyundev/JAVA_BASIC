package java_project;

import java.util.Scanner;

public class chap3_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = {"����", "����", "��"}; // ����, ����, ���� �迭�� �־�д�.
		
		Scanner s = new Scanner(System.in); // �Է� ��ü�� ����
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		while(true) { // ���� ������ ������.
			System.out.print("���� ���� ��!>>");
			int n = (int)(Math.random() * 3); // 0,1,2 ������ ���� n���� �ݺ��� ���۵� ������ �־��ش�.
			String sw =s.next(); // sw���ٰ� ����, ����, �� �� �ϳ��� ���ڿ��� �Է¹޴´�.
			if(sw.equals("�׸�")) { // �׸��̶�� �Է� �Ǹ� �ݺ��� ������ ������ �ȴ�.
				System.out.println("������ �����մϴ�...");
				break;
			}
			//���࿡ ���� �Է��� ���� ���� �϶�, ���� �϶�, �� �� ���� ��츦 �ְ�
			//�׾ȿ��� ���������� �迭�� ������ ��� �����Ѵ�. (str[n])
			//�����ϰ� ���� ����� ���� ������ �ǹǷ� str�� n��° ���Ҹ� �����Ѵ�.
			//�� �� �������� ���� ��� ���� System.out.println���� ��� �����ش�.
			
			else if(sw.equals("����")) { 
				if(str[n].equals("����")) {
					 System.out.println("����� = "+sw+" , ��ǻ�� = "+str[n]+" �����ϴ�.");
				}else if(str[n].equals("����")) {
					 System.out.println("����� = "+sw+" , ��ǻ�� = "+str[n]+" ����ڰ� �����ϴ�.");
				}else if(str[n].equals("��")) {
					 System.out.println("����� = "+sw+" , ��ǻ�� = "+str[n]+" ����ڰ� �̰���ϴ�.");

				}
			}else if(sw.equals("����")) {
				if(str[n].equals("����")) {
					 System.out.println("����� = "+sw+" , ��ǻ�� = "+str[n]+" ����ڰ� �̽��ϴ�.");
				}else if(str[n].equals("����")) {
					 System.out.println("����� = "+sw+" , ��ǻ�� = "+str[n]+" �����ϴ�.");
				}else if(str[n].equals("��")) {
					 System.out.println("����� = "+sw+" , ��ǻ�� = "+str[n]+" ����ڰ� �����ϴ�.");

				}
			}else if(sw.equals("��")) {
				if(str[n].equals("����")) {
					 System.out.println("����� = "+sw+" , ��ǻ�� = "+str[n]+" ����ڰ� �����ϴ�.");
				}else if(str[n].equals("����")) {
					 System.out.println("����� = "+sw+" , ��ǻ�� = "+str[n]+" ����ڰ� �̰���ϴ�.");
				}else if(str[n].equals("��")) {
					 System.out.println("����� = "+sw+" , ��ǻ�� = "+str[n]+" �����ϴ�.");

				}
			}
			
		}
		s.close(); //������ ������ ���� �� �Է� ��ü�� �ݴ´�.
	}

}
