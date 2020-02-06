package Chap03;


public class Ex03_04 {
	public int getsum(int i, int j) {
		return i *j;
	}
	public double getsum(double i,double j) {
		return i+j;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Ex03_04 a =new Ex03_04();
		System.out.println(a.getsum(4.5,4.4));
		System.out.println(a.getsum(4,4));
		//Method Overriding
	}

}
