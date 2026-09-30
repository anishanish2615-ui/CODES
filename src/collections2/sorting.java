package collections2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sorting {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(9);
        list.add(2);

        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);
    }
}
