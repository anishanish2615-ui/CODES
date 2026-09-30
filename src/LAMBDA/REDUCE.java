package LAMBDA;

import java.util.List;

public class REDUCE {
    //combines everything into one
    public static void main(String[] args) {
        List<Integer>nums=List.of(1,6,7,4,3,2);
        int sum=nums.stream()
                .reduce(0, (a,b)->a+b);
        System.out.println(sum);
    }
}
