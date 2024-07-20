package com.streak.Day4;

import java.util.HashMap;
import java.util.Map;

public class LongestSubString {

	public static void main(String[] args) {

		String s = "abcdeabcbb";
		System.out.println(
				"Length  " + lengthOfLongestSubstring(s));
	}

	private static int lengthOfLongestSubstring(String s) {
		int maxLength = 0;

		int left = 0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		if (s == null || s.length() == 0) {
			return 0;
		}
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(map.containsKey(c))
			{
				left=Math.max(left, map.get(c)+1);
				
			}
			
			map.put(c, i);
			maxLength=Math.max(maxLength, i-left+1);
			
		}

		return maxLength;
	}

}
