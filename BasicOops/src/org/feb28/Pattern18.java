package org.feb28;

import java.util.Scanner;

public class Pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String res = "";
		System.out.println("enter the range");
		int range = sc.nextInt();
		res += 2+ " ";
		for(int rows = 1; rows <=range; rows++) {
			for(int cols =1;cols <=rows;cols++)
			{
				res +=rows+2 +" ";
			}
			  res += "\n";
		}
		System.out.println(res);

	}

}
