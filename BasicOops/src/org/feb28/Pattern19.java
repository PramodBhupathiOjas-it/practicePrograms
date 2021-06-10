package org.feb28;

public class Pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 10;
		for(int i = 0;i<4;i++) {
			for(int j = 0 ; j<4;j++) {
				System.out.print(num+" ");
				num--;
			}
			System.out.println();
//			for(int k = i;k>=0;k++) {
//				System.out.print(" ");
//			}
		}
	}

}
