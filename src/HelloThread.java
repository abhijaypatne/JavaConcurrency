
public class HelloThread extends Thread {

	    public void run() {
	        System.out.println("Hello from a thread!");
	    }

	    public static void main(String args[]) {
	        (new Thread()).start();				// This does nothing, as default run() method has no implementation			
	        (new HelloThread()).start();
	    }

}
