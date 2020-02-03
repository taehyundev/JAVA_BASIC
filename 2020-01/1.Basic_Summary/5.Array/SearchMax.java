import java.util.Scanner;
public class SearchMax {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[] = new int[9];
		int max = arr[0];
		int maxi=0;
		
		for(int i=0; i<arr.length; i++) {   
			arr[i] =s.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) {
	    	if(max<arr[i]) {
	    		max=arr[i];
	    		maxi = i; // 
	    	}
	    	}
    	System.out.println(max);
        System.out.println(maxi+1); 
	}

}