package com.streak.Day3;

public class RemoveDuplicateString3 {

	public static void main(String[] args) {

		String str = "programming";
		
		char[] arr = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) 
		{
				boolean repeated = false;
				for (int j = i + 1; j < arr.length; j++) 
				{
					if (arr[i] == arr[j]) 
					{
						repeated = true;
						break;
					}
				}
				if(!repeated) 
				{
					sb.append(arr[i]); //p
				}
		}
		System.out.println(sb);
	}

}
