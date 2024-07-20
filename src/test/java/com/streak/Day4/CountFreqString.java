package com.streak.Day4;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountFreqString {
	int value1;

	public static void main(String[] args) {

		String s = "hello hello hello how are  you you";

		Map<String, Integer> freqCountString = freqString(s);
		Set<Entry<String, Integer>> entrySet = freqCountString.entrySet();
		for(Entry<String, Integer> entry:entrySet)
		{
			System.out.println(entry.getKey() + "..." + entry.getValue());
		}

	}

	private static Map<String, Integer> freqString(String s) {

		String[] s1 = s.split("\\s+");
		int value = 0;
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < s1.length; i++) {
			if (map.containsKey(s1[i])) {
				map.put(s1[i], map.get(s1[i]) + 1);
			} else {
				map.put(s1[i], value + 1);
			}

		}
		return map;

	}

}
