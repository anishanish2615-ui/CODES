package LAMBDA;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class STREAMS2 {
    public static void main(String[] args) {
        List<String> names= List.of("anish","harren","ebenezer","jane");

        List<String> upper=names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upper);

        List<String> shortnames=names.stream()
                .filter(n->n.length()<=4)
                .collect(Collectors.toList());
        System.out.println(shortnames);

        List<String> sorted=names.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sorted);

        long count =names.stream()
                .filter(n->n.length()<=4)
                .count();
        System.out.println(count);

        names.stream().forEach(n->System.out.println("hi "+n));

    }
}
