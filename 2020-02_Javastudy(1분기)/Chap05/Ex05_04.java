package Chap05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex05_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> h = new HashMap<String, String>();
		h.put("a", "���");
		h.put("b", "�ٳ���");
		h.put("c", "����");
		h.put("d", "��");
		h.put("e", "Ű��");
		String kor = h.get("apple");//get(key)->values
		Set<String> keys = h.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String key = it.next();
			String value = h.get(key);
			System.out.println("("+key+","+value+")");
			
		}
	}

}
