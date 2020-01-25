package test;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,n1,sum;
		n=7; n1=4;
		System.out.println("n = "+n+",n1 = " + n1);
		sum=n+n1;
		System.out.println("n+n1 : " +sum); // 덧셈
		sum=n-n1;
		System.out.println("n-n1 : " +sum); // 뺄쌤
		sum=n*n1;
		System.out.println("n*n1 : " +sum); // 곱셈
		sum=n/n1;
		System.out.println("n/n1 : " +sum); // 나눗셈 (몫)
		sum=n%n1;
		System.out.println("n%n1 : " +sum); // 나눗셈 (나머지)
		sum=n&n1;
		System.out.println("n&n1 : " +sum); // &(AND)연산자
		sum=n|n1;
		System.out.println("n|n1 : " +sum); // |(OR)연산자
		sum = (n>n1)?9:0;
		System.out.println("(n>n1)?9:0 : " +sum); // 조건 연산자
		sum = (n<n1)?9:0;
		System.out.println("(n<n1)?9:0 : " +sum); // 조건연산자
		
		// 조건연산자같은 경우에는 (조건식)?참일때 실행:거짓일때 실행 형태로 되어있다.
	}

}
