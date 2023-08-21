package com.kodnest.day3session;

import java.util.Scanner;

public class DoWhileCondition {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number :");
			int num=sc.nextInt();
			int i=2;
			do 
			{ 
				System.out.println(i);
				i++;
			}
			while(i<num);
			
		}
}
