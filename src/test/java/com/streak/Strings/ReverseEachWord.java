package com.streak.Strings;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ReverseEachWord {
	String s;

	public static void main(String[] args) {

		// reverseEachWord("Java Programming");
		System.out.println(reverseEachWord("Hello How Are you "));
		System.out.println(reverseEachWord1("java prog"));

	}

	public static String reverseEachWord(String s) {

		String[] words = s.split(" ");
		String result = "";
		for (int i = 0; i < words.length; i++) {
			StringBuilder sb = new StringBuilder(words[i]);
			result += sb.reverse().toString() + " ";
		}
		return result;
	}

	public static String reverseEachWord1(String s) {
		String result = "";
		String[] words = s.split(" ");
		for (int i = 0; i < words.length; i++) {
			char[] c = words[i].toCharArray();

			for (int j = c.length - 1; j >= 0; j--) {
				result = result + c[j];

			}
			if (i < words.length - 1) {
				result = result + " ";

			}
		}
		return result;
	}
}
