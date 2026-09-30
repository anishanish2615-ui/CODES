package MULTITHREADING;

class MYthread extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("THREAD:"+i);
        }
    }
}

public class THREAD {
    public static void main(String[] args) {
        MYthread mt=new MYthread();
        mt.start();

        for(int i=0;i<10;i++){
            System.out.println("main:"+i);
        }
    }
}
