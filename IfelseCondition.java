package com.kodnest.day3session;

import java.util.Scanner;

public class IfelseCondition {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int x=sc.nextInt();
		if(x>=0) {
			System.out.println(x + "Is greater than 0 : ");
		}
		else {
			System.out.println(x + "Is not greater than 0 ");
		}

	}

}
