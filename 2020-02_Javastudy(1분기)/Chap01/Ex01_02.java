package Chap01;

public class Ex01_02 {
	public static void main(String[] args) {
		//Data type�̶� �ڹٿ��� �ٷ� �� �ִ� �������� �����̴�.
		/*
		 boolean, char, byte, short, int, long, float, double
		 ���� �⺻ Ÿ�� 8����
		 ���۷��� Ÿ�� �Ѱ����� ������,
		  -�迭�� ���� ���۷���
		  -Ŭ������ ���� ���۷���
		  -�������̽��� ���� ���۷���
		  �� 3���� ����� �Ѵ�.
		 */
		
		//literal�� ���� ǥ�����̶�� �����ϸ� �����ϴ�.
		
		final double PI = 3.14;
		
		double radius = 10.0;
		double circleArea = radius*radius*PI;
		
		System.out.println("���� ���� = "+ circleArea);
		
	}
}
