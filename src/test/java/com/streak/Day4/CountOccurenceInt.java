package com.streak.Day4;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountOccurenceInt {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 1, 4, 2, 1, 3, 3 };

		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		
		

//		for (int ar : arr) {
//			if (map.containsKey(ar)) {
//				map.put(ar, map.get(ar) + 1);
//			} else {
//				map.put(ar, 1);
//			}
//			
//			
//		}
		for(int ar:arr)
		{
			map.put(ar, map.getOrDefault(ar, 0)+1);
		}
		System.out.println(map);
	}

}
