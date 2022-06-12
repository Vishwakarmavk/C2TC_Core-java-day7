package com.acharya.Test;

public class Employee {

	
		int id;
		String name;
		float salary;
		void display() {
			  System.out.println(id +" "+ name +" " +salary);
		}
		public Employee( int id,  String name,  float salary) {
			
			this.id = id;
			this.name = name;
			this.salary = salary;
		}

		public static void main(String[] args) {
			  Employee e1=new Employee(222,"vishwa",5000);
			  Employee e2=new Employee(333,"vishnu",5000);
			  e1.display();
			  e2.display();

	}

}
