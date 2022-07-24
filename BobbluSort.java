package practiceDSA;

import java.util.*;

public class BobbluSort {
     static int[] bobbulsort(int input[]){
         for(int i=0;i<input.length-1;i++){
            for(int j=0;j<input.length-i-1;j++){
                if(input[j]>input[j+1]){
                    int temp = input[j];
                    input[j]=input[j+1];
                    input[j+1]=temp;
                }
            }
        } 
       return input;
   }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedList<int[]> list1 = new LinkedList<int[]>();
        
        System.out.println("Enter no. of arrays :");
        int a =in.nextInt();
        for(int i = 0; i < a; i++){
            System.out.println();
            System.out.println("Enter the size of array");
            int size = in.nextInt();
            int input[]= new int[size];
            System.out.println("Enter elements of array");
            for (int j = 0; j < input.length; j++){

                input[j]=in.nextInt();
            }
            
            list1.addLast(bobbulsort(input));
            
             }
        for(int i = 0; i < a; i++) {
        	int arr[] = list1.get(i);
        	for(int j = 0; j < arr.length; j++) {
        		System.out.print(arr[j] + " ");
        	}
        	System.out.println();
        }
        }
    }


