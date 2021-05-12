package org.march6;

import java.util.Scanner;

public class KaprekarNumber {
	
	static String getKaperkarNumber(int number) {
		String res = "", num = "";
		if(number < 0) {
			res = "-1";
		}
		else if(number == 0) {
			res = "-2";
		}
		if(number > 0) {
			num += (number * number);
			int mid = num.length() / 2;
			System.out.println(num);
			int sum = (Integer.parseInt(num.substring(0, mid)) + Integer.parseInt(num.substring(mid, num.length())));
			res += (number == sum);
			}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to check kaperkar or not: ");
		int number = scanner.nextInt();
		System.out.println(getKaperkarNumber(number));
		scanner.close();
	}

}
