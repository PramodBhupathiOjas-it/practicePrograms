package org.march2;

import java.util.Scanner;

public class SumOfTheNumberInGivenRange {
	
	static int getSum(int start,int end) {
		
		if (start == end) {
			
			return start;
		}
		else {
			return start + getSum(++start,end);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the range ");
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		System.out.println("The Sum of number between " + start + " and "+ end +" = " +getSum(start,end));
	}

}
