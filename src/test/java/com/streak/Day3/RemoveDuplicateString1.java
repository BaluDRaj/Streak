package com.streak.Day3;

public class RemoveDuplicateString1 {
//approach1
	//using lambda expression
	public static void main(String[] args) {
		String str = "programming";
		
		StringBuilder sb1 = new StringBuilder();
		str.chars().distinct().forEach(c-> sb1.append((char)c));
		System.out.println(sb1);

	}

}
