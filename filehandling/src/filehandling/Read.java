package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.CharBuffer;

public class Read {
	public static void main(String[] args) throws IOException {
		  char[] data=new char[100];
		try {
			FileReader reader = new FileReader("C:\\Users\\sivas\\OneDrive\\Documents\\Lokeshjava\\filehandling\\src\\filehandling/data.txt");
		    reader.read(data);
			System.out.println("Reading Successfully");
			System.out.println(data);
	        reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
