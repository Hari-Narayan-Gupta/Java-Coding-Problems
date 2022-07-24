package practiceDSA;

import java.util.*;

public class SpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of matrix: ");
		int r = sc.nextInt();
		int c = sc.nextInt();
		int k = 0, m = 0;
		int arr[][] = new int[r][c];
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i <= 0; i++) {
			for(int j = 0; j < c; j++) {
				System.out.print(arr[i][j] + "->");
				k++;
			}
//			System.out.print
  			for(int j = k-1; j < c; j++) {
				for(int l = 1; l < c; l++) {
					System.out.print(arr[l][j] + "->");
                     m++;
				}	
			}
  			for(int l = m; l > 0; l--) {
				System.out.print(arr[m][l-1] + "->");
			}
  			for(m = m-1 ; m > 0; m--) {
  				for(int j = 0; j < c-1; j++) {
  					System.out.print(arr[m][j] + "->");
  				}
  			}
		}
		System.out.println("null");
	}

}
