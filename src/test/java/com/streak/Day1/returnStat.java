package com.streak.Day1;

import java.util.Scanner;

public class returnStat {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first character : " );
		char c =sc.next().charAt(0);
		System.out.println(c);
		int numbers = multiNumbers(c);
	}

	public static int multiNumbers(int a){
		int ans=a*7;
		return ans;
		
	}
}
