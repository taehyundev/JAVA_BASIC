package pb14;

public class Circle implements Shape {
	private int radius;
	public Circle(int r) {
		// TODO Auto-generated constructor stub
		this.radius = r;
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("�������� "+ radius+" �� ���Դϴ�.");
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return radius* radius * PI;
	}

}
