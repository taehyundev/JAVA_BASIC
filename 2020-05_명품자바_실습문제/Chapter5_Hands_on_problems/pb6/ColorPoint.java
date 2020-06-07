package pb6;

public class ColorPoint extends Point {
	private String color;
	public ColorPoint(int x, int y) {
		super(x, y);
		color = "BLACK";
		// TODO Auto-generated constructor stub
	}
	public ColorPoint() {
		super(0,0);
		color = "BLACK";
		// TODO Auto-generated constructor stub
	}
	public void setXY(int x,int y) {
		move(x,y);
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		String n = color+"색의 "+"("+getX()+","+getY()+")의 점";
		return n;
	}
}
