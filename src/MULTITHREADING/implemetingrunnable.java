package MULTITHREADING;

class MYtask implements Runnable{
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("main:"+i);
        }

    }
}
public class implemetingrunnable {
    public static void main(String[] args) {
        Thread thread = new Thread(new MYtask());
        thread.start();
    }
}