package methods;

public class Methods {
	public int Multiply(int a,int b) {
	      int r=a*b;
	      return r;
	}

	public static void main(String[] args) {
		
		System.out.println("Hello");
		Methods op=new Methods();
		int ans=op.Multiply(2, 5);
		System.out.println("Multiplication:"+ans);
		

	}

}
