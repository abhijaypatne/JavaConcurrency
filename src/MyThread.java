
public class MyThread extends Thread{
	
	public void run(){
		System.out.println("MyThread started");
	}
	
	public static void main(String args[]){
		MyThread mt = new MyThread();
		mt.start();
		
	}

}
