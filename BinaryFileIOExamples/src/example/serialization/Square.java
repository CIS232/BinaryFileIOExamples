package example.serialization;

import java.io.Serializable;

public class Square implements Serializable{
	private static final long serialVersionUID = 1L;
	private int length = 0;
	
	public Square(int length){
		this.length = length;
	}
	
	public int getSideLength(){
		return length;
	}
	
	public int getArea(){
		return length * length;
	}
	
	public int getPerimeter(){
		return 4 * length;
	}
	
	public void setSideLength(int length){
		this.length = length;
	}
	
	public String toString(){
		return String.format("The area of the Square is %d", getArea());
	}
}
