package Chap03;

public class Ex03_03 {
	int radius;
	public Ex03_03(int radius) {
		// TODO Auto-generated constructor stub
		this.radius = radius;
	}
	public double getArea() {
		return 3.14 * radius * radius;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex03_03 [] c ;
		 c = new Ex03_03[5];
		 for(int i=0; i<c.length; i++) {
			 c[i] = new Ex03_03(i);
		 }
		 for(int i=0; i<c.length; i++) {
			 System.out.print((int)(c[i].getArea())+" ");
		 }
		 
	}

}
