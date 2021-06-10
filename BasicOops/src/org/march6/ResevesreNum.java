package org.march6;

import java.util.Scanner;

public class ResevesreNum {
	static int getReverseNum(int num) {
		int rem =0;
		int rev=0;
		while(num>0) {
			rem = num%10;
			rev = rev*10 + rem;
			num = num/10;
		}
		return rev;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to reverse: ");
		int num = getReverseNum(sc.nextInt());
		System.out.println("reverse of a num: "+num );
	}

}
