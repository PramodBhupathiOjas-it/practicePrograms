package org.feb28;

//5 4 3 2 1 
//5 4 3 2 1 
//5 4 3 2 1 
//5 4 3 2 1 
//5 4 3 2 1 

import java.util.Scanner;

public class Pattern2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String res ="";
		System.out.println("enter the range");
		int range = sc.nextInt();
		
		for(int rows = 1; rows <=range; rows++) {
			for(int cols = range;cols >=1;cols--)
			{
				res += cols+" ";
			}
			 res += "\n";
		}
		System.out.println(res);
	}

}
