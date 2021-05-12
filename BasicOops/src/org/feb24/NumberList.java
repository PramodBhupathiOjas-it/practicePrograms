package org.feb24;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NumberList {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<String>();
		
		while(sc.hasNextInt()) {
			
			list.add(sc.next());
		}
		List<Integer> result = new ArrayList<Integer>();
		result = getNumberList(list);
		System.out.println(result);
	}

	private static List<Integer> getNumberList(List<String> list) {
		// TODO Auto-generated method stub
		List<Integer> intList = list.stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList());
		int min,max;
		min=max=intList.get(0);
		for(int i=0;i<intList.size();i++) {
			if(max<intList.get(i)) {
				max = intList.get(i);
			}
			if(min>intList.get(i)) {
				min = intList.get(i);
			}
		}
		List<Integer> result = new ArrayList<Integer>();
		
		for(int i=min;i<=max;i++) {
			result.add(i);
		}
		
		return result;
	}
}
