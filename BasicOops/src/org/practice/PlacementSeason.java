package org.practice;

import java.util.Scanner;

public class PlacementSeason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] psc = new int[N];

		for (int i = 0; i < N; i++) {
			psc[i] = sc.nextInt();
		}

		int[] result = getStudentPossiblity(psc);

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}

	}

	private static int[] getStudentPossiblity(int[] psc) {
		// TODO Auto-generated method stub
		int[] result = new int[psc.length];
		int count = 0;
		result[0] = 0;
		for (int i = 1; i < psc.length; i++) {
			count = 0;
			for (int j = 0; j < i; j++) {
				if (psc[i] < psc[j]) {
					count++;
				}
				result[i] = count;
			}
		}
		return result;
	}

}
