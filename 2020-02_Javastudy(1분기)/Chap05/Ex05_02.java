package Chap05;

import java.util.ArrayList;

public class Ex05_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		a.add("Hello");
		a.add("Hi");
		a.add("Java");
		//can Insert Null
		String str = a.get(1);
		System.out.println(str);
		a.clear(); // remove all Elements
		
	}

}
