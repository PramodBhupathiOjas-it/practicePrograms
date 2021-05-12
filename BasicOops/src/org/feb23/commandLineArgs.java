package org.feb23;

public class commandLineArgs {
	public static void main(String args[]) {
		int a =Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = a+b;
		System.out.println("sum of integer numbers " +a +" and " + b +" = "+c);
		float d = Float.parseFloat(args[2]);
		float e = Float.parseFloat(args[3]);
		float f = d+e;
		System.out.println("sum of float numbers " +d +" and " +e +" = "+f);
	}

}
