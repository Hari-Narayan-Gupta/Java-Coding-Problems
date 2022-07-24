package practiceDSA;

import java.util.Scanner;

public class Matching_String {

	public static boolean areSentencesSimilar(String sentence1, String sentence2) {
        String arr1[] = sentence1.split(" ");
        String arr2[] = sentence2.split(" ");
        int i = 0,j = 0,k = 0;
        int n[]=new int[arr2.length];
        try {
        	
        	if(arr1.length>arr2.length){
        		
        		for(String s:arr1){
        			if(s.equals(arr2[j])){
        				j++;
        				n[k++]=i;
        			}       
        			i++;
        			
        		}
        		
        	}
        }catch(ArrayIndexOutOfBoundsException e){
        	return false;
        }
//        for(int m:n) {
//        	System.out.println(m);
//        }
        if(n.length==1&&(n[0]==0||n[0]==arr1.length-1)) {
        	return true;
        }else if(n[0]==0&&n[1]==arr1.length-1){
        	return true;
        }else{
        	
        	for(int m=1;m<n.length;m++) {
        		if(n[m-1]!=(n[m]-1)) {
        			return false;
        		}
        	}
        }
	return true;

    }


public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two strings");
	String str1=  sc.nextLine();
	String str2=  sc.nextLine();
	boolean b= areSentencesSimilar(str1, str2);
	System.out.println(b);
}

}


//String1 = "My name is Harry"
//String2 = "My Harry"
// return true;
// because both sentence can be same after adding "name is" between "My" and "Harry"
// 