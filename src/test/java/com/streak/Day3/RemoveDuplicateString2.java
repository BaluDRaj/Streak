package com.streak.Day3;

public class RemoveDuplicateString2 {

	public static void main(String[] args) {
		String str = "programming";

		StringBuilder sb1 = new StringBuilder(); //output variable

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);  //traversing through each character
			int idx = str.indexOf(ch, i + 1); //comparing each character to next index values 
			if (idx == -1) {
				sb1.append(ch); //if -1 , append to output variable

			}

		}
		System.out.println(sb1); //print output variable 
	}

}
