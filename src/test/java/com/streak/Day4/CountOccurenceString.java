package com.streak.Day4;

import java.util.HashMap;
import java.util.Map;

public class CountOccurenceString {

	public static void main(String[] args) {

		String str = "programming";

		Map<Character, Integer> map = new HashMap<>();
		

		for (Character c : str.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			}else 
			{
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}

}
