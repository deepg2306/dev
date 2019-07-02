package serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class DeserializationTest {

	 public static void main(String[] args)
	    {
	        studentinfo si=null ;
	        try
	        {
	        	FileInputStream fis = new FileInputStream("C:\\Users\\deep.a.gupta\\Desktop\\student.ser");
	            ObjectInputStream ois = new ObjectInputStream(fis); 
	            si = (studentinfo)(ois).readObject();
	            System.out.println(si.name);
	            System.out. println(si.rid);
	            System.out.println(si.contact);//Contact field is null because,it was marked as static and as we have discussed earlier static fields does not get serialized.
	            fis.close();
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace(); }
	            
	        }
}
