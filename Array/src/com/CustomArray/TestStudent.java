package com.CustomArray;

public class TestStudent {

	public static void main(String[] args) {
	
      Student priya = new Student("Priya","female",22,"BE",65);
      Student raki= new Student("Raki","male",22,"BE",55);
      Student diya = new Student("Diya","female",23,"BE",50);
      Student sachin = new Student("Sachin","male",23,"BE",80);
      Student neha = new Student("neha","female",24,"BCA",85);
      Student shreya = new Student("shreya","female",24,"BE",85);
      Student adithi = new Student("Adithi","female",24,"BE",50);
      Student shashank = new Student("Shashank","male",23,"BCOM",45);
      Student arun = new Student("Arun","male",22,"BCA",95);
      Student santhu = new Student("Santhu","male",23,"BE",68);
	
	Student[] students = {priya,raki,diya,sachin,neha,shreya,adithi,shashank,arun,santhu };
	
	System.out.println("Printing student whose qualification" 
	+ "is BE and Agrregation is >80");
	 for(Student student : students) {
		 if(student.qualification.equals("BE") && student.aggregate >80)
		 {
			 System.out.println(student.name);
		 }
	}
	 
	 System.out.println("..................");
	 
	 System.out.println("Age is >22 and agregate <60");
	 for(Student student : students) 
	 {
		 if(student.age > 22 && student.aggregate < 60)
		 {
			 System.out.println(student.name);
		 }
	 }
	 
	 System.out.println("..................");
	 
	 System.out.println("Agregate > 60 and < 80");
	 for(Student student : students) 
	 {
		 if(student.aggregate > 60 && student.aggregate < 80)
		 {
			 System.out.println(student.name);
		 }
	 }
	 
     System.out.println("..................");
	 
	 System.out.println("Male Student");
	 for(Student student : students) 
	 {
		 if(student.gender.equals("male"))
		 {
			 System.out.println(student.name);
		 }
	 }
	 
System.out.println("..................");
	 
	 System.out.println("Female Student");
	 for(Student student : students) 
	 {
		 if(student.gender.equals("female"))
		 {
			 System.out.println(student.name);
		 }
	 }
}

}
