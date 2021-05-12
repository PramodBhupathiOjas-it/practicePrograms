package org.feb28;

//5 5 5 5 5 
//4 4 4 4 4 
//3 3 3 3 3 
//2 2 2 2 2 
//1 1 1 1 1 

import java.util.Scanner;

public class Pattern3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the range");
		String res ="";
		int range = sc.nextInt();
		
		for(int rows = range; rows >=1 ; rows--) {
			for(int cols = 1 ;cols <=range ;cols++)
			{
				res += rows+" ";
			}
		      res += "\n";
		}
		System.out.println(res);
	}

}
