package org.march6;

import java.util.Scanner;

public class ArrayRotation {
	
	static int[] rotate(int[] arr,int positions) {
		
		
				
			while(positions > 0) {
				int last = arr[arr.length-1];
			for(int i = arr.length-1; i > 0; i--) {
				
				arr[i] = arr[i-1];
			}
			arr[0] = last;
			positions--;
		}			
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the Array");
		int size = sc.nextInt();
		
		System.out.println("enter the elements :");
		int[] array = new int[size];
		for(int i = 0;i < size;i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.println("enter the No of positions to rotate array");
		
		int[] result = rotate(array,sc.nextInt());
		
		System.out.println("rotated array is :");
		for(int i = 0;i < result.length;i++) {
			System.out.print(result[i] + " ");
		}

	}

}
