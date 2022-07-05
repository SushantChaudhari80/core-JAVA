package com.sushant;

import java.util.*;

public class ArmstrongNo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a No :");
	int no=sc.nextInt();
	int n,sum=0;
	int temp=no;
	while(no>0)   
	{         
	n = no % 10;     
	sum +=  (Math.pow(n, 3));   
	no = no/10;   
	}  
	if(temp==sum) {
		System.out.println("Given no is Armstring no");
	}else {
		System.out.println("Not Armstrong no");
	}
}
}
