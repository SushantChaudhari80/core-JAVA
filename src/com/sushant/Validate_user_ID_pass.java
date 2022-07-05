package com.sushant;

import java.util.Scanner;

public class Validate_user_ID_pass {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<=3;i++) {
		if(i==3 || i>3) {
			System.out.println();
			System.out.println("[  Contact to Admin .............]");
			break;
		}
		System.out.println("Enter User Name :");
		String username=sc.next();
		System.out.println("Enter Password :");
		String pass=sc.next();
		if(username.equals("Sushant80") && pass.equals("123")) {
			System.out.println("Welcome "+username);
			break;
		}else {
			System.out.println("Invalid UserID or Password");
			System.out.println("Remaining attempt is "+(2-i));
		}
		
	}
}
}
