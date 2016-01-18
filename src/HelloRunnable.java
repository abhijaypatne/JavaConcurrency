
public class HelloRunnable implements Runnable {

    public void run() {
        System.out.println("inside a thread!");
    }

    public static void main(String args[]) {
    	//System.out.println("before");
        //(new Thread()).start();
        (new Thread(new HelloRunnable())).start();
        //
    }

}