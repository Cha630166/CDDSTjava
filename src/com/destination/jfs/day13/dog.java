package com.destination.jfs.day13;

public class dog {
	static String name;
	static String color;
	


static void display() {
	System.out.println(name);
	System.out.println(color);
}
static void allocateData() {
	name="lovely";
	color="white";
	
}
}
public class StaticVariableExample{
	public static void main(String[] args) {
		System.out.println(dog.name);
		System.out.println(dog.color);
		dog.allocateData();
		dog.display();
		
	}
}