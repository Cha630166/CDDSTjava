package com.scanner;

public class practice {
	

	int gst;
	public static void main(String[] args) {
		practice p=new practice();
		p.gst=18;
		p.carLoan();
		p.homeLoan();
	}


void carLoan() {
	int roi=12;
	System.out.println(gst);
	int total=roi*gst;
System.out.println(total);
	System.out.println("car loan process begin");
}
void homeLoan(){
	
	System.out.println(gst);
	int roi=13;
	int total=roi*gst;
System.out.println("home loan begins");
}
}
