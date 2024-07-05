package com.streak.Strings;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String str = "programming";
		// Approach1
		StringBuilder sb1 = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int idx = str.indexOf(ch, i + 1);
			if (idx == -1) {
				sb1.append(ch);
			}
		}
		System.out.println(sb1);

		// Approach2
		char[] arr = str.toCharArray();
		StringBuilder sb2 = new StringBuilder();

		for (int i = 0; i < arr.length; i++) {
			boolean repeated = false;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					repeated = true;
					break;
				}
			}
			if (!repeated) {
				sb2.append(arr[i]);
			}
		}
		System.out.println(sb2);

		// approach3
		char[] chars = str.toCharArray();
		Set<Character> charSet = new HashSet<>();
		//storing in Set to remove duplicates 
		for (char c : chars) {
			charSet.add(c);
		}

		for (char element : charSet) {
			System.out.print(element);
		}
		/*
		 * StringBuilder sb3 = new StringBuilder();
		 * 
		 * for (char c : charSet) { sb3.append(c); }
		 * 
		 * sb3.toString(); System.out.println(sb3);
		 */
	}
}
