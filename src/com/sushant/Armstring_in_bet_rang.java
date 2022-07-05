package com.sushant;

import java.util.Scanner;

public class Armstring_in_bet_rang {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a rang of numbers");
	int a=sc.nextInt();
	int b=sc.nextInt();
	for(;a<b;a++) {
		int no=a;
		int n,sum=0;
		int temp=no;
		while(no>0)   
		{         
		n = no % 10;     
		sum +=  (Math.pow(n, 3));   
		no = no/10;   
		}  
		if(temp==sum) {
			System.out.println(temp + " no is Armstring no");
		}
//		else {
//			System.out.println("Not Armstrong no");
//		}

	}
}
}
