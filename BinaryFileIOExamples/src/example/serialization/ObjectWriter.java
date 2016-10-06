package example.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWriter {

	public static void main(String[] args) throws IOException{
		FileOutputStream fos = new FileOutputStream("objects1.dat");
		ObjectOutputStream output = new ObjectOutputStream(fos);
		
		Square s = new Square(5);
		output.writeObject(s);
		
		output.close();

	}

}
