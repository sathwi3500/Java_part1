/*
 * Assignment 3: Student Management System
Build a Student class with attributes like:
rollNumber (int)
name (String)
marks (array or list of integers for different subjects)
Include methods to calculate the average marks and display student details. 
Create  array Student objects and perform operations like finding the student with the highest average marks.
 */

package com.java_part;

import java.util.Scanner;

public class Student {
	int rollNumber;
	String name;
	int[] marks;
	

	public Student(int rollNumber, String name, int[] marks) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.marks = marks;
	}
void desplayStudentDetails()
{
	System.out.print("name: "+name+" Roll number: "+rollNumber+" List of Marks: ");
	for(int mark: marks)
	    System.out.print(mark+" ");
	System.out.print(" Average marks: "+averageMarks());
	System.out.println();
}
double averageMarks()
{
	int sum=0;
	for(int mark: marks)
		sum=sum+mark;
	//System.out.println("Average Marks: "+sum/marks.length);
	return sum/marks.length;
}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number of students: ");
		int numOfStudents=sc.nextInt();
		Student list[]=new Student[numOfStudents];
		
		System.out.println("Enter Student details and marks");
		  for(int i=0;i<list.length;i++)  
		  {
			  System.out.print("Enter Roll Number of Student: ");
			  int rollnumber=sc.nextInt();
			  System.out.print("Enter Name of student: ");
			  String name=sc.next();
			  int[] marks=new int[3];
			  System.out.print("Enter marks of subject1 : ");
			  marks[0]=sc.nextInt();
			  System.out.print("Enter marks of subject2 : ");
			  marks[1]=sc.nextInt();
			  System.out.print("Enter marks of subject3 : ");
			  marks[2]=sc.nextInt();
			  list[i]=new Student(rollnumber,name,marks);
		  }
         System.out.println();
         System.out.println("List of Student details");
         for(Student s:list)
         {
        	 s.desplayStudentDetails();
        	 System.out.println("-------------------------------------------------");
         }
         
         System.out.println();
         System.out.println("Student with Highest average marks");
         Student obj=list[0];
         for(int i=0;i<list.length-1;i++)
         {
        	 if(list[i].averageMarks()<list[i+1].averageMarks())
        		 obj=list[i+1];
         }
         obj.desplayStudentDetails();
         sc.close();
	}
	

}
