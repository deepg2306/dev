package com.algorithm.Implementation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test2 {

	public static void main(String[] args) {
		String str = "IPWorks> create enumdnsched 0.8.9.2.0.8.9.8.3.7.4.4.e164.arpa -set naptrFlags=nU -set naptrOrder=10 -set naptrPreference=10 -set naptrService=E2U+sip -set naptrTxt=\"!^.*$!sip:+447389802980@ims.mnc015.mcc234.3gppnetwork.org!\r\n" + 
				"1 object(s) created.\r\n";
		String pattern="[1 object(s) created]";
		
		Pattern r = Pattern.compile(pattern);

	      // Now create matcher object.
	      Matcher m = r.matcher(str);
	      if (m.find()) {
			System.out.println(m.group());
			System.out.println("Hello");
		}
	      else
	    	  System.out.println("no");

	}

}
