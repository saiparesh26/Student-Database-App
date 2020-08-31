package com.saiparesh.studentdatabaseapp;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		//Ask how many students will be added
		
		System.out.println("Enter number of students to be involved : ");
		Scanner in = new Scanner(System.in);
		
		//Create n number of students
		
		int numberOfStudents = in.nextInt();
		Student[] students = new Student[numberOfStudents];
		
		for (int i = 0; i < numberOfStudents; i++) {
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
			students[i].showInfo();
		}
		
//		Student s1 = new Student();
//		s1.enroll();
//		s1.payTuition();
//		s1.showInfo();
		
	}

}
