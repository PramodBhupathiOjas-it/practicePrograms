package org.march2;
import java.util.*;

public class SumofNaturalsRecursive {
	
	//sum of the natural number method
	static int sumNatural(int num) {
		int sum = num;
		if(num > 0) {
			return sum + sumNatural(num-1);
		} 
		else {
			return 0;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the natural number :");
		int num = sc.nextInt();
		
		//calling the method and printing the value
		System.out.println("sum of the natural numbers from 1 to " + num + " is " +sumNatural(num));

	}

}
