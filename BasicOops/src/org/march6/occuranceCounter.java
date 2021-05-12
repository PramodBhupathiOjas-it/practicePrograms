package org.march6;

import java.util.Scanner;

public class occuranceCounter {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("enter the elements of the array");
		for (int i = 0; i < size; i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("Enter the number to be searched :");
		int searchNumber = sc.nextInt();
		int result = getCount(array,size,searchNumber);
		System.out.println("the occurance of the given number is :"+result);
		
	}

	private static int getCount(int[] array, int size, int searchNumber) {
		int count=0;
		for(int i=0;i<size;i++) {
			if(searchNumber==array[i]) {
				count++;
			}
		}
		if(count>0) {
			return count;
		}else {
			return -1;
		}
	}

}
