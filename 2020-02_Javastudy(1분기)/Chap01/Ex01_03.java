package Chap01;

public class Ex01_03 {
	public static void main(String[] args) {
		byte b = 127;
		int i = 100;
		System.out.println(b+i); //b가 int타입으로 변환
		System.out.println(10/4);
		System.out.println(10.0/4);
		System.out.println((char)0x12340041); // 문자로 변경
		System.out.println((byte)(b+i));
		System.out.println((int)2.9+1.8); //2.9를 int형으로 2로 만들고 계산
		System.out.println((int)(2.9+1.8)); //2.9+1.8 = 4.7을 int로
		System.out.println((int)2.9+(int)1.8);
		
	}
}
