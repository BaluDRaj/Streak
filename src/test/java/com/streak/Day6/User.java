package com.streak.Day6;

public class User {

	int age;
	String name;

	public User(int a, String n) {
		age = a;
		name = n;
	}

	public User(String n) {
		name = n;
	}

	public static void main(String[] args)

	{
		User u1 = new User(20, "Ashok");
		System.out.println(u1.age);
		System.out.println(u1.name);

		User u2 = new User("Ashok");
		System.out.println(u2.age);
		System.out.println(u2.name);
	}

}
