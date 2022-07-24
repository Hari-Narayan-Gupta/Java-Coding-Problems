package practiceDSA;
import java.util.*;
public class LuckyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated cethod stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of matrix: ");
		int r = sc.nextInt();
		int c = sc.nextInt();
		int arr[][] = new int[r][c];
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		specialNumber(arr, r, c);
	}

	static void specialNumber(int[][] arr, int r, int c) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
	    int tempArr[] = new int[c];
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				tempArr[j] = arr[i][j];
			}
		    int min = getSmallest(tempArr, tempArr.length);
			list.addLast(min);
		}
		for(int i = 0;  i < c; i++) {
			for(int j = 0; j < r; j++) {
				tempArr[j] = arr[j][i];
			}
			int max = getLargest(tempArr);
			
			list2.addLast(max);	
		}
		
		
		for(int i = 0; i < list.size(); i++) {
			for(int j = 0; j < list2.size(); j++) {
				if(list.get(i) == list2.get(j)) {
					System.out.print(list.get(i)+ " ");
				}
			}
			
		}

		
		
	}

	
	
	  static int getLargest(int[] b) {
		// TODO Auto-generated method stub
		  Arrays.sort(b);
		return b[b.length- 1];
	}

	static int getSmallest(int[] a, int total) {
		// TODO Auto-generated method stub
		 int temp;
		 for(int i = 0; i < total; i++) {
			 for(int j = i+1; j< total; j++) {
				 if(a[i] > a[j]) {
					 temp = a[i];
					 a[i] = a[j];
					 a[j] = temp;
				 }
			 }
		 }
		return a[0];
	}

	
  }
				
	

