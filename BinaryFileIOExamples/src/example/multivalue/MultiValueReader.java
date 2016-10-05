package example.multivalue;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class MultiValueReader {

	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("multivalue.dat");
		DataInputStream input = new DataInputStream(fis);
		//file order: short, double, boolean, utf
		
		short s = input.readShort();
		double d = input.readDouble();
		boolean b = input.readBoolean();
		String str = input.readUTF();
		
		System.out.printf("short: %d double: %f boolean: %b String: \"%s\"%n", s, d, b, str);
		
		input.close();
	}

}
