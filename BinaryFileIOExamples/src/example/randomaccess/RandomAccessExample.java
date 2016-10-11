package example.randomaccess;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessExample {

	public static void main(String[] args) throws IOException {
		RandomAccessFile file = new RandomAccessFile("testrandom.dat", "rw");
		
		//seek to the 4th number
		file.seek(Integer.BYTES * 3);
		
		int val = file.readInt();
		System.out.printf("%,d%n", val);
		
		//seek to the 4th number
		file.seek(Integer.BYTES * 3);
		file.writeInt(val - 1);
		
		file.close();
	}

}
