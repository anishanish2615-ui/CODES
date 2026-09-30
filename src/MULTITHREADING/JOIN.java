package MULTITHREADING;

public class JOIN {
    public static void main(String[] args) {
        class Mytask  implements Runnable{
            public void run() {
                for(int i=0;i<5;i++){
                    System.out.println("main:"+i);
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        System.out.println("interrupted");
                    }
                }
            }

        }
        Thread t=new Thread(()->System.out.println("task running"));
        t.start();
        try {
            t.join();
        }catch (InterruptedException e){
            System.out.println("Task done continuing finish");
        }
    }
}
