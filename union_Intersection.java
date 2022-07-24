package practiceDSA;

import java.util.LinkedList;
import java.util.Scanner;

public class union_Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<Integer>();
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of both array: ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[] = new int[n];
		int arr1[] = new int[m];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr1.length; j++) {
				if(arr[i] == arr1[j]) {
					list.addLast(arr[i]);
			  }
				else {
					if(j == arr1.length-1) {
						list1.addLast(arr[i]);
					}
					list1.addLast(arr[i]);
				}
	       }
			
        }
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		for(int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
	}
}
