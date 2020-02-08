package Chap05;

import java.util.HashMap;

public class Ex05_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> h = new HashMap<String, String>();
		//<key, values>
		h.put("apple", "사과");
		String kor = h.get("apple");//get(key)->values
		System.out.println(kor);
		
	}

}
