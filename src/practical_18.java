class MyThread extends Thread {
    public void run() {
       
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread is running: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

public class practical_18 {
    public static void main(String[] args) {
       
        MyThread myThread = new MyThread();

       
        myThread.start();

       
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main thread is running: " + i);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted.");
            }
        }
    }
}


