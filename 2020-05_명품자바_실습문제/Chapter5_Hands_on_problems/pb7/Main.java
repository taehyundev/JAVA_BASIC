package pb7;
public class Main {
	public static void main(String[] args) {
		Point3D p = new Point3D(1,2,3);
		System.out.println(p.toString2()+"�Դϴ�.");
		
		p.moveUp();
		System.out.println(p.toString2()+"�Դϴ�.");
		p.moveDown();
		p.move(10,10);
		System.out.println(p.toString2()+"�Դϴ�.");
		p.move(100,200,300);
		System.out.println(p.toString2() + "�Դϴ�.");
	}
}
