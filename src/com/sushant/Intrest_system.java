package com.sushant;

import java.util.Scanner;

public class Intrest_system {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Amount : ");
	int amt=sc.nextInt();
	System.out.println("Enter Rate of Intrest : ");
	float rate=sc.nextFloat();
	System.out.println("Enter Peroid in years");
	float year=sc.nextFloat();
	System.out.println("Simple Intrest : "+((amt/100)*rate)*year);
}
}
