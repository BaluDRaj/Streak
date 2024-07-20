package com.streak.Strings;

public class ReverseAString {

	public static void main(String[] args) {

		String s = "balu";
		
		reverse(s);
	}

	private static void reverse(String s) {
		// Approach1
		char[] c = s.toCharArray();
		for (int i = c.length - 1; i >= 0; i--) {
			System.out.print(c[i]);
		}
		System.out.println("");
		// Approach2
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println("");
		// Approach3
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());

		// Approach4
		StringBuilder st = new StringBuilder(s);
		System.out.println(st.reverse());
	}
}
