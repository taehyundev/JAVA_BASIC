package Chap06;

import java.io.*;

public class Ex06_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fin = null;
		try {
			fin = new FileReader("src/Chap06/Test.txt");
			//Path FileReader
			
			int c;
			 while((c = fin.read()) != -1) {
				 System.out.print((char)c); 
			 }
			 fin.close();
		}
		catch (IOException ee) {
			System.out.println("입출력 오류");
		}
	}

}
