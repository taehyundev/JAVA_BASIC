import java.util.Scanner;
public class pb2_3 {
	public static void main(String[] args) {
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		Scanner s = new Scanner(System.in);
		int money = s.nextInt();
		int temp =0;
		temp = money/50000;
		money = money-(50000*temp);
		System.out.println("�������� : "+temp);

		temp = money/10000;
		money = money-(10000*temp);
		System.out.println("������ : "+temp);

		temp = money/1000;
		money = money-(1000*temp);
		System.out.println("õ���� : "+temp);

		temp = money/100;
		money = money-(100*temp);
		System.out.println("����� : "+temp);

		temp = money/50;
		money = money-(50*temp);
		System.out.println("���ʱ� : "+temp);
		
		temp = money/10;
		money = money-(10*temp);
		System.out.println("�ʿ��� : "+temp);

		temp = money/1;
		money = money-(1*temp);
		System.out.println("�Ͽ� : "+temp);

	}
}
