package org.march2;

import java.util.Scanner;

public class PrimeNumberInArray {
	
	static String getPrimeNumbers(int arr[]) {
		String res = "";
		
		for(int i = 0;i < arr.length; i++) {
			int count = 0;
			for(int j = 2; j < arr[i]; j++ ) {
				if(arr[i] % j == 0) {
					count++;
				}
				}
			
				if(count == 0) {
					res += arr[i] + ",";
				}
			
			 count = 0 ;
			
		}
		return res.substring(0, res.length()-1);
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
		 System.out.println("prime numbers in array are: \n"+getPrimeNumbers(arr)+".");


	}

}
