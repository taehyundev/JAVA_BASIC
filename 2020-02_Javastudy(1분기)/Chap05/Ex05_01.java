package Chap05;

import java.util.Vector;

public class Ex05_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v =new Vector<Integer>();
		v.add(Integer.valueOf(5));
		v.add(Integer.valueOf(4));
		v.add(Integer.valueOf(-1));
		
		//auto Boxing (Same)
		//v.add(5);
		//v.add(4);
		//v.add(-1);
		Integer obj = v.get(0); //get Vector Value
		System.out.println(obj); //values = 5
		int len  = v.size();
		System.out.println(len); // vector size
		int cap = v.capacity();
		System.out.println(cap); // vector capacity
		v.remove(0); // remove "5"
		obj = v.get(0); //get Vector Value
		System.out.println(obj); //values = 4
		v.add(0,20); // (index, values) 
		obj = v.get(0); 
		System.out.println(obj);
		v.removeAllElements(); //remove all elements
		
	}

}
