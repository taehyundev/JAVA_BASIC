package java_project;

import java.util.Scanner;

public class chap3_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = {"가위", "바위", "보"}; // 가위, 바위, 보를 배열에 넣어둔다.
		
		Scanner s = new Scanner(System.in); // 입력 객체를 생성
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		while(true) { // 무한 루프를 돌린다.
			System.out.print("가위 바위 보!>>");
			int n = (int)(Math.random() * 3); // 0,1,2 랜덤의 값을 n으로 반복이 시작될 때마다 넣어준다.
			String sw =s.next(); // sw에다가 가위, 바위, 보 중 하나의 문자열을 입력받는다.
			if(sw.equals("그만")) { // 그만이라고 입력 되면 반복문 밖으로 나가게 된다.
				System.out.println("게임을 종료합니다...");
				break;
			}
			//만약에 내가 입력한 값이 가위 일때, 바위 일때, 보 일 때의 경우를 넣고
			//그안에서 세부적으로 배열의 값들을 모두 참조한다. (str[n])
			//랜덤하게 나온 결과에 따라 참조가 되므로 str의 n번째 원소를 참조한다.
			//이 때 참조했을 때의 출력 값을 System.out.println으로 출력 시켜준다.
			
			else if(sw.equals("가위")) { 
				if(str[n].equals("가위")) {
					 System.out.println("사용자 = "+sw+" , 컴퓨터 = "+str[n]+" 비겼습니다.");
				}else if(str[n].equals("바위")) {
					 System.out.println("사용자 = "+sw+" , 컴퓨터 = "+str[n]+" 사용자가 졌습니다.");
				}else if(str[n].equals("보")) {
					 System.out.println("사용자 = "+sw+" , 컴퓨터 = "+str[n]+" 사용자가 이겼습니다.");

				}
			}else if(sw.equals("바위")) {
				if(str[n].equals("가위")) {
					 System.out.println("사용자 = "+sw+" , 컴퓨터 = "+str[n]+" 사용자가 이습니다.");
				}else if(str[n].equals("바위")) {
					 System.out.println("사용자 = "+sw+" , 컴퓨터 = "+str[n]+" 비겼습니다.");
				}else if(str[n].equals("보")) {
					 System.out.println("사용자 = "+sw+" , 컴퓨터 = "+str[n]+" 사용자가 졌습니다.");

				}
			}else if(sw.equals("보")) {
				if(str[n].equals("가위")) {
					 System.out.println("사용자 = "+sw+" , 컴퓨터 = "+str[n]+" 사용자가 졌습니다.");
				}else if(str[n].equals("바위")) {
					 System.out.println("사용자 = "+sw+" , 컴퓨터 = "+str[n]+" 사용자가 이겼습니다.");
				}else if(str[n].equals("보")) {
					 System.out.println("사용자 = "+sw+" , 컴퓨터 = "+str[n]+" 비겼습니다.");

				}
			}
			
		}
		s.close(); //밖으로 나오게 됬을 떄 입력 객체를 닫는다.
	}

}
