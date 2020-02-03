package Chap01;

public class Ex01_01 {
	public static int sum(int n,int m) { //n+m의 값을 반환시키는 int형 함수
		return n+m;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i= 20;
		int s;
		char a;
		
		s = sum(i,10); // sum에 i 와 10을 넣고 반환된 값을 s에 담음
		
		a = '?';
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
		//출력되는 형태
	}

}
