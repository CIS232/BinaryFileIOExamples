package example.append;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TimeLogReader {

	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("timelog.dat");
		DataInputStream input = new DataInputStream(fis);
		while(input.available() > 0){
			System.out.println(input.readLong());
		}
		input.close();
	}

}
