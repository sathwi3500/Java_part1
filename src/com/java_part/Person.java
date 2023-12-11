/*
 * Assignment 1: Basic Class Creation
Create a class named Person with the following attributes:
name (String)
age (int)
gender (char)
Include a method named displayDetails() that prints the person's details.
 Instantiate objects of this class and demonstrate the usage in your main program.
 */


package com.java_part;

public class Person {
	String name;
	int age;
	char gender;

	public Person(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	void displayDetails()
	{
		System.out.println("name :"+name);
		System.out.println("age :"+age);
		System.out.println("gender :"+gender);
	}

	public static void main(String[] args) {
		Person obj1=new Person("Sathwik",23,'M');
		obj1.displayDetails();

	}

}
