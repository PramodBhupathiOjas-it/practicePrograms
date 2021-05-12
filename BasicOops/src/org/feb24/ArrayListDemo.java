package org.feb24;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,8,9,1,3);
//		Stream<String> s = list.stream();
//		List<String> l = s.map(x -> x.toUpperCase()).collect(Collectors.toList());
//		l.forEach(x -> System.out.println(x));
		
		Collections.sort(list,Collections.reverseOrder());
		
		Set<Integer> set = new HashSet<Integer>();
		
		for (Integer x : list) {
			System.out.println(x);
		}
	}

}
