package org.march2;

import java.util.Scanner;

public class DuplicateElementsArray {
	
	static String getDuplicateValues(int arr[]) {
		String res = " ";
		for(int i =0; i < arr.length; i++ ) {
			for(int j = i + 1;j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					res += arr[j] + ",";
				}
			}
		}
		return res.substring(0,res.length()-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size:");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("enter the elements:");
		
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		 System.out.println("Duplicate values are: \n"+getDuplicateValues(arr)+".");

	}

}
