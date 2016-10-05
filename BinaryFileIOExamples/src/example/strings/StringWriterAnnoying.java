package example.strings;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StringWriterAnnoying {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("stringchars.dat");
		DataOutputStream output = new DataOutputStream(fos);
		String test = "Test String";
		output.writeInt(test.length());
		output.writeChars("Test String");
		
		output.close();
	}

}
