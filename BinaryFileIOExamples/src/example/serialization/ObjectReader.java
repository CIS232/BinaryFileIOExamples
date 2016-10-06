package example.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReader {

	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("objects1.dat");
		ObjectInputStream input = new ObjectInputStream(fis);
		
		try {
			Square s = (Square)input.readObject();
			System.out.println(s);
		} catch (ClassNotFoundException e) {
			System.out.println("The class was not found! " + e.getMessage());
		}

	}

}
