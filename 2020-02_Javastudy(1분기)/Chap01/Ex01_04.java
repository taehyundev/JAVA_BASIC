package Chap01;
import java.util.Scanner;
public class Ex01_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("이름 도시 나이 체중 독신 여부를 빈칸으로 분리하여 입력하세요");
		Scanner scanner = new Scanner(System.in);

		String name = scanner.next();
		System.out.println("이름은 : "+name);

		String city = scanner.next();
		System.out.println("도시 : "+city);

		int age = scanner.nextInt();
		System.out.println("나이 : "+age);

		double weight = scanner.nextDouble();
		System.out.println("체중 : "+weight);

		Boolean IsSingle = scanner.nextBoolean();
		System.out.println("독신 : "+IsSingle);
	
	}

}
