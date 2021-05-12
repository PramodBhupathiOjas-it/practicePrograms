package org.march2;

import java.util.Scanner;

public class TwoD_Arrays {
	
	//Menu method
	static void menu() {
		String res = "Menu Driven Application for 2D Arrays\n";
		res += "1.Addition.\n";
		res += "2.Subtraction.\n";
		res += "3.Multiplication.\n";
		res += "4.exit.\n";
		res += "Select any Option.\n";
		
		System.out.println(res);
				
		}
	
	//Addition method
	static int[][] add(int[][] a,int[][] b,int row1,int col1,int row2,int col2){
		int[][] c = new int[row1][col2];
		if(row1 == row2 && col1 == col2) {
		for(int i = 0; i < row1; i++) {
			for(int j = 0; j < col1; j++) {
				c[i][j] = a[i][j] + b[i][j] ;
			}
		}
		return c;
		}else {
			//System.out.println("enter the correct size of the arrays");
			return null;
		}
		
		
	}
	
	
	static int[][] sub(int[][] a,int[][] b,int row1,int col1,int row2,int col2){
		int[][] c = new int[row1][col1];
		
		if(row1 == row2 && col1 == col2) {
		for(int i = 0; i < row1; i++) {
			for(int j = 0; j < col1; j++) {
				c[i][j] = a[i][j] - b [i][j] ;
			}
		}
		return c;
	  }else {
		 // System.out.println("enter the correct size of the arrays");
		   return null;
	  }
		
	}
	
	static int[][] multiply(int [][]a,int b[][], int row1, int col1,int row2,int col2){
		int c[][] = new int[row1][col2];
		
		if(col1 == row2) {
			for(int i = 0; i < row1 ;i++) {
				for(int j =0; j < col2; j++) {
					c[i][j] = 0;
					for(int k = 0;k < row2 ;k++) {
						c[i][j] += a[i][k]*b[k][j];
					}
				}
			}
		}
		
		
		return c;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size of  first Matrix");
		
		int row1 = sc.nextInt();
		int col1 = sc.nextInt();
		
		int a[][] = new int[row1][col1];
		
		
		System.out.println("enter the elements in first array");
		for(int i = 0; i < row1; i++) {
			for(int j = 0; j < col1; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
       System.out.println("enter the size of second Matrix");
		
		 int row2 = sc.nextInt();
		 int col2 = sc.nextInt();
		
		
		int b[][] = new int[row2][col2];
		
		
		System.out.println("enter the elements in second array");
		for(int i = 0; i < row2; i++) {
			for(int j = 0; j < col2; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		
		int result[][] = new int[row1][col1];
		
		while(true) {
			menu();
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				result = add(a,b,row1,col1,row2,col2);
				break;
			case 2:
				result = sub(a,b,row1,col1,row2,col2);
				break;
			case 3:
				result = multiply(a,b,row1,col1,row2,col2);
				break;
			case 4:
				System.exit(0);
				break;
				
			}
			
			if(result != null) {
			for(int i = 0; i < result.length; i++) {
				for(int j = 0; j < result[i].length; j++) {
					System.out.print(result[i][j] + " ");
				}
				
				System.out.println();
			}
		}else {
			System.out.println("enter the correct size of the arrays");
		}
		}
		
		

	}

}
