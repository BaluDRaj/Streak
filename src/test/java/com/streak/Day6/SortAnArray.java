package com.streak.Day6;

import java.util.Arrays;

public class SortAnArray {

	public static void main(String[] args) {

		int[] a = { 4, 18, 2, 1 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = temp;
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
