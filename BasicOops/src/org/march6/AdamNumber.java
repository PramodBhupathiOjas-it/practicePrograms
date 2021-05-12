package org.march6;

import java.util.Scanner;

public class AdamNumber {
	
	static String isAdam(int num) {
		String res = "";
		int sqOfNum = num * num;
		int revOfNum = getReverse(num);
		int sqOfRevNum = revOfNum * revOfNum;
		if(sqOfRevNum == getReverse(sqOfNum)) {
			res += num + " is Adam Number.";
		}
		else {
			res += num + " is not Adam Number.";
		}
		return res;
	}
	
	static int getReverse(int num) {
		
		int result=0,rem;
		while(num > 0) {
			rem = num % 10;
			result = result * 10 + rem;
			num = num/10;
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to be check whether it is adam or not");
		int num = sc.nextInt();
		System.out.println(isAdam(num));
	}

}
