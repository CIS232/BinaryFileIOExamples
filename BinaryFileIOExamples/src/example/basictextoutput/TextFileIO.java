package example.basictextoutput;

import java.io.IOException;
import java.io.PrintWriter;

public class TextFileIO {

	public static void main(String[] args) {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter("test.txt");
			pw.println(100_000_000);
		} catch (IOException e) {
			System.out.println("Something bad happened.\n" + e.getMessage());
		} finally {
			if(pw != null){
				pw.close();
			}
		}
		
	}

}
