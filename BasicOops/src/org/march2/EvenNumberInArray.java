package org.march2;
import java.util.*;

public class EvenNumberInArray {
	
	static String getEvenNum(int arr[]) {
		String res = " ";
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				res += arr[i] + ",";
			}
		}
		return res.substring(0,res.length()-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size of the array:");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("enter the elements of the array");
		
		for(int i = 0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Even numbers in the Array : \n" + getEvenNum(arr));
				

	}

}
