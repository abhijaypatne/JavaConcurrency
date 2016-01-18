public class SleepMessages {
	
	public static void sleepTest() throws InterruptedException {
        String importantInfo[] = {
                "Mares eat oats",
                "Does eat oats",
                "Little lambs eat ivy",
                "A kid will eat ivy too"
            };

            for (int i = 0;
                 i < importantInfo.length;
                 i++) {
                //Pause for 1 second
                Thread.sleep(1000);
                if(Thread.interrupted()){
                	throw new InterruptedException();
                }
                //Print a message
                System.out.println(importantInfo[i]);
            }
        }

    public static void main(String args[]){
    	try{
    		 //	SleepMessages.sleepTest();
    		 (new SleepMessages()).sleepTest();
    	}
    	catch(InterruptedException e){
    		System.out.println("Thread interrupted, returning");
    		e.printStackTrace();
    		return;
    	}
    	finally {
			
		}
    }

}