package com.sushant;

import java.util.Scanner;

public class Income_tax {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter A Amount :");
	int amt=sc.nextInt();
	if(amt<180000) {
		System.out.println("No Tax");
	}else if(amt>181000 && amt<300000) {
		System.out.println("Income Tax per Year "+(amt/100)*10);
	}else if(amt>301000 && amt<500000) {
		System.out.println("Income Tax per Year "+(amt/100)*20);
	}else if(amt>500000){
		System.out.println("Income Tax per Year "+(amt/100)*30);
	}
}
}
