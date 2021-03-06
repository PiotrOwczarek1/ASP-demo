package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		Student student = (Student) context.getBean("student");
		student.getName();
		student.getAge();

		System.out.println("a1");
		try {
			student.printThrowException();
		} catch (Throwable e) {
			System.out.println("Inside catch");
		}
	}
}