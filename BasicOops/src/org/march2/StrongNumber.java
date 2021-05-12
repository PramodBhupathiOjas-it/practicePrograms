package org.march2;

import java.util.Scanner;

public class StrongNumber {
	
	static int getFactorial(int num) {
		
		if( num == 0) {
			return 1;
		}
		return num * getFactorial(num -1);
		
		
	} 
	
	static int isStrong(int num) {
		int rem = 0, sum = 0;
		while(num > 0) {
			rem = num % 10;
			sum = sum + getFactorial(rem);
			num = num / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int num = sc.nextInt();
		if(isStrong(num) == num) {
			System.out.println(num + " is a strong number");
		}
		else {
			System.out.println(num + " is not a strong number");
		}
		

	}

}
