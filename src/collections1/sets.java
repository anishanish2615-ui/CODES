package collections1;

import java.util.HashSet;
import java.util.Set;

public class sets {
    public static void main(String[] args) {
        Set names = new HashSet();
        names.add("Max");
        names.add("Anish");
        names.add("Charles leclerc");

        System.out.println(names);
        System.out.println(names.contains("Max"));

    }
}
