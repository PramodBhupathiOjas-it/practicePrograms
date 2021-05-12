package org.feb24;

import java.util.Scanner;

public class ArraySum {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the Array :");
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("enter the elements of the array :");
		for(int i=0;i<size;i++) {
			array[i]=sc.nextInt();
		}
		int sum = SumOfTheArray(array,size);
		System.out.println("sum of the array is : "+sum);
	}

	private static int SumOfTheArray(int[] array, int size) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<size;i++) {
			sum=sum+array[i];
		}
		if(sum>0) {
			return sum;
		}else {
			return 0;
		}
		
	}

}
