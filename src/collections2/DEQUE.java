package collections2;

import java.util.ArrayDeque;
import java.util.Deque;

public class DEQUE {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque();

        deque.add("anish");
        deque.add("danish");
        deque.add("Sam curran");

        System.out.println(deque.pop());
        System.out.println(deque);
    }
}
