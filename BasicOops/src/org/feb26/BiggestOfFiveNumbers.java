package org.feb26;

public class BiggestOfFiveNumbers {
	public static void main(String[] args) {
		
		int firstNumber = Integer.parseInt(args[0]);
		
		int secondNumber = Integer.parseInt(args[1]);
		
		if(firstNumber < secondNumber) {
			firstNumber = secondNumber;
		}
		firstNumber = Integer.parseInt(args[2]);
		if(firstNumber < secondNumber) {
			firstNumber = secondNumber;
		}
		firstNumber = Integer.parseInt(args[3]);
		if(firstNumber < secondNumber) {
			firstNumber = secondNumber;
		}
		firstNumber = Integer.parseInt(args[3]);
		if(firstNumber < secondNumber) {
			firstNumber = secondNumber;
		}
		System.out.println(firstNumber + " is the biggest number.");
	}

}
