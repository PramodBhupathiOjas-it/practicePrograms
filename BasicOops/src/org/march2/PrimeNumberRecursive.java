package org.march2;

import java.util.*;

public class PrimeNumberRecursive {
	
	static boolean isPrime(int num , int i) {
		
		if(num <= 2 || num == 2) {
			return true ;
		}
		if(num % i == 0) {
			return false;
		}
		if(i *i > num) {
			return true;
		}
		  
		return isPrime(num,i+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number :");
		int num = sc.nextInt();
		boolean res = isPrime(num,2);
		if(res == true) {
			System.out.println(num + " is prime");
		}
		else {
			System.out.println(num +" is not prime");
		}
		

	}

}
