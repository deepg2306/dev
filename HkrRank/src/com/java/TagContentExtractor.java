package com.java;

import java.util.Scanner;

public class TagContentExtractor {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while (testCases > 0) {
			String line = in.nextLine();
			System.out.println(line);

			testCases--;
		}
	}

}

//<h1>Nayeem loves counseling</h1>
//<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>
//<Amee>safat codes like a ninja</amee>

//Nayeem loves counseling
//Sanjay has no watch
//So wait for a while
//None
