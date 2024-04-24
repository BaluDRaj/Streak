package com.streak.Day2;
//using charArray
public class ReverseString1 {

	public static void main(String[] args) {
		String str = "hello";
		int length = str.length();
		char[] arr = str.toCharArray();
		
		
		for(int i = arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]);
		}
	}

}
