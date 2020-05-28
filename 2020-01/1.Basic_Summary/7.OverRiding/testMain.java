package OverRiding;

public class testMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overriding_ex_parent op = new overriding_ex_parent();
		op.display();
		overriding_ex_child oc = new overriding_ex_child();
		oc.display();
		
		//다운캐스팅
		overriding_ex_parent ox = new overriding_ex_child();
		ox.display();
		ox.display2();
		/*
		 오버라이딩은 부모클래스를 자식클래스가 상속을 받았을 때, 부모클래스의 메소드를 자식클래스에 재정의를 시켜서 선언하면
		 부모클래스 객체명 = new 자식클래스();를 했을 때 자식클래스의 재정의 된 같은 이름의 메소드 값을 출력하게 된다.
		 재정의가 되어있지 않을 때에는 부모클래스의 메소드를 출력하게 된다. 메소드의 우선순위가 자식클래스의 재정의된 메소드 > 부모클래스의 메소드의
		 형태로 되게 된다.
		 */
	}

}
