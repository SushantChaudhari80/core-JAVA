package com.sushant.core_java_hands_on.String;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {
	
	String s1;//String are immutable 
	StringBuffer s2;//StringBuffer Are syncronized
	StringBuilder s3;//StringBulider does not contain any syncronized meth

Scanner sc=new Scanner(System.in);	
s1=sc.next();
s2=new StringBuffer("Hi Sushant.");
s3=new StringBuilder("Hi Sushnat Chaudhari!.");

}
}
