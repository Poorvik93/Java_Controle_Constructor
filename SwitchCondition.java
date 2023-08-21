package com.kodnest.day3session;

import java.util.Scanner;

public class SwitchCondition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input value :");
		int num=sc.nextInt();
		switch(num) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		default:
			System.out.println("Enter the valid input");
		}
	}
}
