package Chap01;

public class Ex01_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println('a' > 'b');
		System.out.println(3 >=2);
		System.out.println(-1 < 0 );
		System.out.println(3.45 <=2);
		System.out.println(3==2 );
		System.out.println(3 != 2 );
		
		//���տ�����
		System.out.println((3>2)&&(3>4));
		System.out.println((3!=2)||(-1>0));
		System.out.println((3!=2)^(-1>0)); //xor
		/*
		 Xor �� �ذ� ����.
		 x^ y  z
		 0  0  0
		 0  1  1
		 1  0  1
		 1  1  0
		 */
	}

}
