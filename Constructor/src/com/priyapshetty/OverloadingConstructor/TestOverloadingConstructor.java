package com.priyapshetty.OverloadingConstructor;

public class TestOverloadingConstructor {

	public static void main(String[] args) {
    Bank bank =new Bank("canara","shimoga","shimoga Gopala",8105870071l);
		
		System.out.println(bank.name);
	    System.out.println(bank.location);
		System.out.println(bank.branch);
		System.out.println(bank.phoneNumber);
		
	}

	}


