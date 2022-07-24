package practiceDSA;

import java.util.*;

public class next_Greater_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an Integer: ");
//		int num = sc.nextInt();
		int num = 12;
		int rem = 0;
		int rev = 0;
		int n = num;
		while(n != 0) {
			rem = n%10;
			rev = (rev*10) + rem;
			n = n / 10;
		}
		System.out.println("New number is: " + rev);
		
		if(num <= rev) {
			System.out.println("True");
		}
		else {
			System.out.println(-1);
		}

	}

}
