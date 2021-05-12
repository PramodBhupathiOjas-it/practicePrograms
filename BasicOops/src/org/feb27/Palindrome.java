package org.feb27;

public class Palindrome {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int temp = num;
		int rem, rev = 0;
		String res = " ";
		while(temp>0) {
			rem = temp % 10;
			rev = rev *10 + rem;
			temp = temp / 10;
		}
		if(rev == num) {
			res += num +" is palindrome.";
		}
		else {
			res += num + " is not a palindrome.";
		}
		System.out.println(res);
	}

}
