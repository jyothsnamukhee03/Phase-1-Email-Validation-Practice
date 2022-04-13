package com.simplilearn.EmailValidation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
	static Scanner scan = new Scanner(System.in);
	int no_of_emails;
	static List<String> email = new ArrayList<String>();
	public static void main(String[] args) {
		Validator validator  =  new EmailValidator();
		Client client = new Client();

			client.setEmailCount();
			int emailCount = client.getEmailCount();
			client.setEmails();
			
			System.out.println("Enter useremail to search: ");
			String useremail = scan.next();

			boolean flag = true;
			
			for(int i = 0 ; i < emailCount ; i++) {
				try {
					
					if(validator.isPresent(email.get(i), useremail))
					{
						System.out.println(email.get(i)+" is present in the employees email list");
						if(validator.isValid(email.get(i)))
							System.out.println(email.get(i)+" is a valid Email Address");
					
						else 
							throw new Exception(email.get(i)+" is not a valid Email Address");
					}
					else
						flag = false;
					
				}
				catch(Exception e) {
					System.out.println(e);
					continue;
				}
			}
			if(flag) {
				System.out.println(useremail+" is not present in the employees email list");
			}
	}

	private void setEmails() {
		System.out.println("Enter "+ no_of_emails +" mail id's in a new line");
		for(int i = 0 ; i < no_of_emails ; i++) {	
				email.add(scan.next());		
		}
	}

	private void setEmailCount() {
		System.out.println("****************************");
		System.out.println("                     ==========Email Validation==========");
		System.out.println("                            Developed By MUKEE JYOSTHNA");
		System.out.println("******************************");
		System.out.println("How many employee email id's do you want to enter? ");
		no_of_emails = scan.nextInt();
	}

	private int getEmailCount() {
		return no_of_emails;
	}


}