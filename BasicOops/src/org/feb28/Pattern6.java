package org.feb28;


//1 1 1 1 1 
//2 2 2 2 
//3 3 3 
//4 4 
//5 

import java.util.Scanner;

public class Pattern6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the range");
		String res ="";
		int range = sc.nextInt();
		
		for(int rows = 1; rows <=range ; rows++) {
			for(int cols = range ;cols >=rows ;cols--)
			{
				res += rows+" ";
			}
		      res += "\n";
		}
		System.out.println(res);
	}

}
