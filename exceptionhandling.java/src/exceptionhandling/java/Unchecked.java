package exceptionhandling.java;

public class Unchecked {
	
	public static void main(String[] args) {
		
		int num=100;
		int result=0;
		
		System.out.println("First");
		System.out.println("Second");
		try {
		result=Unchecked.div(4,0);
		}catch(Exception e) {
			System.err.println("Sorry you can't div by zero");
		}
		finally {
			System.out.println("HYYYYY!!!!!!!!!");
		}
		System.out.println(result);

	}
    public static int div(int num1, int num2){
    	
    	return num1/num2;
    	
    	
	
}

}
