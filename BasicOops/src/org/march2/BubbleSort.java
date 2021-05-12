package org.march2;

import java.util.Scanner;

public class BubbleSort {
	
	static int[] getBubbleSort( int arr[]) {
		
		int temp = 0;
		int n = arr.length;
		
		for ( int i = 0;i < n; i++ ) {
			for( int j = 1; j < (n-i); j++) {
				if(arr[j - 1] > arr[j]) {
					
					temp = arr[j -1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		
		
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size of the array:");
		int size = sc.nextInt();
		
		int [] arr = new int[size];
		
		System.out.println("enter the elements of array");
		
		for(int i = 0; i < size ; i++) {
			arr[i] = sc.nextInt();
		}
		
		int res[] = getBubbleSort(arr);
		
		System.out.println("Bubble sort is");
		
		for(int i = 0; i < size ; i++) {
			
			System.out.println(res[i]);
		}

	}

}
