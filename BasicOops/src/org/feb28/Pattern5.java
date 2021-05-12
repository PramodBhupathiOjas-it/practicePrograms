package org.feb28;


//1 2 3 4 5 
//1 2 3 4 
//1 2 3 
//1 2 
//1 

import java.util.Scanner;

public class Pattern5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the range");
		String res ="";
		int range = sc.nextInt();
		
		for(int rows = range; rows >=1 ; rows--) {
			for(int cols = 1 ;cols <=rows ;cols++)
			{
				res += cols+" ";
			}
		      res += "\n";
		}
		System.out.println(res);
	}

}
