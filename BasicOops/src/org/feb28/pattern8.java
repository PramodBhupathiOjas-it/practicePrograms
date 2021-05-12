package org.feb28;

//1 
//2 3 
//4 5 6 
//7 8 9 10 
//11 12 13 14 15 

import java.util.Scanner;

public class pattern8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the range");
		String res ="";
		int count=1;
		int range = sc.nextInt();
		
		for(int rows = 1; rows <= range ; rows++) {
			for(int cols = 1 ;cols <=rows ;cols++)
			{
				res +=count++  +" ";
			}
		      res += "\n";
		}
		System.out.println(res);
	}

}
