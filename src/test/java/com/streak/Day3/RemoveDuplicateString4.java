package com.streak.Day3;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateString4 {

	public static void main(String[] args) {

		String str = "programminggggggg";

		StringBuilder sb1 = new StringBuilder(); // output variable

		Set<Character> set = new LinkedHashSet();
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}
		for (Character c : set) {
			sb1.append(c);
		}
		System.out.println(sb1);
	}

}
