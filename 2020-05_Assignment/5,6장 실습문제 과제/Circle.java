package jjaa;
public class Circle {
	private int x, y, radius;
	
	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public String toString() {
		return "Circle("+x+","+y+")������"+radius;
	}
	
	public boolean equals(Object obj) {
		Circle p = (Circle)obj;
		if(p.x == x && p.y == y) //�߽��� ������ ���� ���̴�.
			return true;
		else 
			return false;
	}
}
