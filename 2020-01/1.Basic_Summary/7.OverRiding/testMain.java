package OverRiding;

public class testMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overriding_ex_parent op = new overriding_ex_parent();
		op.display();
		overriding_ex_child oc = new overriding_ex_child();
		oc.display();
		
		//�ٿ�ĳ����
		overriding_ex_parent ox = new overriding_ex_child();
		ox.display();
		ox.display2();
		/*
		 �������̵��� �θ�Ŭ������ �ڽ�Ŭ������ ����� �޾��� ��, �θ�Ŭ������ �޼ҵ带 �ڽ�Ŭ������ �����Ǹ� ���Ѽ� �����ϸ�
		 �θ�Ŭ���� ��ü�� = new �ڽ�Ŭ����();�� ���� �� �ڽ�Ŭ������ ������ �� ���� �̸��� �޼ҵ� ���� ����ϰ� �ȴ�.
		 �����ǰ� �Ǿ����� ���� ������ �θ�Ŭ������ �޼ҵ带 ����ϰ� �ȴ�. �޼ҵ��� �켱������ �ڽ�Ŭ������ �����ǵ� �޼ҵ� > �θ�Ŭ������ �޼ҵ���
		 ���·� �ǰ� �ȴ�.
		 */
	}

}
