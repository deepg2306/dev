package serialization;

import java.io.Serializable;

public class studentinfo implements Serializable{
	String name;
	int rid;
	static String contact;

	studentinfo(String n, int r, String c) {
		this.name = n;
		this.rid = r;
		this.contact = c;
	}
}
