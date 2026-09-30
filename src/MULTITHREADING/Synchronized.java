package MULTITHREADING;

public class Synchronized {
    public static void main(String[] args)throws InterruptedException {
        class counter {

            int count = 0;

            synchronized void increment() {
                count++;
            }
        }
        counter a=new counter();
        Runnable task=()->{
            for (int i=0;i<1000;i++) {
                a.increment();

            }

        };
        Thread t1=new Thread(task);
        Thread t2=new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(a.count);
    }
}
