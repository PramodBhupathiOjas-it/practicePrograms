package org.march2;

import java.util.Scanner;

public class QueueDemo {
	
	static int top = -1;
	static int size = 5;
	static int queue[] = new int[size];
	
	
	static void menu() {
		String m = "Menu Driven Application\n";
		m += "1.push\n";
		m += "2.pop\n";
		m += "3.Diplay elements\n";
		m += "4.exit\n";
		m += "Select any option\n";
		System.out.println(m);
	}
	
	static boolean isFull() {
		boolean b = false;
		if(top == size-1) {
			b = true;
			
		}
		return b;
	}
	static boolean isEmpty() {
		boolean b = false;
		if(top == 0) {
			b = true;
		}
		return b;
	}
	
	static void push(int element) {
		if(!isFull()) {
			queue[++top] = element;
			System.out.println("Added element to stack");
		}
		else {
			System.out.println("stack is full");
		}
	}
	
	static void pop() {
		if(!isEmpty()) {
			System.out.println("Deleted element is =" +queue[top]);
			top--;
		}
		else {
			System.out.println("stackis empty");
		}
	}
	
	static void display() {
		if(!isEmpty()) {
			System.out.println("stack elements are as follows");
			for(int i=0; i<=top;i++) {
				System.out.println(queue[i]);
			}
		}
		else {
			System.out.println("no elements in stack");
			
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			menu();
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("enter thr values");
				push(sc.nextInt());
				break;
			case 2:
				pop();
				break;
			case 3:
				display();
				break;
			case 4:
				System.exit(0);
				break;
		    default:
		    	System.out.println("Invalid Option");
			}//switch closing
		}//while closing 
	}// method closing


}
