package org.feb24;

import java.util.Scanner;

public class MinNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("enter the elements of the array: ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int minNumber = getMinNumber(arr,size);
		System.out.println("max number of the array is: "+minNumber);
	}

	private static int getMinNumber(int[] arr, int size) {
		// TODO Auto-generated method stub
		int min=arr[0];
		for(int i=0;i<size;i++) {
			
				if(arr[i]<min) {
					min=arr[i];
				}
			
		}
		return min;
	}

}
