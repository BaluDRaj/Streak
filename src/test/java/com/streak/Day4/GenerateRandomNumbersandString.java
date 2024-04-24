package com.streak.Day4;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomNumbersandString {

	public static void main(String[] args) {
		// Approach 1
		Random rand = new Random();
		int rand_int = rand.nextInt(10000); // will generate random int between 0 and 9999
		System.out.println(rand_int);

		double rand_double = rand.nextDouble(5);
		System.out.println(rand_double);
		// approach2
		System.out.println(Math.random());

		// approach 3
		String rand1 = RandomStringUtils.randomNumeric(5);
		System.out.println(rand1);
		
		String rand2= RandomStringUtils.randomAlphabetic(5);
		System.out.println(rand2);
	}

}
