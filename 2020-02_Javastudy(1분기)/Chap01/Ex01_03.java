package Chap01;

public class Ex01_03 {
	public static void main(String[] args) {
		byte b = 127;
		int i = 100;
		System.out.println(b+i); //b�� intŸ������ ��ȯ
		System.out.println(10/4);
		System.out.println(10.0/4);
		System.out.println((char)0x12340041); // ���ڷ� ����
		System.out.println((byte)(b+i));
		System.out.println((int)2.9+1.8); //2.9�� int������ 2�� ����� ���
		System.out.println((int)(2.9+1.8)); //2.9+1.8 = 4.7�� int��
		System.out.println((int)2.9+(int)1.8);
		
	}
}
