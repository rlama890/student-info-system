package com.techbook.controller;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.techbook.domain.Student;
import com.techbook.service.StudentService;
import com.techbook.service.StudentServiceImpl;

public class StudentController {

	private StudentService userService;

	public StudentController() {
		userService = new StudentServiceImpl();
	}

	public int saveUserInfo(Scanner input) {
		System.out.println("Enter username: ");
		String username = input.next();
		System.out.println("Enter rollno: ");
		String password = input.next();
		System.out.println("Enter email: ");
		String email = input.next();
		System.out.println("Enter address: ");
		String address = input.next();
		System.out.println("Enter mobile no: ");
		long mobileNo = input.nextLong();
		System.out.println("Enter dob: ");
		String dob = input.next();
		Date dateOfBirth = parseDate(dob);

		Student user = new Student();
		user.setUserName(username);
		user.setrollno(rollno);
		user.setEmail(email);
		user.setaddress(address);
		user.setMobileNo(mobileNo);
		user.setDob(dateOfBirth);

		return userService.saveUserInfo(user);

	}

	public Date parseDate(String dob) {
		Date dateOfBirth = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			dateOfBirth = sdf.parse(dob);
			return dateOfBirth;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return dateOfBirth;
	}
}
