package com.acharya.Test;

class Employee3 {
	 Employee3(){
		 this(4,6);	 
		 System.out.println("In employee no-arg");
	 }
	 Employee3(int x){
		 this();
		 System.out.println(x);
	 }
	 Employee3(int y,int z){
		 System.out.println(y+ " "+z);
	 }
	 
}

public class ConstructorCall {

	public static void main(String[] args) {
		
          Employee3 e= new Employee3(5);
	}

}
