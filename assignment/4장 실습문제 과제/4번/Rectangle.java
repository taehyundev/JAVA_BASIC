package Chapter4.solved_4;

public class Rectangle {
	private int x;
	private int y;
	private int width;
	private int height;
	
	public Rectangle(int x,int y,int width, int height) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	int square(){
		return width * height;
	}
	
	void show() {
		System.out.println("("+x+","+y+")에서 크기가 "+width+"x"+height+"인 사각형");
	}
	boolean contains(Rectangle r) {
		if((this.x<r.x) && (this.y<r.y) && (this.x+this.width)>(r.x+r.width) && (this.y+this.height)>(r.y+r.height))
			return true;
		else
			return false;
	}
}

