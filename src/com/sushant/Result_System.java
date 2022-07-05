package com.sushant;

import java.util.Scanner;

public class Result_System {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a marks of three Subjects :");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	if(a>60 && b>60 && c>60) 
     System.out.println("Passed");
	else {
	if((a<60 && b>60 && c>60) || (a>60 && b<60 && c>60) || (a>60 && b>60 && c<60))
		System.out.println("Promped");
	else
		System.out.println("Failed");
	}
}
}
