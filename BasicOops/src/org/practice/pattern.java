package org.practice;

import java.util.Scanner;

public class pattern {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		for(int i=0;i<num;i++) {
			for(int j=num;j>0;j--) {
				System.out.print(j +" ");
			}
			System.out.println();
		}
		
	}

}
