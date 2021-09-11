package com.HierarchicalInheritance;

public class TestHierarchicalHonda {
	public static void main(String args[]) {
		Activa activa = new Activa();
		activa.quality();
		activa.startStop();
		
		HondaCity hondacity = new HondaCity();
		hondacity.quality();
		hondacity.display();
		hondacity.fullLED();
	}
	
}


