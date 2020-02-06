package Chap03;

public class Ex03_02 {
	int n, n1;
	
	public Ex03_02(int n) {
		// TODO Auto-generated constructor stub
		this.n = n;
		this.n1 =n;
	}
	public Ex03_02(int n, int n1) {
		// TODO Auto-generated constructor stub
		this.n = n;
		this.n1 = n1;
	}
	public int GetSum() {
		return this.n + this.n1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int n1 = 5;
		Ex03_02 e = new Ex03_02(n);
		System.out.println(e.GetSum());
		Ex03_02 e1 = new Ex03_02(n,n1);
		System.out.println(e1.GetSum());
		//Overloading

	}

}
