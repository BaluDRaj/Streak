package com.streak.Day6;

public class MissingNumber {

	public static void main(String[] args) {

		// to find the missing number

		// Arrays should be in range
		// Arrays should not contain any duplicate elements
		int sum1 = 0;
		int sum2 = 0;

		int[] arr = { 1, 2, 3, 4, 6 };

		for (int i = 0; i < arr.length; i++) {

			sum1 = sum1 + arr[i];

		}
		for (int i = 1; i <= 6; i++) {

			sum2 = sum2 + i;

		}
		int sum3 = sum2 - sum1;
		System.out.println("Missing Number : " + sum3);
	}

}
