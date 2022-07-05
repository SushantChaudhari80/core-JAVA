package com.sushant;

import java.util.Scanner;

 class Search_in_array_bubblesort {
public static void main(String args[] ) {
	Scanner sc=new Scanner(System.in);
	int arr[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
	System.out.println("Enter a number : ");
	int m=sc.nextInt();
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==m) {
			System.out.println("Given no is present in arr and its position is "+(i+1));
		}
	}
	new Search_in_array_bubblesort().bubbleSort(arr);	
}
void bubbleSort(int arr[])
{
    int n = arr.length;
    for (int i = 0; i < n - 1; i++)
        for (int j = 0; j < n - i - 1; j++)
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
    System.out.println("Sorted Array Using Bubble Sort");
    for (int i = 0; i < n; ++i)
        System.out.print(arr[i] + " ");
    System.out.println();
}
}
