package LAMBDA;

public class lambda2 {
    public static void main(String[] args) {
        interface calculator{
            int operate(int a,int b);
        }
        calculator add=(a,b)->a+b;
        calculator sub=(a,b)->a-b;
        calculator mul=(a,b)->a*b;

        System.out.println(add.operate(1,2));
        System.out.println(sub.operate(1,2));
        System.out.println(mul.operate(1,2));
    }
}
