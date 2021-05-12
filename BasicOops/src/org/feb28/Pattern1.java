package org.feb28;

//1 1 1 1 1 

//2 2 2 2 2 
//3 3 3 3 3 
//4 4 4 4 4 
//5 5 5 5 5 

import java.util.*;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String res = "";
		System.out.println("enter the range");
		int range = sc.nextInt();

		for (int rows = 1; rows <= range; rows++) {
			for (int cols = 1; cols <= range; cols++) {
				res += rows + " ";
			}
			res += "\n";
		}
		System.out.println(res);

	}

}
