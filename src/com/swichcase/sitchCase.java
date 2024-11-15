package com.swichcase;
import java.util.Scanner;
public class sitchCase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int n1=sc.nextInt();
		System.out.println("enter the second number");
		
		int n2=sc.nextInt();
		
		System.out.println("plesase select the operaton\n"
				+"1.addition\n"
				+"2.substraction\n"
				+"3.multiplication\n");
		int res;
		int choice=sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("addition ");
			res=n1+n2;
			System.out.println(res);
			break;
			
		}
		case 2:{
			System.out.println("substraction");
			res=n1-n2;
			System.out.println(res);
			break;
		}
		case 3:{
			System.out.println("multiplication");
			res=n1*n2;
			System.out.println(res);
			break;
		}
		default:
			System.out.println("there is no operation");
		}
		}
		}
	


