package practice;

import java.util.Scanner;

public class _45_find_maximum_diffrence_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int []arr = new int[n];
		System.out.println("Enter the element in array");
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("max_diffrence  "+ diffrence(arr, n));
	}

static int diffrence(int arr[], int n){
	int max = arr[0] - arr[1];
	
	for(int i = 0; i<n; i++) {
		for(int j = i+1; j<n; j++) {
			if(arr[i] - arr[j] > max) {
				max = arr[i] - arr[j];
			}
		}
	}
	
	return max;
	
}

}


//ENter the size of array
//5
//Enter the element in array
//2 5 4 8 6
//max_diffrence  2
