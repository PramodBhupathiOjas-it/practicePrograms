package org.feb24;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class evenList {
	public static List<Integer> getEvenArray(int array[],int size) {
		List<Integer> result = new ArrayList<Integer>();
		
			for(int j=0;j<size;j++) {
			if(array[j]%2==0) {
				result.add(array[j]);				
			}
		
		}
		return result;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size: ");
		int size = sc.nextInt();
		if(size<10) {
			System.out.println("enter the size more than 10 ");
		}else {
		int array[] = new int[size];
		int resultArray[] = new int[size];
		for(int i =0;i<size;i++) {
			array[i] = sc.nextInt();
		}
		System.out.println(getEvenArray(array,size));
		
		}
		
	}

}
