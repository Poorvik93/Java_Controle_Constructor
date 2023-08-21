package com.kodnest.day3session;

import java.util.Scanner;

public class NestedFor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			System.out.print(" * ");
			for(int j=1;j<=num;j++)
			{
				System.out.print(" * ");
			}
		}
	}
}
