package com.sushant.core_java_hands_on.oops;

import java.util.Scanner;

public class EmpServiceImpl extends EmpService{
Scanner sc=new Scanner(System.in);


	@Override
	public String updateEmp(Emp e) {
	     System.out.println("Enter Emp ID :");
	     e.setID(sc.next());
	     System.out.println("Enter Emp Name :");
	     e.setName(sc.next());
	     System.out.println("Enter Emp Address :");
	     e.setAddress(sc.next());
	     return e.toString();
	}


	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.getName();
	}

}
