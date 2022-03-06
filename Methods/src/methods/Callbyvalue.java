package methods;

public class Callbyvalue {
	int a=150;
	public int operation(int a) {
	 a=a*10;
		return(a);
	}

	public static void main(String[] args) {
		Callbyvalue op=new Callbyvalue();
		System.out.println("before:" +op.a);
		op.operation(100);
		System.out.println("After:"+op.a);
		
		

	}

}
