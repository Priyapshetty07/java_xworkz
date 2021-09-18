package com.ReferenceOrNoPrimitiviTypeCasting;

public class ReferenceCastingAnimal {

	public static void main(String[] args) {
		
		//UpCasting
		
		Animal animal = new Dog();
		animal.eat();
		
		//DownCasting
		
		Dog dog = (Dog)animal;
		dog.eat();
		dog.bark();
		
		animal = new Cow();
		animal.eat();
		
		Cow cow = (Cow) animal;
		cow.produceMilk();
		
		//Dog dog1 = (Dog)animal;
		//System.out.println(dog1);
		

	}

}
