package org.feb24;

import java.util.Scanner;

public class oddListCounter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array: ");
		int size = sc.nextInt();
		if(size<10) {
			System.out.println("Array size should not be less than 10.");
		}else {
		int[] array = new int[size];
		System.out.println("enter the elements of the Array :");
		for(int i=0;i<size;i++) {
			array[i]=sc.nextInt();
		}
		int result = getOddCounter(array,size);
		System.out.println("Number of Odd Numbers are: "+result);
	}
	}

	private static int getOddCounter(int[] array, int size) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0;i<size;i++) {
			if(array[i]%2!=0) {
				count++;
			}
		}
		if(count>0) {
			return count;
		}else {
			return 0;
		}
	}

}
