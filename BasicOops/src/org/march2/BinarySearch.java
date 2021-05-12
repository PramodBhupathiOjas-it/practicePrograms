package org.march2;

import java.util.*;

public class BinarySearch {
	
	static boolean isPresent(int arr[],int num) {
		boolean b = false;
		int l = 0, h = arr.length -1;
		while(l <= h) {
			int mid = l + (h-l) / 2 ;
			
			if(arr[mid] == num) {
				b = true;
				break;
			}
			if(arr[mid] > num) {
				h = mid - 1;
			}
			else {
				l = mid + 1;
			}
		}
		return b;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size:");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("enter the elements:");
		
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
				
		System.out.println("enter the number to be searched:");
		int num = sc.nextInt();
		
		if(isPresent(arr,num)) {
			
			System.out.println(num + " is present");
		}
		else {
			System.out.println(num + " is not present");
		}
		
	}

}
