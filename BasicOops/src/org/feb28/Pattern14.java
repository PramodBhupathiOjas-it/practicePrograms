package org.feb28;


//1 1 1 1 1 
//0 0 0 0 0 
//1 1 1 1 1 
//0 0 0 0 0 
//1 1 1 1 1 


import java.util.Scanner;

public class Pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String res = "";
		System.out.println("enter the range");
		int range = sc.nextInt();
		
		for(int rows = 1; rows <=range; rows++) {
			for(int cols =1;cols <=range;cols++)
			{
				if(rows % 2 !=0) {
					res += 1 +" ";
				}
				else {
					res += 0 +" ";
				}
			}
			  res += "\n";
		}
		System.out.println(res);

	}

}
