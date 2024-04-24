
package com.streak.Day1;

import java.util.Scanner;

public class Scanner1 {

	
	public static void input() {
		int a;
		float b;
		String s;
		String s1;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string : ");
		s = in.nextLine();
		System.out.println("Enter a int : ");
		a = in.nextInt();
		System.out.println("Enter another String : ");
		s1 = in.nextLine();

	}

	public static void main(String args[]) {
		input();
	}

}
