package Solution51_100;

public class ma4 {
	
    /** Number of threads. */
    private static final int NUM_THREADS = 13;

    /** Sequence, starting from "A". */
    private static long sequence = 'A';
    
    
	
	  private static class Alphabet extends Thread {

	         static synchronized void  next() {
		            System.out.print((char) ma4.sequence + " ");
		            ma4.sequence++;
		        }
	         
	         public void start(){
	        	 run();
	         }

	        public void run() {
	            next();
	            next();
	        }
	        
	 

	    }
	
	
    // Main method
    public static void main(String args[]) {

        Alphabet alphabet = new Alphabet();

        /* Create threads */
        Thread[] threads = new Thread[NUM_THREADS];
        for (int i = 0; i < NUM_THREADS; i++) {
            Thread thread = new Thread(alphabet);
            threads[i] = thread;
            //threads[i].start();
        }

        /* Start threads */
        for (int i = 0; i < NUM_THREADS; i++) {
        	threads[i].start();
        }

    }
}

