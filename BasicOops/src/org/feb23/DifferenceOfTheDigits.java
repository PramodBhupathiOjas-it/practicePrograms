package org.feb23;

public class DifferenceOfTheDigits {
	public static int DiffOfDigits(int num) {
		int rem,diff=0;
		rem = num%10;
		num=num/10;
		diff=(rem>num)?rem-num:num-rem;
		return diff;		
		
	}
	public static void main(String args[]) {
		int num = Integer.parseInt(args[0]);
		System.out.println("The given num is "+num);
		System.out.println("difference of the digits is "+DiffOfDigits(num));
	}

}
