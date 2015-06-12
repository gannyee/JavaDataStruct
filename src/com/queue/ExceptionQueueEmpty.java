package com.queue;

public class ExceptionQueueEmpty extends Exception {
	// Constructor
	public ExceptionQueueEmpty() {

	}

	// Constructor with parameters
	public ExceptionQueueEmpty(String mag) {
		System.out.println(mag);
	}
}
