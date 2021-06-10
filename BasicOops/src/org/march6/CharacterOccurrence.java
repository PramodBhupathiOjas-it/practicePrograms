package org.march6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterOccurrence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Character,Integer> words = new HashMap<Character, Integer>();
		System.out.println("enter the name");
		String name= sc.next();
		char[] charName = name.toCharArray();
		for(char c : charName ) {
			if(words.containsKey(c)) {
				words.put(c, words.get(c)+1);
			}else {
				words.put(c, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry : words.entrySet()) {
			System.out.println(entry.getKey() + "  "+entry.getValue());
		}
	}

}
