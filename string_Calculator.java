package practiceDSA;

import java.util.Scanner;

public class string_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter eny expression: ");
        String str = sc.nextLine();
        int result = 0;
        for(int i = 0; i < str.length(); i++) {
        	result = Integer.parseInt(null, str.charAt(i), i, i);
        }
        
        System.out.println();
	}

}
