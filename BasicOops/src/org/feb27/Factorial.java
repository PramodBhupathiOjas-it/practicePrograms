package org.feb27;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int factorial = 1;
			int num = Integer.parseInt(args[0]);
			if(num > 0) {
				for(int i = 1 ;i <= num; i++) {
					factorial = factorial * i;
				}
			}
			else {
				System.out.println("invalid number");
			}
			System.out.println("factorial of the " + num + " = " + factorial);

	}

}
