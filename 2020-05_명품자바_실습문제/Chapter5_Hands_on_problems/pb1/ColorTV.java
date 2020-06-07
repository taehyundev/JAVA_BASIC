package pb1;

public class ColorTV extends TV{
	private int color;
	public ColorTV(int size, int color) {
		// TODO Auto-generated constructor stub
		super(size);
		this.color = color;
	}
	public void printProperty() {
		System.out.println(getSize()+"인치 "+color+"컬러");
	}
}
