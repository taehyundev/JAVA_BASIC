package pb7;

public class Point3D extends Point{
	private int z;
	public Point3D(int i, int j, int k) {
		// TODO Auto-generated constructor stub
		super(i,j);
		this.z = k;
	}
	// 하나만 쓰면 됨
	public void move(int i, int j, int k) {
		// TODO Auto-generated method stub
		move(i,j);
		z =k;
	}

	public void moveDown() {
		// TODO Auto-generated method stub
		z--;
	}

	public void moveUp() {
		// TODO Auto-generated method stub
		z++;
		
	}
	public String toString2() {
		String rtn= "("+getX()+","+getY()+","+z+")";
		return rtn;
	}

}
