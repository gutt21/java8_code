package multiplethreading;

public class usingrunnable_process implements Runnable {

	@Override
	public void run() {
		
		for(int i=1; i<10; i++) {
			System.out.println(Thread.currentThread().getName() +":" +i);
		}
	}

	
	
	public static void main(String[] args) throws Exception {
		usingrunnable_process t= new usingrunnable_process();
		usingrunnable_process t1= new usingrunnable_process();
		
		Thread th=new Thread(t,"akash");
		Thread th1=new Thread(t,"khadar");
		
		th.start();
		th.join();
		th1.start();
		
	}
	
	
}
