package com.streak.Day2;

public class ReverseString2 {
//using charAt
	public static void main(String[] args) {
		String str = "hello";
		int l = str.length();
		for(int i=l-1; i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
		
	}

}
