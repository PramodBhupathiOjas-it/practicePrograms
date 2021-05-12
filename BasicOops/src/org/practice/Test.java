package org.practice;

import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> sh = new HashSet<>();
		sh.add("c");
		sh.add("d");
		System.out.println(sh.add("d"));
		System.out.println(sh.add("c"));
		System.out.println(sh);

	}

}
