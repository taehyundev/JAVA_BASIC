package pb14;

public class Rect implements Shape {
	private int x,y;
	public Rect(int x,int y) {
		// TODO Auto-generated constructor stub
		this.x = x; this.y = y;
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(x+"x"+y+"크기의 사각형 입니다.");
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return x*y;
	}

}
