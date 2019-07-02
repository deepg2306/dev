package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class test {

	public static void main(String[] args) {
		 try
	        {
	            studentinfo si = new studentinfo("Abhiiiiiiiiiiii", 104, "110044");
	            FileOutputStream fos = new FileOutputStream("C:\\Users\\deep.a.gupta\\Desktop\\student.ser");
	            ObjectOutputStream oos = new ObjectOutputStream(fos);
	            oos.writeObject(si);
	            oos.close();
	            fos.close();
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }

	}

}
