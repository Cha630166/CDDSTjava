package com.scanner;

public class calculator {
	static int a, b, c;
	int m,n,o;
	static {
		a=100;
		b=200;
		c=300;
	}
	{
		m=10;
		n=20;
		o=30;
		
	}
	static void dispaly1() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	void display2() {
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
	}	
		
}
	public class example1{
		public static void main(String[] args) {
			calculator.dispaly1();
			example1 a =new example1();
			a.display2();
		}
	}



 