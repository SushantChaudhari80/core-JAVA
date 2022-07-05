package com.sushant.core_java_hands_on.loops_AND_dataTypes;

public class Functions {
public void readData(long l) {
	System.out.println(l);
}

public void readReverseData(long number) {
	long reverse=0;
	while(number != 0)   
	{  
	long remainder = number % 10;  
	reverse = reverse * 10 + remainder;  
	number = number/10;  
	}
	System.out.println(reverse);
}

public void readReverseData(double number) {
String s=Double.toString(number);
for(int i=s.length()-1;i>=0;i--) {
	System.out.print(s.charAt(i));
}
}
}
