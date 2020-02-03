package Chap01;

public class Ex01_02 {
	public static void main(String[] args) {
		//Data type이란 자바에서 다룰 수 있는 데이터의 종류이다.
		/*
		 boolean, char, byte, short, int, long, float, double
		 등의 기본 타입 8개와
		 레퍼런스 타입 한가지가 있으며,
		  -배열에 대한 레퍼런스
		  -클래스에 대한 레퍼런스
		  -인터페이스에 대한 레퍼런스
		  총 3개의 기능을 한다.
		 */
		
		//literal은 값의 표현법이라고 생각하면 간단하다.
		
		final double PI = 3.14;
		
		double radius = 10.0;
		double circleArea = radius*radius*PI;
		
		System.out.println("원의 면적 = "+ circleArea);
		
	}
}
