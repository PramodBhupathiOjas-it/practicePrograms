package org.feb28;

//*  *  *  *  * 
//*  *  *  *  * 
//*  *  *  *  * 
//*  *  *  *  * 
//*  *  *  *  * 



import java.util.Scanner;

public class Pattern10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String res = "";
		System.out.println("enter the range");
		int range = sc.nextInt();
		
		for(int rows = 1; rows <=range; rows++) {
			for(int cols =1;cols <=range;cols++)
			{
				res += " * ";
			}
			  res += "\n";
		}
		System.out.println(res);
	}

}
