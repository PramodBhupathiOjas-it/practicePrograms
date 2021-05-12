package org.march2;

import java.util.Scanner;

public class ReverseOfTheArray {
	
	static String getReverseList(int arr[]) {
		String res = "";
		for(int i = arr.length-1; i >= 0; i--) {
			
				res += arr[i] + ",";
			
		}
		return res.substring(0,res.length()-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size of the array:");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("enter the elements of the array");
		
		for(int i = 0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Even numbers in the Array : \n" + getReverseList(arr));

}
}

