import java.util.Scanner;
public class pb2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�κ��� ��< �ٸ� �Ѻ� �簢�� x
		Scanner s = new Scanner(System.in);
		int n, m,l;
		System.out.print("���� 3���� �Է��Ͻÿ�>>");
		n = s.nextInt();
		m = s.nextInt();
		l = s.nextInt();
		if((n+m<l)||(n+l<m)||(l+m<n))
			System.out.println("�ﰢ���� X");
		else
			System.out.println("�ﰢ�� ��");
	}

}
