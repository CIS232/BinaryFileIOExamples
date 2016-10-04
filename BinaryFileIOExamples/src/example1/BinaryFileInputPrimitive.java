package example1;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BinaryFileInputPrimitive {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("testbinary.dat");
		DataInputStream input = new DataInputStream(fis);
		
		int number = input.readInt();
		input.close();
		
		System.out.println(number);
	}

}
