package practiceDSA;
import java.util.*;

public class plusOneInArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size array: ");
		int n = sc.nextInt();
		String str = "";
		int num = 0;
	    int arr[] = new int[n];
	    for(int i= 0; i < arr.length; i++) {
	    	arr[i] = sc.nextInt();
	    	}
	    
	    for(int i = 0; i < arr.length; i++) {
	    	num = num*10;
	    	num += arr[i];
	    }
	    num = num+1;
	    intToArray(num);
	    }
	 static void intToArray(int n) {
		int j = 0;
		int len = Integer.toString(n).length();
		int arr1[]= new int[len];
		while(n!=0) {
			arr1[len-j-1] = n%10;
			n = n/10;
			j++;
		}
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]);
		}
		
	}

}
