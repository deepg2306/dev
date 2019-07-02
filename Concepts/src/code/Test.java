package code;

public class Test {

	public static void main(String[] args) {
		String str1 = null;
		String result = null;
		String command = "create enumdnsched 0.8.9.2.0.8.9.8.3.7.4.4.e164.arpa -set naptrFlags=nU -set naptrOrder=10 -set naptrPreference=10 -set naptrService=E2U+sip -set naptrTxt=\"!^.*$!sip:+447389802980@ims.mnc015.mcc234.3gppnetwork.org!\r\n";
		String str = "create enumdnsched 0.8.9.2.0.8.9.8.3.7.4.4.e164.arpa -set naptrFlags=nU -set naptrOrder=10 -set naptrPreference=10 -set naptrService=E2U+sip -set naptrTxt=\"!^.*$!sip:+447389802980@ims.mnc015.mcc234.3gppnetwork.org!\r\n"
				+ "1 object(s) created.\r\n" + "IPWorks> ";

		if (str.contains(command)) {
			str1 = "1 object(s) created";

		}
		System.out.println(command.indexOf(command));
		System.out.println(command.lastIndexOf(command));
		
	//	result = str.substring(command.indexOf(command), command.lastIndexOf(command));
		//System.out.println(str1);

	}

}
