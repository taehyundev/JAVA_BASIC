package pb2;

public class IPTV extends ColorTV{
	private String ip;
	public IPTV(String ip, int size, int color) {
		// TODO Auto-generated constructor stub
		super(size,color);
		this.ip = ip;
	}
	public void printProperty() {
		System.out.println("���� IPTV�� "+ip+" �ּ��� "+getSize()+"��ġ "+getColor()+"�÷�");
	}
}
