package com.saiparesh.studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstname;
	private String lastName;
	private int gradeYear;
	private String studentId;
	private String courses = "";
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	//constructor: prompt user to enter student's name and year
	
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Student's First name : ");
		this.firstname = in.nextLine();
		
		System.out.print("Enter Student's Last name : ");
		this.lastName = in.nextLine();
		
		System.out.print("1 - Freshmen\n2 - Sophomore\n3 - Junior \n4 Senior\nEnter class level : ");
		this.gradeYear = in.nextInt();
		
		setStudentId();
		
		
	}
	
	// Generate an id
	private void setStudentId() {
		// Grade level + static id		
		this.studentId =  gradeYear + "" + id; 
		id++;
	}
	
	// Enroll in courses
	public void enroll() {
		// Get inside loop, user hits zero
		
		do {			
			System.out.print("Enter course to enroll (Q/q to quit) : ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if(!course.equals("Q") && !course.equals("q")) {
				courses = courses + "\n   " + course;
				tuitionBalance += costOfCourse;
			}
			else {
				break;
			}
			
		} while (1 != 0);

	}
	// View balance 
	public void viewBalance() {
		System.out.println("Your balance is : " + tuitionBalance);
	}
	
	// Pay tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter amount you want to pay : ");
		Scanner in = new Scanner(System.in);
		int amount = in.nextInt();
		tuitionBalance -= amount;
		System.out.println("Thank you for your payment of : " + amount);
		viewBalance();
	}
	
	// Show status
	public void showInfo() {
		System.out.println("Name: " + firstname + lastName + 
				"\nGrade Level: " +  gradeYear +
				"\nStudent ID : " + studentId +
				"\nCourses: " + courses +
				"\nBalance: "+ tuitionBalance);
	}
}
