package multithread;
class Hi extends Thread{
	public void run() {
		for(int i=0;i<5;i++);
	    System.out.println("hi");
				
	}
}
class Hello extends Thread{
		public void run() {
			for(int i=0;i<5;i++);
		    System.out.println("hello");
					
		}
}





public class Mythread{

	public static void main(String[] args) {
		Hi mt1=new Hi();
		mt1.setName("Child");
		mt1.setPriority(5);
		Hello mt2=new Hello();
		mt2.setName("Child");
		mt2.setPriority(10);
		System.out.println(mt1.getPriority());
		System.out.println(mt2.getPriority());
		System.out.println(mt1.getName());
		System.out.println(mt2.getName());
		
		mt1.start();
        mt2.start();
        
		}

}




