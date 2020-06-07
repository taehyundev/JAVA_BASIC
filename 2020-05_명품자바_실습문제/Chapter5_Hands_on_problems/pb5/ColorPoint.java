package pb5;

public class ColorPoint extends Point {
	private String color;
	public ColorPoint(int x, int y,String z) {
		super(x, y);
		color = z;
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
