package collections2;
import java.util.*;
import java.util.LinkedList;

public class QUEUE {
    public static void main(String[] args){
        Queue<String> queue=new LinkedList<>();
        queue.add("ebenezer");
        queue.add("harren");
        queue.add("anish");


        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue);

    }
}
