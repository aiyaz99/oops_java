class MessageThread extends Thread {
    private String message;
    private int interval;

    // Constructor to initialize message and interval
    public MessageThread(String message, int interval) {
        this.message = message;
        this.interval = interval;
    }

    // Run method to display the message at the specified interval
    // we Override this method
    public void run() {
        try {
            while (true) {
                System.out.println(message);
                Thread.sleep(interval); // Sleep for the specified interval
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " interrupted.");
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        // Creating the first thread with message "BMS College of Engineering" and interval of 10 seconds (10000 milliseconds)
        MessageThread thread1 = new MessageThread("BMS College of Engineering", 10000);
       
        // Creating the second thread with message "CSE" and interval of 2 seconds (2000 milliseconds)
        MessageThread thread2 = new MessageThread("CSE", 2000);
       
        // Start both threads
        thread1.start();
        thread2.start();
    }
}