package multithread1;

class Threading implements Runnable{
	public void run(){
		int n=3;
		for(int i=0;i<n;i++);
		System.out.println("Thread is running");
		}
	
	public static void main(String[] args) {
		Threading m1=new Threading();
		Thread t1=new Thread(m1);
		t1.start();
	}
}