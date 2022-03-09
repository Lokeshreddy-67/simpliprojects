package filehandling;
import java.io.FileWriter;
import java.io.IOException;
public class Append {
			public static void main(String[] args) {
			   String data="Sailokesh";
			try {
				FileWriter writer = new FileWriter("C:\\Users\\sivas\\OneDrive\\Documents\\Lokeshjava\\filehandling\\src\\filehandling/data.txt");
					   writer.write(data);
					   writer.flush();
					   System.out.println("appended successfully");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			   
			
			
			}





