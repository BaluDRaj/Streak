package com.streak.Day6;

import java.util.Arrays;

public class MergeArrays {

	public static void main(String[] args) {

		int[] a = { 3, 4, 5 ,78}; //3

		int[] b = { 6, 7, 8 }; // 3

		int[] c = new int[a.length + b.length]; //6

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i]; // 3 4 5 0 0 0
		}

		for (int i = 0; i < b.length; i++) {
			c[i + a.length] = b[i]; // 3 4 5 6 7 8 
		}

		System.out.println(Arrays.toString(c));

	}

}
