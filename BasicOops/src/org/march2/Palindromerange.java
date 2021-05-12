package org.march2;

import java.util.Scanner;

public class Palindromerange {
	
	static String getpalindromeNumbers(int startValue, int endValue){
		String res = "";
		
            for(int i = startValue; i <= endValue; i++ ) {
			
			int temp = i, rem = 0, sum =0;
			while(temp > 0) {
				rem = temp % 10;
				sum = sum * 10 + rem;
				temp = temp /10;
			}
			
			if(sum == i) {
				res += sum + ",";
			}
			
		}
		return res.substring(0,res.length()-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the range to get palindrome numbers ");
		
		int startValue = sc.nextInt();
		int endValue = sc.nextInt();
		
		System.out.println("palindrome Numbers for given range " + startValue + "and" + endValue + "\n" + getpalindromeNumbers(startValue,endValue));

	}

}
