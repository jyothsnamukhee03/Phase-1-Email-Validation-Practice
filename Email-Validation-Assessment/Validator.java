package com.simplilearn.EmailValidation;



public interface Validator {
	
	boolean isValid(String email);

	boolean isPresent(String email, String useremail);

}