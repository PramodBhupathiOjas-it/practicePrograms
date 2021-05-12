package org.feb28;

//1 
//2 3 
//3 4 5 
//4 5 6 7 
//5 6 7 8 9 

import java.util.Scanner;

public class Pattern7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String res = "";
		System.out.println("enter the range");
		int range = sc.nextInt();
		
		for(int rows = 1; rows <=range; rows++) {
			for(int cols =1;cols <=rows;cols++)
			{
				res += (rows+cols-1)+" ";
			}
			  res += "\n";
		}
		System.out.println(res);
	}

}
