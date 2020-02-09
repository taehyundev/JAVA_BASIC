package Chap06;

import java.io.*;
import java.util.*;

public class Ex06_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		FileWriter fout = null;
		int c;
		try {
			fout = new FileWriter("src/Chap06/Test2.txt");
			while(true) {
				String line = s.nextLine();
				if(line.length() == 0)
					break;
				fout.write(line, 0, line.length());
				fout.write("\r\n", 0, 2);
			}
			fout.close();
		}catch(IOException ee) {
			System.out.println("입출력 오류");
		}
		s.close();
	}

}
