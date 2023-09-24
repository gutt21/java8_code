package multiplethreading;

import java.util.Random;

import org.testng.reporters.jq.Main;

public class Message {

	
	public static void main(String[] args) {
		Message message=new Message();
		new Thread(new Producer(message)).start();
		new Thread(new Consumer(message)).start();
		
	}
	
	
	
	private String message;
	private boolean empty=true;
	
	public synchronized String read() {
		while(empty) {
			try {
				wait(); // it is object
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		empty=true;
		notifyAll();
		return message;
		
		
	}
	
	public synchronized void write(String message) {
		while(!empty) {
			try {
				wait(); // it is object
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		empty=false;
		this.message= message;
		notifyAll();
		
	}
}	

class Producer implements Runnable{
	
	private Message message;
	
	public Producer(Message message) {
		this.message=message;
	}
	
	@Override
	public void run() {
		String message[]= {"message 1","message 2","message 3","message 4","message 5","message 6",};
		
		for(String mes:message) {
			this.message.write(mes);
			System.out.println("producer: " +mes);
			
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		this.message.write("Finished");
		
		
	}
	
}
	
class Consumer implements Runnable{
	private Message message;

	public Consumer(Message message) {
		this.message=message;
	}
	
	
	@Override
	public void run() {
		
		Random random=new Random();
		
		for(String message =this.message.read(); !message.equals("Finished");message=this.message.read()) {
			System.out.println("Consumer : "+ message);
		}
		
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	}

	
}
	

 



