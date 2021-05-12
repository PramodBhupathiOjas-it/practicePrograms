package org.feb26;

import java.util.Scanner;

public class ResultsOfStudent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the marks of the student");
		int english = sc.nextInt();
		int hindi = sc.nextInt();
		int maths = sc.nextInt();
		int science = sc.nextInt();
		int social = sc.nextInt();
		int total = 0;
		float average = 0;
		String result = " ";
		
		if(english > 40 && hindi > 40 && maths > 40 && science > 40 && social > 40) {
			total = english + hindi + maths + science + social;
			average = total/5;
		}
		else {
			System.out.println("Failed");
		}
		
		
		if(average >= 90) {
			result += "total = " +total +"\n Average = "+ average +"\n Grade is O";
					
		}
		if(average >= 80 && average < 90) {
			result += "total = " +total +"\n Average = "+ average +"\n Grade is A";
					
		}
		if(average >= 70 && average < 80) {
			result += "total = " +total +"\n Average = "+ average +"\n Grade is B";
					
		}
		if(average >= 60 && average < 70) {
			result += "total = " +total +"\n Average = "+ average +"\n Grade is C";
					
		}
		if(average >=50 && average < 60) {
			result += "total = " +total +"\n Average = "+ average +"\n Grade is D";
					
		}
		
		System.out.println("The result of the Student : \n"+result);
	}

}
