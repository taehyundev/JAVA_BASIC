package test;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,n1,sum;
		n=7; n1=4;
		System.out.println("n = "+n+",n1 = " + n1);
		sum=n+n1;
		System.out.println("n+n1 : " +sum); // ����
		sum=n-n1;
		System.out.println("n-n1 : " +sum); // ����
		sum=n*n1;
		System.out.println("n*n1 : " +sum); // ����
		sum=n/n1;
		System.out.println("n/n1 : " +sum); // ������ (��)
		sum=n%n1;
		System.out.println("n%n1 : " +sum); // ������ (������)
		sum=n&n1;
		System.out.println("n&n1 : " +sum); // &(AND)������
		sum=n|n1;
		System.out.println("n|n1 : " +sum); // |(OR)������
		sum = (n>n1)?9:0;
		System.out.println("(n>n1)?9:0 : " +sum); // ���� ������
		sum = (n<n1)?9:0;
		System.out.println("(n<n1)?9:0 : " +sum); // ���ǿ�����
		
		// ���ǿ����ڰ��� ��쿡�� (���ǽ�)?���϶� ����:�����϶� ���� ���·� �Ǿ��ִ�.
	}

}
