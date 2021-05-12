package org.march6;

import java.util.Scanner;

public class SumOfTheEvenNumberInArray {
	
	static int getSumOfTheEvenNumber(int[] arr) {
		int result = 0;
		if(arr.length == 0) {
			return -3;
		}
		for(int i = 0;i < arr.length; i++) {
			
			 if(arr[i] < 0 ) {
				result = -1;
				break;
			}
			 if(arr[i] == 0) {
					result = -2;
					break;
			}
			
			if(arr[i] % 2 == 0){
				result  += arr[i]; 
			}
			else {
				result = 0;
				
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		System.out.println("enter the elements");
		for(int i = 0;i < size;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(getSumOfTheEvenNumber(arr));

	}

}
