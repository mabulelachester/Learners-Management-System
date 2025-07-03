package com.mabulela.learners.management.system.exception;

public class LearnerNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public LearnerNotFoundException() {
		super();
		
	}
	
	
	public LearnerNotFoundException(String message) {
		super(message);
	}
	
	

}
