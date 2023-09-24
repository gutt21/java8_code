package multiplethreading;

public class custom_thread extends Thread {

	
	@Override
	public void run() {
		
		for(int i=1; i<10; i++) {
			System.out.println(Thread.currentThread().getName() +":" +i);
		}
		
	}

	
	public static void main(String[] args) throws Exception {
		custom_thread t= new custom_thread();
		t.setName("thread1");
		custom_thread t2= new custom_thread();
		t2.setName("thread2");
		t.start();
		t.join();//it use to Controller the full complete one thread then go to next thread to execute
		t2.start();
	}
	
}
