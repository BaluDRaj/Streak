package com.streak.Day4;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,1,2,8,9,9,5};
		
		int length=removeDuplicate(arr);
		for(int i=0;i<length;i++)
		{
			System.out.println(arr[i]);
		}

	}

	private static int removeDuplicate(int[] arr) 
	{
		Set<Integer> s = new LinkedHashSet<Integer>();
		
		for(int a:arr)
		{
			s.add(a);
		}
		Iterator<Integer> it = s.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next());
		}
		
		
		return 0;
	}

	

	
}
