package com.streak.Day4;

public class ReverseWordString1 {

	public static void main(String[] args) {
		String input = "java code";
		System.out.println("input String :" + input);
		String[] words = input.split(" ");
		
		String output = "";
		
		for (String word : words) {
			String revWord = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				
				revWord = revWord + word.charAt(i);
			}
			output = output + revWord + " ";
			
		}
		System.out.println("output String :" + output);
		
	}

}
