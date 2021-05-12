package org.feb23;

public class sumOfTheDigits {
	public static int sumOfDigits(int num) {
		int rem,sum=0;
		rem = num%10;
		num=num/10;
		sum=rem+num;
		return sum;		
		
	}
	public static void main(String args[]) {
		int num = Integer.parseInt(args[0]);
		System.out.println("The given num is "+num);
		System.out.println("sum of the digits is "+sumOfDigits(num));
	}

}
