package com.destination.jfs.day13;
class dog{
	String name;
	String color;
	String breed;
	int cost;

	void display() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(breed);
		System.out.println(cost);
	}
	void allocateData() {
		name="lovely";
		color="white";
		breed="seezu";
		cost=1000;
	}
}


public class instanceVariableExample {

	public static void main(String[] args) {
		dog d=new dog();

		d.allocateData();
		d.display();
	}

}
