package com.algorithm.Implementation;

public class Test {

	public static void main(String[] args) {
		String str1 = null;
		String result = null;
		String result2 = null;
		String create1 = "ims.mnc015.mcc234.3gppnetwork.org!";
		String create2 = "ims.vodafone.co.uk!";
		String command = "create enumdnsched 0.8.9.2.0.8.9.8.3.7.4.4.e164.arpa -set naptrFlags=nU -set naptrOrder=10 -set naptrPreference=10 -set naptrService=E2U+sip -set naptrTxt=\"!^.*$!sip:+447389802980@ims.mnc015.mcc234.3gppnetwork.org!\r\n";
		String str = "create enumdnsched 0.8.9.2.0.8.9.8.3.7.4.4.e164.arpa -set naptrFlags=nU -set naptrOrder=10 -set naptrPreference=10 -set naptrService=E2U+sip -set naptrTxt=\"!^.*$!sip:+447389802980@ims.mnc015.mcc234.3gppnetwork.org!\r\n"
				+ "1 object(s) created.\r\n" + "IPWorks> ";

		/*
		 * if (str.contains(command)) { str1 = "1 object(s) created";
		 * 
		 * }
		 */
		// System.out.println(command.indexOf(command));
		//System.out.println(command.lastIndexOf(create1));
		//System.out.println(command.lastIndexOf(create2));

		result = str.substring(command.lastIndexOf(create1),str.length());
		result2 =result.substring(result.lastIndexOf(result),result.indexOf("IPWorks>"));
		//System.out.println(result);
		//System.out.println(result2);

		System.out.println(str.lastIndexOf("ims.mnc015.mcc234.3gppnetwork.org!\r\n"));
		System.out.println(str.indexOf("ims.mnc015.mcc234.3gppnetwork.org!\r\n"));
		//String test ="ims.mnc015.mcc234.3gppnetwork.org!\r\n";
	//	System.out.println(test.length());
		
	//	System.out.println(str);
		System.out.println(str.substring((str.lastIndexOf("ims.mnc015.mcc234.3gppnetwork.org!\r\n")+36), str.indexOf("IPWorks>")));
	}

}
