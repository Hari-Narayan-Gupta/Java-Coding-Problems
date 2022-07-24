package practice;

import java.util.Scanner;

public class _35_numberOfTimesThatParticularTargetWord {

	    public static void main (String[]args) 
	    {
	        Scanner sc = new Scanner (System.in);
	        System.out.println("Enter a string:");
	        String str = sc.nextLine();
	        System.out.println("Enter a target word:");
	        String  tar = sc.nextLine();
			String[] arr = str.split(" ");
			int count = 0;
			for(int i = 0; i < arr.length; i++) {
				if(arr[i].equals(tar)) {
					count++;
//					System.out.println(tar);
				}
			}
//			System.out.println(arr[1].equals(tar));
			System.out.println(count + " Time particular word occur...");
	}

}
