package collections1;

import java.util.ArrayList;
import java.util.List;

public class lists {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Anish");
        list.add("MAX verstappen");
        list.add("Lewis hamilton");

        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list);

        list.remove("MAX verstappen");
        System.out.println(list);
        System.out.println(list.contains("MAX verstappen"));


    }
}


