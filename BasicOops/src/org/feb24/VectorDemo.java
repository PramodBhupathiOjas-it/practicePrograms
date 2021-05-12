package org.feb24;

import java.util.Vector;


public class VectorDemo {
	
	public static void displayEvenNumVector(Vector<Integer> v) {
		for( Integer x : v){
			if(x % 2 ==0) {
				System.out.println(x);
			}
			
		}
		}

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(11);
		v.add(14);
		v.add(12);
		v.add(10);
		v.add(13);
		
		displayEvenNumVector(v);
	}
	
	

}
