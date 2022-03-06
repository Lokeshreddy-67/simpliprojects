package multithreading;

public class Multithreading implements Runnable {
	
	public static void main(String[] args) {
		 System.out.println("Welcome");
		Multithreading t1=new Multithreading();
		 t1.run();
		
	}

public void run() {
	for(int i=0;i<5;i++) {
	try {
		System.out.println("Thread"+Thread.currentThread().getId()+" is running");
	}catch(Exception e) {
		System.err.println("Threads are caught");
	}
		
	 }
}
}


