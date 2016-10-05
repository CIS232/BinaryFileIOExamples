package example.strings;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StringWriter {

	public static void main(String[] args) throws IOException{
		DataOutputStream output = new DataOutputStream(new FileOutputStream("stringutf.dat"));
		output.writeUTF("Test String");
		output.close();
	}

}
