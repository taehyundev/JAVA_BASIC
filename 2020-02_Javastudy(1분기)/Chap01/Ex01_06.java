package Chap01;

public class Ex01_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3, b=3, c=3;
		a += 3;
		b *= 3;
		c %= 2;
		System.out.println("a,b,c =" + a +" "+b+" "+c);
		
		int d = 3;

		a= d++;
		System.out.println(a + d);
		a= ++d;
		System.out.println(a + d);
		a= d--;
		System.out.println(a + d);
		a= --d;
		System.out.println(a + d);
	}

}
