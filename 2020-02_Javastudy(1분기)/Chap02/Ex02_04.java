package Chap02;

public class Ex02_04 {
	enum Week { 월,화,수,목,금,토,일}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] n = {1,2,3,4,5};
		String names[] = {"Apple","Pear","Banana","Cherry","Strawberry","Grape"};
		
		int sum =0;
		
		for(int k:n) {
			System.out.print(k+ " ");
			sum += k;
		}
		System.out.println("Sum ="+sum);
		System.out.println();
		for(String s: names)
			System.out.print(s +" ");
		System.out.println();
		for(Week day : Week.values())
			System.out.print(day + "Day ");
		System.out.println();
	
	}

}
