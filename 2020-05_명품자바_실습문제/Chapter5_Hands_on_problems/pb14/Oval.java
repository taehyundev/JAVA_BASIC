package pb14;

public class Oval implements Shape {
	private int x,y;
	public Oval(int x,int y) {
		// TODO Auto-generated constructor stub
		this.x = x; this.y= y;
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(x+"x"+y+"�� �����ϴ� Ÿ���ϴ�.");
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return x*y * PI;
	}

}
