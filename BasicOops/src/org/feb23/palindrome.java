package org.feb23;

public class palindrome {
	public static boolean reverseOfNum(int num) {
		int rev=0,rem1,rem2,temp;
		temp=num;
		rem1=temp%10;
		rev=rev*10+rem1;
		temp=temp/10;
		rem2=temp%10;
		rev=rev*10+rem2;
		temp=temp/10;
		rev=rev*10+temp;
		boolean result=(num==rev)?true:false;
		return result;
		
	}
	public static void main(String args[]) {
		int num = Integer.parseInt(args[0]);
		System.out.println("given num is "+num);
		System.out.println(reverseOfNum(num));
		
	}

}
