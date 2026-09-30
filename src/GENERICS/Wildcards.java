package GENERICS;

import java.util.List;

public class Wildcards {

        static void printList(List<?>list){
            for(Object item:list){
                System.out.println(item);

            }
        }
        public static void main(String[] args) {
            printList(List.of(1, 2, 3, 4, 5));
            printList(List.of("a","b","c","d","e"));

        }

}
