package example.firstbinary;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFileOutputPrimitive {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("testbinary.dat");
		DataOutputStream output = new DataOutputStream(fos);
		
		output.writeInt(100_000_000);
		output.close();
	}

}
