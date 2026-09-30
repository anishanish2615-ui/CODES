package DSA;

public class overloading {
    public static void main(String[] args) {
        fun(78);
        fun("anish");
    }
    static void fun(int q){
        System.out.println(q);

    }
    static void fun(String q){
        System.out.println(q);
    }
}
