package com.streak.Day4;

public class AdjacentAray {

	public static void main(String[] args) {
		// Max difference between any adjacent index in array
		int[] a = { 1, 4, 8, 15, 7 };
		int sub = 0;
		for (int i = 0; i < a.length - 1; i++) {
			int diff=Math.abs(a[i + 1] - a[i]);
		
			if (diff>sub ){
				sub =diff;

			}
		}
		System.out.println(sub);
	}

}
