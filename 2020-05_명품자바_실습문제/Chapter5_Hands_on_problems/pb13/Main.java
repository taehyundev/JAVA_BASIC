package pb13;

public class Main {
	public static void main(String[] args) {
		Shape donut = new Circle(10);
		donut.redraw();
		System.out.println("¸éÀûÀº" + donut.getArea());
	}
}
