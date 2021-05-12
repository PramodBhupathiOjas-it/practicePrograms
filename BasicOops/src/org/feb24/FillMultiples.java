package org.feb24;

import java.util.Scanner;

public class FillMultiples {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number for multiples:  ");
		int num = sc.nextInt();
		int[] resultMultiple = new int[10];
		resultMultiple=getMultiples(num);
		System.out.println("Multiples of number "+num+" is: ");
		for(int i=1;i<=resultMultiple.length;i++) {
			System.out.println(num +" * "+i+" = "+resultMultiple[i-1]);
		}
	}

	private static int[] getMultiples(int num) {
		// TODO Auto-generated method stub
		int[] resultMultiples = new int[10];
		for(int i=1;i<=10;i++) {
			resultMultiples[i-1]= num*i;
		}
		return resultMultiples;
	}

}
