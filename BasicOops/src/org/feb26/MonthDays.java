package org.feb26;

import java.util.Scanner;

public class MonthDays {
	public static void main(String[] args) {
		String result = " ";
		String monthName;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first three letter of the month: ");
		monthName = sc.next();
		switch(monthName) {
		case "jan":
			result = monthName +" has 31 days ";
			break;
		case "feb":
			result = monthName +" has 28 days ";
			break;
		case "mar":
			result = monthName +" has 30 days ";
			break;
		case "apr":
			result = monthName +" has 31 days ";
			break;
		case "may":
			result = monthName +" has 30 days ";
			break;
		case "jun":
			result = monthName +" has 31 days ";
			break;
		case "jul":
			result = monthName +" has 30 days ";
			break;
		case "aug":
			result = monthName +" has 31 days ";
			break;
		case "sep":
			result = monthName +" has 30 days ";
			break;
		case "oct":
			result = monthName +" has 31 days ";
			break;
		case "nov":
			result = monthName +" has 30 days ";
			break;
		case "dec":
			result = monthName +" has 31 days ";
			break;
			default:
				System.out.println("enter the correct month name");
		}
		
		System.out.println(result);
			
	}

}
