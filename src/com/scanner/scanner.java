package com.scanner;
import java.util.*;

public class scanner {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a");
		int a=sc.nextInt();
	    System.out.println(a);
	    System.out.println("*****************4");
		System.out.println("enter the value of string");
		String name=sc.nextLine();
		try{
			System.out.println(name);
		}catch(){
			System.out.println(name);
		}
		int b=sc.nextInt();
		int result=a+b;
		System.out.println(result);
	}

}
