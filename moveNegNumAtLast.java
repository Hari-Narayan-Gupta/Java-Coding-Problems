package practiceDSA;

import java.util.LinkedList;
import java.util.Scanner;

public class moveNegNumAtLast {
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < 0) {
				list.addLast(arr[i]);
			}
			else {
				list.addFirst(arr[i]);
			}
		}
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+ ", ");
		}
	}

}
