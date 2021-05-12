package org.feb24;

import java.util.Scanner;

public class russianMultiplication {
	public static int multiplication(int firstNumber,int secondNumber) {
		int result =0;
		int even, odd;
		if(firstNumber%2 == 0 && secondNumber%2==0) {
			return -1;
		}else if(firstNumber%2 != 0 && secondNumber%2!=0) {
			return -1;
		}else if(firstNumber%2==0 && secondNumber%2!=0) {
			even = firstNumber;
			odd = secondNumber;
			result = (even*2)*(odd/2)+even;
			return result;
		}else if(secondNumber%2==0 && firstNumber%2 != 0) {
			even = secondNumber;
			odd = firstNumber;
			result = (even*2)*(odd/2)+even;
			return result;
		}
		return 0;
	}
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the first number: ");
		int firstNum = scan.nextInt();
		System.out.println("enter the Second number: ");
		int secondNum = scan.nextInt();
		int result = multiplication(firstNum,secondNum);
	    System.out.println("The russian multiplication is = "+result);
	}

}
