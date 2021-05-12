package org.feb28;

//A 
//B C 
//D E F 
//G H I J 
//K L M N O 

import java.util.Scanner;

public class Pattern9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch=65;
		System.out.println("enter the range");
		int range = sc.nextInt();
		
		for(int rows = 1; rows <=range; rows++) {
			for(int cols =1;cols <=rows;cols++)
			{
				System.out.print(ch++ +" ");
			}
			  System.out.print( "\n");
		}
		

	}

}
