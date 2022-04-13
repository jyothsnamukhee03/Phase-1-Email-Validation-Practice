package com.simplilearn.EmailValidation;

import java.util.regex.Pattern;

public class EmailValidator implements Validator {
	public final static String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
	@Override
	public boolean isValid(String email) {
		 Pattern pat = Pattern.compile(emailRegex); 
	        if (email == null) 
	            return false; 
	        return pat.matcher(email).matches(); 	
	}
	@Override
	public boolean isPresent(String email, String useremail) {
		if(useremail.matches(email)) {
			return true;
		}
		return false;
	}
}