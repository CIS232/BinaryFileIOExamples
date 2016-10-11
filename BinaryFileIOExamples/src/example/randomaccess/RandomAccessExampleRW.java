package example.randomaccess;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessExampleRW {

	public static void main(String[] args) throws IOException {
		RandomAccessFile file = new RandomAccessFile("testrandom.dat", "rw");
		file.writeInt(100);
		file.writeInt(99);
		file.writeInt(98);
		file.writeInt(97);
		file.close();
		
	}

}
