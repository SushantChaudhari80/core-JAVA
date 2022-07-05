package com.sushant.core_java_hands_on.loops_AND_dataTypes;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	//primitive data Types
			Short Short;
			byte Byte;
			int Int;
			long Long;
			float Float;
			double Double;
			char Char;
			boolean Boolean;
			
			
			Scanner sc=new Scanner(System.in);	
			Functions f=new Functions();

			System.out.println("Enter a Initial of Data Type ,for Reverse data :");
			Char=sc.next().charAt(0);
			switch(Char) {
			case 'S':
				System.out.println("Enter Data :");
				Short=sc.nextShort();
				f.readReverseData(Short);
				break;
				
			case 'B':
				System.out.println("Enter Data :");
				Byte=sc.nextByte();
				f.readReverseData(Byte);
				break;
				
			case 'I':
				System.out.println("Enter Data :");
				Int=sc.nextInt();
				f.readReverseData(Int);
				break;
				
			case 'L':
				System.out.println("Enter Data :");
				Long=sc.nextLong();
				f.readReverseData(Long);
				break;
				
			case 'F':
				System.out.println("Enter Data :");
				Float=sc.nextFloat();
				f.readReverseData(Float);
				break;
				
			case 'D':
				System.out.println("Enter Data :");
				Double=sc.nextDouble();
				f.readReverseData(Double);
				break;
			
				default :
					System.out.println("Mistmatch Type");
					break;
			}
}
}
