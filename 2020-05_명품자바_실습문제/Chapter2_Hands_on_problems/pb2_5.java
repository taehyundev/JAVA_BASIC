import java.util.Scanner;
public class pb2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//두변의 합< 다른 한변 사각형 x
		Scanner s = new Scanner(System.in);
		int n, m,l;
		System.out.print("정수 3개를 입력하시오>>");
		n = s.nextInt();
		m = s.nextInt();
		l = s.nextInt();
		if((n+m<l)||(n+l<m)||(l+m<n))
			System.out.println("삼각형이 X");
		else
			System.out.println("삼각형 됨");
	}

}
