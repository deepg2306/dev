package com.easy;

import java.io.File;
import java.io.IOException;

public class processbuilder {
	public static void main(String[] args) throws InterruptedException, IOException {
		ProcessBuilder pb = new ProcessBuilder("DiPATrayApp.exe");
		//pb.directory(new File("C:/Program Files (x86)/DiPA"));
		Runtime.getRuntime().exec("C:/Program Files (x86)/DiPA/DiPATrayApp.exe");
		System.out.println(pb.directory());
		System.out.println("Run echo command");
		Process process = pb.start();
		
		
		
	}

	
}
