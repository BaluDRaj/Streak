package com.streak.Day4;

public class SumArray {
//create a method which accepts Array and returns sum of all the elements in array

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int sum = sumOfArray(a);
		System.out.println(sum);
		int result = multiply(5, 5);
		System.out.println(result);
	}

	private static int sumOfArray(int[] a) {

		int sum = 0;

		for (int i = 0; i <= a.length - 1; i++) {
			sum = sum + a[i];
		}

		return sum;
	}

	private static int multiply(int a, int b) {

		int result = 0;

		for (int i = 0; i < b; i++) {
			result = result + a;
		}

		return result;
	}
}
