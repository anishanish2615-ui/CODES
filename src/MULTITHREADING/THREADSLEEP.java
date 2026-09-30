package MULTITHREADING;

public class THREADSLEEP {
    public static void main(String[] args) {
        class Mytask implements Runnable {
            public void run() {
                for (int i = 0; i <= 3; i++) {
                    System.out.println("Working" + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("Interrupted");
                    }
                }
            }
        }
        Thread t=new Thread(new MYtask());
        t.start();
    }

}
