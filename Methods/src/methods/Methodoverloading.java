package methods;

public class Methodoverloading {
	public void area(int b,int h) {
	System.out.println("Triangle:"+(0.5*b*h));
	}
	public void area(int r) {
		System.out.println("circle:"+(3.14*r*r));
		}

	
	public static void main(String[] args) {
		Methodoverloading op=new Methodoverloading();
		op.area(3,5);
		op.area(5);

}
}
