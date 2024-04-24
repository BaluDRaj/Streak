package com.streak.Day4;

import java.util.HashMap;
import java.util.Map;

public class CountOccurenceString {

	public static void main(String[] args) {

		String str = "programming";

		Map<Character, Integer> charMapCount = new HashMap<>();

		for (Character c : str.toCharArray()) {
			if (charMapCount.containsKey(c)) {
				charMapCount.put(c, charMapCount.get(c) + 1);
			}else 
			{
				charMapCount.put(c, 1);
			}
		}
		System.out.println(charMapCount);
	}

}
