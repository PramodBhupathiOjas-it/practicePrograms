package org.feb27;

import java.util.*;

public class NaturalNumbers {

	static String getNaturalNumber(int num) {
		String result = "";
		for (int i = 1; i <= num; i++) {

			result += i + " ";
		} 
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the number for naturals Number:  ");
		int num = sc.nextInt();

		System.out.println(getNaturalNumber(num));

	}
}
