package exceptionhandling.java;

public class Checked {

	public static void main(String[] args) {
		
		try {
			System.out.println("Hello world");
			Thread.sleep(20000);
			System.out.println("Lokesh");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
