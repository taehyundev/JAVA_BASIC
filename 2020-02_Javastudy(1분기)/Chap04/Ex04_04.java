package Chap04;
class AA{
	public AA() { //Running unconditionally
		//Must
		System.out.println("������ A");
	}
	public AA(int x) {
		System.out.println("�Ű����������� A");
	}
}
class BB extends AA{ // Must AA() , No active AA(int x)
	//If Inherited 
	//Super class haven't Constructor AA() ERROR
	public BB() {
		System.out.println("������ B");
	}
	public BB(int x) {
		System.out.println("�Ű����������� B");
	}
}
public class Ex04_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BB b;
		b = new BB(5);
	}

}
