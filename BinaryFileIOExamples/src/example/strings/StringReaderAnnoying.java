package example.strings;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class StringReaderAnnoying {

	public static void main(String[] args) throws IOException {
		DataInputStream input = new DataInputStream(new FileInputStream("stringchars.dat"));
		StringBuilder sb = new StringBuilder();
		int length = input.readInt();
		for(int i = 0; i < length; i++){
			sb.append(input.readChar());
		}
		System.out.println(sb);
		input.close();
	}

}
