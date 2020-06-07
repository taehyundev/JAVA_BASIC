package pb12;

import java.util.Scanner;

public class GraphicEditor {
	private String name;
	private Shape start=null,end=null;
	private Scanner s;
	public GraphicEditor(String name) {
		this.name = name;
		s=new Scanner(System.in);
	}
	
	public void run() {
		System.out.println("그래픽 에디터 "+name+"을 실행합니다.");
		while(true) {
			System.out.print("삽입(1), 삭제(2), 모두보기(3), 종료(4)>>");
			int sw = s.nextInt();
			if(sw == 4) break;
			switch (sw) {
			case 1:
				System.out.print("Line(1), Rect(2), Circle(3)>>");
				int shapeType = s.nextInt();
				insert(shapeType);
				//삽입
				break;
			case 2:
				//삭제
				System.out.print("삭제할 도형의 위치>>");
				int index = s.nextInt();
				if(!delete(index)) // 
					System.out.println("삭제할 수 없습니다.");
				break;
			case 3:
				//모두보기
				Shape s = start;
				while(s != null) {
					s.draw();
					s = s.getNext();
				}
				break;
			}
		}
		System.out.println(name+"을 종료합니다.");
	}
	public boolean delete(int index) {
		Shape pre=start,cur=start;
		//cur 현재 지점 pre 이전 지점
		if(start==null) return false;
		
		for(int i=1; i<index; i++) {
			pre = cur;
			cur = cur.getNext();
			if(cur == null) return false;
		}
		if(start == end) {
			start=end = null;
			return true;
		}
		if(start == cur) {
			start = start.getNext();
		}
		else if(end == cur) {
			end = pre;
			end.setNext(null);
		}else {
			pre.setNext(cur.getNext());
		}
		
		return true;
	}
	public void insert(int Type) {
		Shape obj = null;
		switch (Type) {
		case 1:
			obj = new Line();
			break;
		case 2:
			obj = new Rect();
			break;
		case 3:
			obj = new Circle();
			break;
		}
		if(start == null) {
			start=end= obj;
		}else {
			end.setNext(obj);
			end = obj;
		}
		
		
	}
	public static void main(String[] args) {
		GraphicEditor ge = new GraphicEditor("beauty");
		ge.run();
	}
}
