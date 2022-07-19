package com.techbook.test;

import java.util.Scanner;

import com.techbook.controller.StudentController;


public class StudentTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter db operation: ");
		String option = input.next();
		StudentController controller = new StudentController();

		switch (option) {
		case "save":
			int saved = controller.saveUserInfo(input);
			if(saved >= 1) {
				System.out.println("user info is inserted successfully in db.");
			}else {
				System.out.println("oops!! Error in DB.");
			}
			break;
		case "update":

		default:
			System.out.println("wrong selection!!!");
			break;

		}

	}

}
