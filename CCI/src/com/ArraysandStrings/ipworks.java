package com.ArraysandStrings;

import java.util.ArrayList;

public class ipworks {

	public static void main(String[] args) {
		String msisdn = "447468412361";
	//	String msisdn= "447389802980";
		
		String newmsisdn;// To be removed
		System.out.println(msisdn);// To be removed
		
		ArrayList<Character> test = new ArrayList<Character>();
		for (int i = msisdn.length()-1; i >= 0; i--) {
			test.add(msisdn.charAt(i));
			test.add('.');
		}
		
		System.out.println(test);// To be removed
		 StringBuilder builder = new StringBuilder(test.size());
		 
		    for(Character ch: test)
		    {
		        builder.append(ch);
		    }
		    String revmsisdn =builder.toString();
		   System.out.println(revmsisdn);// To be removed
		   System.out.println(revmsisdn.getClass().getName());// To be removed
		 
		   //String query ="create enumdnsched "+revmsisdn+"e164.arpa -set naptrFlags=nU -set naptrOrder=10 -set naptrPreference=10 -set naptrService=E2U+sip -set naptrTxt==\"!^.*$!sip:+"+msisdn+"@ims.vodafone.co.uk!";
		   //System.out.println(query);
		   String query1 ="delete enumdnsched "+revmsisdn+"e164.arpa";
		   System.out.println(query1);
	}

}
