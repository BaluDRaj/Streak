package com.streak.Day4;

import java.util.Scanner;

public class PalindromeInt {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number  : ");

		int str = sc.nextInt();
		int input_str = str;
		int rev = 0;
		while (str != 0) {
			rev = rev * 10 + str % 10;
			str = str / 10;

		}
		if (input_str == rev) {
			System.out.println("palindrome number");
		} else
			System.out.println("Not a palindrome number");
	}

}
