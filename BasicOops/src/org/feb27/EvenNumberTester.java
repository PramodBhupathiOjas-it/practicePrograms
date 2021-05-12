package org.feb27;

public class EvenNumberTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int startValue = Integer.parseInt(args[0]);
		int endValue = Integer.parseInt(args[1]);
		String res = "Even number between "+startValue+" and "+endValue+"\n";
		
		for(int i = startValue;i<=endValue;i++) {
			if(i%2==0) {
				res += i + ",";
			}
		}
		System.out.println(res.substring(0,res.length()-1));
		

	}

}
