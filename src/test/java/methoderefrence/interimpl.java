package methoderefrence;


public class interimpl {

	public static void asg() {
		System.out.println("hello govind");
	}
	
	
	public static void main(String[] args) {
		Thread a= new Thread(interimpl::asg);
		a.start();
	}
	
	
	
}
