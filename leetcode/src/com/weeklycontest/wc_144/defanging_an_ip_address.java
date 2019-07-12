package com.weeklycontest.wc_144;

public class defanging_an_ip_address {

	public static void main(String[] args) {
		String test = "1.1.1.1";
		String newsting = test.replace(".", "[.]");
		System.out.println(newsting);
	}

}
