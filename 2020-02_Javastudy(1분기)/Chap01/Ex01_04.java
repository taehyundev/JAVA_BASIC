package Chap01;
import java.util.Scanner;
public class Ex01_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�̸� ���� ���� ü�� ���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���");
		Scanner scanner = new Scanner(System.in);

		String name = scanner.next();
		System.out.println("�̸��� : "+name);

		String city = scanner.next();
		System.out.println("���� : "+city);

		int age = scanner.nextInt();
		System.out.println("���� : "+age);

		double weight = scanner.nextDouble();
		System.out.println("ü�� : "+weight);

		Boolean IsSingle = scanner.nextBoolean();
		System.out.println("���� : "+IsSingle);
	
	}

}
