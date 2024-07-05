package com.streak.Day6;

public class DUplicateElementsArray {

	public static void main(String[] args) {

		int[] arr = { 4, 2, 3, 2, 1, 4, 5 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}

	}

}
