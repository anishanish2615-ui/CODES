package DSA;

public class shadowing {
    static int x=80;
    public static void main(String[] args){
        System.out.println(x);
        int x=90;
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);

    }

}
