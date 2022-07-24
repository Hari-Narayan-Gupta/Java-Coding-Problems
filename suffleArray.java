package practiceDSA;

import java.util.LinkedList;
import java.util.Scanner;

public class suffleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<Integer>();
        System.out.println("Enter the Value of 'n': ");
        int n = sc.nextInt();
        int len = n*2;
        int arr[] = new int[len];
        int a[] = new int[len/2];
        int b[] = new int[len - a.length];
        for(int i = 0; i < arr.length; i++) {
        	arr[i] = sc.nextInt();
        }
        for(int i = 0; i < len; i++) {
        	if(i < a.length) {
        		a[i] = arr[i];
        	}
        	else {
        		b[i - a.length] = arr[i];
        	}
        }
        for(int i = 0; i < a.length; i++) {
        	System.out.print(a[i]+ " ");
        	do {
        		System.out.println(b[i]+ " ");
        	}while(i < 0);
        	
        }
    
        
	}

}
//output
//Enter the Value of 'n': 
//3
//3 2 1 6 5 4
//3 6 
//2 5 
//1 4 
