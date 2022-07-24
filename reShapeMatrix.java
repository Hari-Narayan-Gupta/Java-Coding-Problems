package practiceDSA;

import java.util.Scanner;

public class reShapeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the value of 2D matrix: ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] []arr = new int[n][m];
		int arr1[]  = new int[n*m];
		System.out.println("Enter the size of target matrix: ");
		int r = sc.nextInt();
		int c = sc.nextInt();
		int arr2[][] = new int[r][c];
		System.out.println("ENter the elements of matrix: ");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		if(c > m*n || r > m*n || (m*n) != (r*c)) {
			System.out.println("New Shape of matrix is not possible: ");
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}
		else {
			int k = 0;
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {
					arr1[k] = arr[i][j]; 
					k++;
				}
				
			}
			k = 0;
			for(int i = 0; i < r; i++) {
				for(int j = 0; j < c; j++) {
					arr2[i][j] = arr1[k];
					k++;
				}
			}
			for(int i = 0; i < r; i++) {
				for(int j = 0; j < c; j++) {
					System.out.print(arr2[i][j] + " ");
				}
				System.out.println();
			}
		}
		
		
	}

}

