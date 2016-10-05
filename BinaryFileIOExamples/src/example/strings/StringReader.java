package example.strings;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class StringReader {

	public static void main(String[] args) throws IOException{
		DataInputStream input = new DataInputStream(new FileInputStream("stringutf.dat"));
		System.out.println(input.readUTF());
		input.close();
	}

}
