package com.java;

import java.util.Scanner;

public class JavaIfelse {

	private static final Scanner scanner = new Scanner(System.in);
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int i = scan.nextInt();
	        double d=scan.nextDouble();
	        String s= scan.next();
	         s += scan.nextLine();
	        

	        System.out.println("String: " + s);
	        System.out.println("Double: " + d);
	        System.out.println("Int: " + i);
	    }

	/*
	 * public static void main(String[] args) { int n = scanner.nextInt(); if
	 * (n%2!=0) System.out.println("Weird"); else if ((n%2==0)&&(n>=2 && n<=5))
	 * System.out.println("Not Weird"); else if ((n%2==0)&&(n>=6 && n<=20))
	 * System.out.println("Weird"); else if ((n%2==0)&&(n>20))
	 * System.out.println("Not Weird"); scanner.close(); }
	 */
}
