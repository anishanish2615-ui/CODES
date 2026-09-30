package DSA;

import java.util.Arrays;

public class variablelengthargs {
    public static void main(String[] args) {
        variable(1,2,3,4,5,6,7,8,8,4,5,6,4,8,55,44,55);

    }
    static void variable(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
