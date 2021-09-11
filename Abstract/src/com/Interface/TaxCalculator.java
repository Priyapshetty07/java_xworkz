package com.Interface;

public class TaxCalculator implements CenteralTax, StateTax {
	public void propertyTax()
	{
		System.out.println("propertyTax of state");
	}
	
	public void roodTax()
	{
		System.out.println("roodTax central");
	}

}
