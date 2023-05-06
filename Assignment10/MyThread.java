package sem4_java;

public class MyThread extends Thread{

    public void run() {
        System.out.println("Thread is running.");

        // Sleep for 1 second
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread is done.");
    }

}



