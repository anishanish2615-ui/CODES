package LAMBDA;

public class lambda1 {
    //(parameters)->expression
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            public void run() {
                System.out.println("Running");
            }
        };
        runnable.run();
        Runnable runnable2=()->System.out.println("Running");
        runnable2.run();
    }



}
