package Chap02;

public class Ex02_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray [] = new int[5];
		try {
			intArray[3]= 2; //No Exception
			intArray[6]= 5; // Exception
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Full Array~!");
		}
	}

}
//Exception Type is Many!