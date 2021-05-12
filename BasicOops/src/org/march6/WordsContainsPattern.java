package org.march6;

import java.util.Scanner;

public class WordsContainsPattern {
	
	static String getWordsContainsPattern(String[] words, String pattern) {
		String res = "";		 
		for(String x : words) {
			if(x.contains(pattern.toUpperCase()) || x.contains(pattern)) {
				res += x + "\n";
			}
		}
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String[] words = {"South Africa", "Afghanistan", "Sri Lanka", "New Zealand", "West Indies", "England", "India", "Australia", "Pakistan",
				"Bangladesh"};
		
		for(String x : words) {
			System.out.println(x);
		}
		
		System.out.println("enter the string pattern to searched");
		String pattern = sc.next();
		
		System.out.println("The words which contains pattern "+pattern+" : \n" +getWordsContainsPattern(words,pattern));


	}

}
