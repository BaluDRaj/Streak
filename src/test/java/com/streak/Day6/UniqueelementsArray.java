package com.streak.Day6;

public class UniqueelementsArray {

	public static void main(String[] args) {
		int[] array = { 1, 2, 2, 3, 4, 4, 5, 6, 7, 7, 8, 9, 10, 10 }; // length = 14

		System.out.println("Elements that appear exactly once in the array are:");
		for (int i = 0; i < array.length; i++) {
			boolean isUnique = true;

			for (int j = 0; j < array.length; j++) {
				if (i != j && array[i] == array[j]) {
					isUnique = false;
					break;
				}
			}

			if (isUnique) {
				System.out.print(array[i] + " ");
			}
		}
	}
}