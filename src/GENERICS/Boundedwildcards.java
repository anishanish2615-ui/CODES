package GENERICS;

import java.util.List;

public class Boundedwildcards {
    static double sumnumbers(List<? extends Number> list){
        double sum = 0;
        for(Number n:list){
            sum+=n.doubleValue();

        }
        return sum;

    }
    public  static void main(String[] args){
        System.out.println(sumnumbers(List.of(1, 2, 3, 4, 5)));
        System.out.println(sumnumbers(List.of(1.5,2.5,3.5)));
    }
}
