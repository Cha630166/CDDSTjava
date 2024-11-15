package com.scanner;
import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the byte data");
	byte b=sc.nextByte();
	System.out.println(b);
	System.out.println("enter the short data");
	short s=sc.nextShort();
	System.out.println(s);
	System.out.println("enter the int data");
	int i=sc.nextInt();
	System.out.println(i);
	System.out.println("enter the long data");
	long l=sc.nextLong();
	System.out.println(l);
	System.out.println("enter the string data");
	String string=sc.next();
	System.out.println(string);
	System.out.println("enter the float data");
	float f=sc.nextFloat();
	System.out.println(f);
	System.out.println("enter the double data");
	double d=sc.nextDouble();
	System.out.println(d);
	System.out.println("enter the boolean data");
	boolean bo=sc.nextBoolean();
	System.out.println(bo);
	

	



	}

}
