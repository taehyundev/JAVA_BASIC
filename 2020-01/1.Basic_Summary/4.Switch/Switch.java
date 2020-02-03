import java.util.Scanner;
public class Switch {
	   public static void main(String[] args) {
		      Scanner s = new Scanner(System.in);
		      int n = s.nextInt();
		      switch(n) {
		      case 1:
		    	  System.out.println("사과");
		    	  break;
		      case 2:
		    	  System.out.println("딸기");
		    	  break;
		      case 3:
		    	  System.out.println("망고");
		    	  break;
		    	  
		      default:
		    	  System.out.println("그 외");
		    	  break;
		      }
		}
}