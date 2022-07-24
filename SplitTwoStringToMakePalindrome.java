package practiceDSA;

import java.util.Scanner;

public class SplitTwoStringToMakePalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two string ");
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		int str1_len = str1.length()/2;
		int str2_len = str2.length()/2;
		String b_prifix = "";
		String b_postfix = "";
		boolean boo1 = false;
		boolean boo2 = false;
		
		String a_prifix = "";
		String a_postfix = "";
		for(int i = str2_len-1; i >= 0; i--) {
			b_prifix += str2.charAt(i);
			
		}
		for(int i = str2.length()-1; i >= str2_len; i--) {
			b_postfix += str2.charAt(i);
		}
		
		
		for(int i = str1_len-1; i >= 0; i--) {
			a_prifix = str1.charAt(i) + a_prifix;
			
		}
		for(int i = str1.length()-1; i >= str1_len; i--) {
			a_postfix = str1.charAt(i) + a_postfix;
		}
		
		
			if(a_prifix.equals(b_postfix)){

				boo1 = true;
			}
			else {
				boo1 = false;
			}
//			System.out.println("----------------------------------------");
			if(a_postfix.equals(b_prifix)) {
				boo2 = true;
			}
			else {
				
				boo2 = false;
			}
			
			
		if(boo1) {
			System.out.println("------True-----");
			System.out.println("a_prifix = "+ a_prifix);
			System.out.println("b_postfix = "+ b_postfix);
		}
		else {
			System.out.println("------False-----");
			System.out.println("a_prifix = "+ a_prifix);
			System.out.println("b_postfix = "+ b_postfix);
		}
		System.out.println("----------------------------------------");
		
		if(boo2) {
			System.out.println("------True-----");
			System.out.println("a_postfix = "+ a_postfix);
			System.out.println("b_prifix = "+ b_prifix);
		}
		else {
			System.out.println("------False-----");
			System.out.println("a_postfix = "+ a_postfix);
			System.out.println("b_prifix = "+ b_prifix);
		}
		
	}

}
