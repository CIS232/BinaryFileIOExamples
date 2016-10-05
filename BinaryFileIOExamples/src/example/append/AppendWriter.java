package example.append;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class AppendWriter {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("timelog.dat", true);
		DataOutputStream output = new DataOutputStream(fos);
		
		output.writeLong(System.currentTimeMillis());
		output.close();
	}

}
