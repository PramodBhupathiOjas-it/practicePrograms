package org.feb28;

//11111
//1   1
//1   1
//1   1
//11111

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String res = "";
		System.out.println("enter the range");
		int range = sc.nextInt();
		
		for(int rows = 1; rows <=range; rows++) {
			for(int cols =1;cols <=range;cols++)
			{
				if(rows == 1 || rows == range || cols == 1 || cols == range) {
				  res += "1";
				}
				else {
					res += " ";
				}
			}
			  res += "\n";
		}
		System.out.println(res);

	}

}
