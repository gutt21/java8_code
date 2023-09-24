package multiplethreading;

public class synchronized_demo implements Runnable {

	
	
	
	
	//synchronized it is used to lock the thread until complete a thread when thread completed lock will be open
	/**public synchronized void ready() {
		for(int i=1; i<10; i++) {
			System.out.println(i);
		}
	}**/
	

	//synchronized it is used to lock the thread until complete a thread when thread completed lock will be open
	public  void ready() {
		System.out.println(Thread.currentThread().getName());
		synchronized(this) {
		for(int i=1; i<10; i++) {
			System.out.println(i);
		}
		}
	}
	 
	@Override
	public void run() {
		synchronized_demo t=new synchronized_demo();
		t.ready();
		
		
	}

	
	
	public static void main(String[] args) throws Exception {
		
		
		Thread th=new Thread(new synchronized_demo(),"akash");
		Thread th1=new Thread(new synchronized_demo(),"khadar");
		
		th.start();
		th1.start();
		
	}
	
	
	
	
	
}
