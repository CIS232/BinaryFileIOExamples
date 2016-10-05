package example.multivalue;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MutliValueWriter {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("multivalue.dat");
		DataOutputStream output = new DataOutputStream(fos);
		output.writeShort(23);
		output.writeDouble(Math.PI);
		output.writeBoolean(false);
		output.writeUTF("This is a String");
		output.close();
	}

}
