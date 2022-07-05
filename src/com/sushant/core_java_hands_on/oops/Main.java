package com.sushant.core_java_hands_on.oops;

public class Main {
public static void main(String[] args) {
	EmpService service=new EmpServiceImpl();
	Emp e=new Emp("SUSHCHAU","Sushant Chaudhari","Ahmednagar");
	System.out.println(e.toString());
	System.out.println(service.updateEmp(e));
}
}
