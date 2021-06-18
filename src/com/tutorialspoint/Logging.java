package com.tutorialspoint;

import org.aspectj.lang.ProceedingJoinPoint;

public class Logging {
	/**
	 * This is the method which I would like to execute before a selected method
	 * execution.
	 */
	public void beforeAdvice() {
		System.out.println("Before:   Going to setup student profile.");
	}

	/**
	 * This is the method which I would like to execute after a selected method
	 * execution.
	 */
	public void afterAdvice() {
		System.out.println("After:     Student profile has been setup.");
	}

	/**
	 * This is the method which I would like to execute when any method returns.
	 */
	public void afterReturningAdvice(Object retVal) {
		System.out.println("Returning:" + String.valueOf(retVal));
	}

	/**
	 * This is the method which I would like to execute if there is an exception
	 * raised.
	 */
	public void afterThrowingAdvice(IllegalArgumentException ex) {
		System.out.println("There has been an exception: " + ex.toString());
	}

	public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {


		System.out.println("aroundAdvice");

		return joinPoint.proceed();

	}
}