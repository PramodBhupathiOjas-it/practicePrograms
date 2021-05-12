package org.march2;
import java.util.*;

public class LinearSearch {
	
	static boolean isPresent(int arr[], int num) {
		boolean b = false;
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				b = true;
				break;
			}
			
		}
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size of the array:");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("enter the elememts of the array:");
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("enter the number to be searched:");
		int num = sc.nextInt();
		
		if(isPresent(arr,num)) {
			System.out.println(num + " is present.");
		}
		else {
			System.out.println(num + " is not present.");
		}

	}

}
