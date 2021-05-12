package org.feb27;

public class ListFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String factors = "";
		int num = Integer.parseInt(args[0]);
		if(num > 0) {
			for(int i = 1 ;i <= num; i++) {
				factors += i + ",";
			}
		}
		else {
			System.out.println("invalid number");
		}
		System.out.println("factors of the " + num + " \n " + factors.substring(0, factors.length()-1));

}

	}


