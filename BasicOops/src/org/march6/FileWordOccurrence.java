package org.march6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FileWordOccurrence {

	public static void main(String[] args) {
		Map<String, Integer> wordCount = new HashMap<String, Integer>();
		try {
		File file = new File("D:\\file.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String [] words=null;
		String line = null;
		while((line = br.readLine())!=null) {
			words = line.split(" ");
		}
		
		for(String s : words) {
			if(wordCount.containsKey(s)) {
				wordCount.put(s, wordCount.get(s)+1);
			}else {
				wordCount.put(s,1 );
			}
		}
		
		for(Map.Entry<String, Integer> entry : wordCount.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		}catch(IOException f) {
			System.out.println(f);
		}
		
 	}

}
