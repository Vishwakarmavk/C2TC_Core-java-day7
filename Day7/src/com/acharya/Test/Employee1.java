package com.acharya.Test;

public class Employee1 {

	
		int id;
		String name;
		float salary;
		
		Employee1(){
			  System.out.println("User defined No-arg constructor is called");
		}
public Employee1(int i, String s, float f) {
	  id=i;
	  name=s;
	  salary=f;
	  
}
		void display() {
			  System.out.println(id +" "+ name +" " +salary);
		}
		public static void main(String[] args) {
			  Employee1 e1=new Employee1();
			  Employee1 e2=new Employee1(22,"rama",2000);
			  e1.display();
			  e2.display();

	}

}
