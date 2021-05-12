package org.feb24;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class VectorDemo1 {
	
	public Vector<Integer> displayEvenNum(int startno,int endno ){
		Vector<Integer> v = new Vector<Integer>();
		
		for(int i = startno; i< endno;i++) {
			if(i % 2 == 0 ) {
				v.add(i);
			}
		}
		
		return v;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers");
		int s = sc.nextInt();
		int e = sc.nextInt();
		VectorDemo1 obj = new VectorDemo1();
		
		Vector<Integer> v = obj.displayEvenNum(s, e);
		
		Enumeration<Integer> e1 = v.elements();
		while(e1.hasMoreElements()) {
			System.out.println(e1.nextElement());
		}
		
	}

}
