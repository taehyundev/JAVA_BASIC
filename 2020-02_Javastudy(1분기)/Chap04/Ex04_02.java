package Chap04;
class Person{ // Superclass
	private int weight;
	int age;
	protected int height;
	public String name;
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getWeight() {
		return weight;
	}
}
class Student extends Person{ //Subclass
	public void set() {
		age = 30;
		name ="ȫ�浿";
		height = 175; // can use Protect
		//weight =99; // ERROR weight is private private is only my class 
		setWeight(99);
	}
}
public class Ex04_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.set();
		System.out.println(s.getWeight());
	}
}
