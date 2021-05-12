package org.march2;

import java.util.Scanner;

public class SelectionSort {
	
	static int[] getSelectionSort(int arr[]) {
		
		int temp, min_indx;
		
		for(int i =0 ; i < arr.length-1; i++) {
			  min_indx = i;
			for(int j= i + 1 ;j < arr.length; j++) {
				if(arr[j] < arr[min_indx]) {
					min_indx = j;
				}
			}
					temp = arr[i];
					arr[i] = arr[min_indx];
					arr[min_indx] = temp;
				
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
		
		int res[] = getSelectionSort(arr);
		
		System.out.println("Selection sort is");
		
		for(int i = 0; i < size ; i++) {
			
			System.out.println(res[i]);
		}

	}

}
