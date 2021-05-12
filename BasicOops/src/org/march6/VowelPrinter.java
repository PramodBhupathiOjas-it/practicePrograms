package org.march6;

import java.util.Scanner;

public class VowelPrinter {
	
	static String filterConsonants(String str) {
		String res ="";
		
		
		
		for(int i = 0; i <str.length();i++) {
			if(isVowel(str.charAt(i))) {
				res += str.charAt(i);
			}
		}
				
		return res;
	}
	
	static boolean isVowel(char ch) {
		
		
		ch = Character.toUpperCase(ch);
		return (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' );
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String str = sc.next();
		
		System.out.println("Vowels in the given string : \n" + filterConsonants(str));
		
	}

}
