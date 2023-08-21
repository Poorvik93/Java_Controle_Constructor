package com.kodnest.day3session;

public class NestedIfelse {

	public static void main(String[] args) {
		int num=10;
		if(num>=0) {
			if(num %2==0) {
				System.out.println("The num is divisible by 2 ");
			}
			else {
				System.out.println("The num is not divisible by 2 ");
			}
		}
		else {
			System.out.println("The num is less than 0 :");
		}
	}
}
