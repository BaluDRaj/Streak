package com.streak.Day4;

import java.util.Arrays;

public class Solution {

	public static int[] twoSum(int[] nums, int target) {

		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] {};

	}

	public static void main(String[] args) {
	int[] result=twoSum(new int[] { 2, 7, 3 }, 9);
	System.out.println(Arrays.toString(result));
	}
}
