package org.feb27;

public class SumOfFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int num = Integer.parseInt(args[0]);
		if(num > 0) {
			for(int i = 1 ;i <= num; i++) {
				sum += i ;
			}
		}
		else {
			System.out.println("invalid number");
		}
		System.out.println("sum of the factors of " + num + " \n " + sum);

}

	

}
