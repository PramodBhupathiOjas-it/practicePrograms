package org.march6;

import java.util.Scanner;

public class NearestElement {
	
	static int getNearestElement(int[] arr) {
		int min = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		return --min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("enter the elements");
		for(int i = 0;i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("The Nearest Minimum Element in Array is :\n" + getNearestElement(arr) );
		
		

	}

}
