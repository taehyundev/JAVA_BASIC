package Chap02;

public class Ex02_04 {
	enum Week { ��,ȭ,��,��,��,��,��}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] n = {1,2,3,4,5};
		String names[] = {"���","��","�ٳ���","ü��","����","����"};
		
		int sum =0;
		
		for(int k:n) {
			System.out.print(k+ " ");
			sum += k;
		}
		System.out.println("���� "+sum);
		System.out.println();
		for(String s: names)
			System.out.print(s +" ");
		System.out.println();
		for(Week day : Week.values())
			System.out.print(day + "���� ");
		System.out.println();
	
	}

}
